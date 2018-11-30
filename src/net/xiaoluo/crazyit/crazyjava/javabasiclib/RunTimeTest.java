package net.xiaoluo.crazyit.crazyjava.javabasiclib;

public class RunTimeTest {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        System.out.println(rt.maxMemory());
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory());
    }
}
