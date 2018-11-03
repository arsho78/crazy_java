package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> map = new WeakHashMap<>();
        map.put(new String("java"), 100);
        map.put(new String("ios"), 200);
        map.put(new String("ajax"), 300);
        map.put("android", 400);

        System.out.println(map);

        System.gc();
        System.runFinalization();

        System.out.println(map);
    }
}
