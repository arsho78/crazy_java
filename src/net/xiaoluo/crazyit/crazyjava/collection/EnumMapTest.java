package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap<Season, String> map = new EnumMap<Season, String>(Season.class);
        map.put(Season.SPRING, "spring now");
        map.put(Season.SUMMER, "summer now");
        System.out.println(map);
    }
}
