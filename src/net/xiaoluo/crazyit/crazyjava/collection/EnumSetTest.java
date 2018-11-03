package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest {

    public static void main(String[] args) {
        EnumSet es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);

        EnumSet es2 = EnumSet.noneOf(Season.class);
        es2.add(Season.SPRING);
        es2.add(Season.SUMMER);
        System.out.println(es2);
        EnumSet es3 = EnumSet.of(Season.SPRING, Season.SUMMER);
        System.out.println(es3);
        EnumSet es4 = EnumSet.range(Season.SPRING, Season.AUTUMN);
        System.out.println(es4);
        EnumSet es5 = EnumSet.complementOf(es4);
        System.out.println(es5);

        Collection c = new HashSet();
        c.add(Season.SPRING);
        c.add(Season.SUMMER);
        EnumSet es6 = EnumSet.copyOf(c);
        System.out.println(es6);
        es6.add("string1");
        System.out.println(es6);
    }
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}
