package net.xiaoluo.crazyit.crazyjava.flowarray;

public class Temp {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str5 = "abcdef";
        String str3 = str1 + str2;
        String str4 = str1 + str2;
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str5.hashCode());
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str5 == str4);
    }
}

interface interface1 {
    default void test() {

    }

    void test1();
}

interface interface2 {
    default void test() {

    }

    void test1();
}

interface interface3 extends interface1, interface2 {

    @Override
    default void test() {

    }
}
