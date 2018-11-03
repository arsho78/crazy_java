package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.TreeSet;

public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet<R> ts = new TreeSet<>();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));
        System.out.println(ts);
        R first = ts.first();
        first.setCount(6);
        R last = ts.last();
//        last.setCount(-2);
        System.out.println(ts);
        System.out.println(ts.remove(new R(-2)));
        System.out.println(ts);
        System.out.println(ts.remove(new R(5)));
        System.out.println(ts);

//        ts.add(new R(1));
//        ts.add(new R(2));
//        ts.add(new R(4));
//        ts.add(new R(3));
//        ts.add(new R(5));
//        ts.add(new R(6));
//        System.out.println(ts);
//
//        ts.lower(new R(4)).setCount(6);
//        ts.first().setCount(3);
//        System.out.println(ts);
//
//        System.out.println(ts.remove(new R(6)));
//        System.out.println(ts);
//
//        System.out.println(ts.remove(new R(6)));
//        System.out.println(ts);
//
//        System.out.println(ts.first().hashCode());

    }
}
