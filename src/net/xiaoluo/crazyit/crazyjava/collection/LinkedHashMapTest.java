package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> books = new LinkedHashMap<>();
        books.put("crazy java", 109);
        books.put("crazy ios", 99);
        books.put("crazy ajax", 69);

        for (String key : books.keySet()) {
            System.out.println(key + "--->" + books.get(key));
        }
    }
}
