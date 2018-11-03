package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.HashMap;

public class HashMapErrorTest {
    public static void main(String[] args) {
        HashMap<HashtableTest.A, String> hm = new HashMap<>();
        hm.put(new HashtableTest.A(100), "crazy java");
        hm.put(new HashtableTest.A(200), "crazy ios");
        System.out.println(hm);

        HashtableTest.A first = hm.keySet().iterator().next();
        first.count = 200;
        System.out.println(hm);

        hm.remove(new HashtableTest.A(200));
        System.out.println(hm);

        System.out.println(hm.get(new HashtableTest.A(200)));
        System.out.println(hm.get(new HashtableTest.A(100)));
    }
}
