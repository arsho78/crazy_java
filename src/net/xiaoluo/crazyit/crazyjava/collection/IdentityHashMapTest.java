package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put(new String("java"), 100);
        map.put(new String("jav"), 200);
        map.put("java", 300);
        System.out.println(map);

        map.put("java", 400);
        System.out.println(map);
    }
}
