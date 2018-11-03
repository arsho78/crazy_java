package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map.put("crazy java", 109));
        map.put("crazy ios", 10);
        map.put("crazy ajax", 79);
        map.put("java ee", 99);

        System.out.println(map.put("crazy ios", 99));
        System.out.println(map);

        System.out.println(map.containsKey("crazy ios"));
        System.out.println(map.containsValue(99));

        for (String key : map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
        map.remove("crazy ajax");
        System.out.println(map);
    }
}
