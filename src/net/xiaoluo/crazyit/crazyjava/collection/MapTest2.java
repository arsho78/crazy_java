package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.HashMap;

public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("crazy java", 109);
        map.put("crazy ios", 99);
        map.put("crazy ajax", 79);

        map.replace("crazy xml", 66);
        System.out.println(map);

        map.merge("crazy ios", 10, (oldVal, param) -> oldVal + param);
        System.out.println(map);

        map.computeIfAbsent("java", (key) -> key.length());
        System.out.println(map);

        map.computeIfPresent("java", (key, value) -> value * value);
        System.out.println(map);
    }
}
