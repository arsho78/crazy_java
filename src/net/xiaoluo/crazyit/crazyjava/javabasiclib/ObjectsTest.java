package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.util.Objects;

public class ObjectsTest {
    static ObjectsTest obj;

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(obj));
        System.out.println(Objects.toString(obj));
        System.out.println(Objects.requireNonNull(obj, "should not be null"));
    }
}
