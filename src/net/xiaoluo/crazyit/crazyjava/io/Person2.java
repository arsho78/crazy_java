package net.xiaoluo.crazyit.crazyjava.io;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person2 implements Serializable {

    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Object writeReplace() throws ObjectStreamException {
        List<Object> list = new ArrayList<>();
        list.add(name);
        list.add(age);
        System.out.println(list);
        System.out.println("executing writereplace");
        return list;
    }

}
