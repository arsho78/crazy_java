package net.xiaoluo.crazyit.crazyjava.generic;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.hashCode() > o2.hashCode() ? 1 :
                        o2.hashCode() > o1.hashCode() ? -1 : 0;
            }
        });
        set1.add("hello");
        set1.add("wa");
        System.out.println(set1);

        TreeSet<String> set2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() > o2.length() ? -1 :
                        o2.length() > o1.length() ? 1 : 0;
            }
        });
        set2.add("hello");
        set2.add("wa");
        System.out.println(set2);
    }
}
