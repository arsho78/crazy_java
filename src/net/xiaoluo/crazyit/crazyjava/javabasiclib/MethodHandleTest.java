package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest {
    private static void hello() {
        System.out.println("hello, world");
    }

    private String hello(String name) {
        System.out.println("executing parameterized hello" + name);
        return name + ", 你好";
    }

    public static void main(String[] args) throws Throwable {
        MethodType type = MethodType.methodType(void.class);
        MethodHandle mtd = MethodHandles.lookup().findStatic(MethodHandleTest.class, "hello", type);
        mtd.invoke();

        MethodHandle mtd2 = MethodHandles.lookup().findVirtual(MethodHandleTest.class, "hello",
                                                               MethodType.methodType(String.class, String.class));
        System.out.println(mtd2.invoke(new MethodHandleTest(), "Martin"));
    }
}
