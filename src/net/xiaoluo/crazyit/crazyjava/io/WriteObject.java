package net.xiaoluo.crazyit.crazyjava.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person p1 = new Person("xiao", 20);
        Person p2 = new Person("martin", 30);
        File file = new File("persons.txt");
        File file1 = new File("persons_array.txt");
        if (file.exists()) {
            file.delete();
        }
        if (file1.exists()) {
            file1.delete();
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
             ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(file1))) {
/*            // 使用集合存储实际对象再序列化集合
            List<Person> list = new ArrayList<>();
            list.add(p1);
            list.add(p2);
            out.writeObject(list);*/

            // 直接序列化对象
            out.writeObject(p1);
            out.writeObject(p2);
            out.writeObject(null);

            //使用数组存储对象再序列化数组
            Person[] persons = {p1, p2};
            out1.writeObject(persons);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } //end try
    }
}
