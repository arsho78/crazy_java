package net.xiaoluo.crazyit.crazyjava.generic;

import java.util.ArrayList;
import java.util.List;

public class ErasureTest2 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        List l2 = l1;
        List<String> l3 = l2;
        System.out.println(l3.get(0));
    }
}
