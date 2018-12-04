package net.xiaoluo.crazyit.crazyjava.annotations;

public class MyTest {
    @Testable
    public static void m1() {
    }

    public static void m2() {
    }

    @Testable
    public static void m3() {
        throw new IllegalArgumentException("wrong parameters");
    }


    public static void m4() {
    }

    @Testable
    public static void m5() {
    }

    public static void m6() {
    }

    @Testable
    public static void m7() {
        throw new RuntimeException("runtime error occurs");
    }

    public static void m8() {
    }

}
