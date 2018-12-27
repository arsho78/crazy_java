package net.xiaoluo.crazyit.crazyjava.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldTest {
    public static void main(String[] args) throws Exception {
        Person p = new Person("old Name", 20);
        System.out.println(p);
        Class<Person> clazz = Person.class;
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p, "new name");
        Field ageField = clazz.getDeclaredField("age");
        ageField.set(p, 30);
        System.out.println(p);
        Field interfaceField = clazz.getField("prStr");
        System.out.println(interfaceField.get(p));
        //interfaceField = clazz.getDeclaredField("prStr");
        //System.out.println(interfaceField.get(p));
        Method m = clazz.getDeclaredMethod("test");
        m.invoke(p);

    }
}

interface ForTest {
    String prStr = "interface string";

    void test();

}

class Person implements ForTest {
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected int age;

    @Override
    public String toString() {
        return "Person[name: " + name +
               ", age: " + age + "]";
    }

    @Override
    public void test() {
        System.out.println("implemented interface method");
    }
}
