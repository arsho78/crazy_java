package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.TreeSet;

public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet<Z> ts = new TreeSet<>();
        Z z = new Z(6);
        ts.add(z);
        System.out.println(ts.add(z));
        System.out.println(ts);
        ts.first().age = 9;
        System.out.println(ts.last().age);

    }
}

class Z implements Comparable<Z> {

    int age;

    public Z(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Z o) {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
