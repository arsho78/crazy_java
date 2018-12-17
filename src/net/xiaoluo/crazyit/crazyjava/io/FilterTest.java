package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileInputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

public class FilterTest {
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("persons.txt"))) {
            ObjectInputFilter filter = new ObjectInputFilterForObject(Person.class);
            ObjectInputFilter filterForArray = new ObjectInputFilterForArray(Person.class);
            //input.setObjectInputFilter(filter);
            input.setObjectInputFilter(filterForArray);
            Person p = null;
            while ((p = (Person) input.readObject()) != null) {
                System.out.println("读出的个人信息为：\n" +
                                   "\t姓名： " + p.getName() + "\n" +
                                   "\t年龄： " + p.getAge());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } //end try
    }
}

class ObjectInputFilterForObject implements ObjectInputFilter {
    public ObjectInputFilterForObject(Class<?> clazz) {
        this.clazz = clazz;
    }

    Class<?> clazz;

    @Override
    public Status checkInput(FilterInfo filterInfo) {
        System.out.println("开始对象数据检测");
        ObjectInputFilter serialFilter = ObjectInputFilter.Config.getSerialFilter();
        if (serialFilter != null) {
            ObjectInputFilter.Status status = serialFilter.checkInput(filterInfo);
            if (status != Status.UNDECIDED) {
                return status;
            } //end if
        } //end if

        Class<?> serialClass = filterInfo.serialClass();
        if ((serialClass != null) &&
            (serialClass != clazz)) {
            return Status.REJECTED;
        } //end if

        return Status.UNDECIDED;
    }
}

class ObjectInputFilterForArray implements ObjectInputFilter {
    Class<?> clazz;

    public ObjectInputFilterForArray(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public Status checkInput(FilterInfo filterInfo) {
        System.out.println("开始数组对象数据检测");
        ObjectInputFilter serialFilter = ObjectInputFilter.Config.getSerialFilter();
        if (serialFilter != null) {
            ObjectInputFilter.Status status = serialFilter.checkInput(filterInfo);
            if (status != Status.UNDECIDED) {
                return status;
            } //end if
        } //end if

        if (filterInfo.arrayLength() >= 0 &&
            filterInfo.serialClass().getComponentType() != Person.class) {
            System.out.println("发现非Person类数组");
            return Status.REJECTED;
        }

        return Status.UNDECIDED;
    }
}
