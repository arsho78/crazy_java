package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(-1);
        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
