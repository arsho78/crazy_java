package net.xiaoluo.crazyit.crazyjava.javabasiclib;

public class IdentityHashCodeTest {

    public static void main(String[] args) {

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println("s1 has same hashcode as s2? " + (s1.hashCode() == s2.hashCode()));
        System.out.println("s1 has same identity hashcode as s2? " + (System.identityHashCode(s1) == System.identityHashCode(s2)));

        s1 = "java";
        s2 = "java";
        System.out.println("s1 has same hashcode as s2? " + (s1.hashCode() == s2.hashCode()));
        System.out.println("s1 has same identity hashcode as s2? " + (System.identityHashCode(s1) == System.identityHashCode(s2)));
    }
}
