package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list);
        System.out.println(list.getClass());
        list.add(6);
        list.remove(1);
    }
}
