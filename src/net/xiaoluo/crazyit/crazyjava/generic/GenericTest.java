package net.xiaoluo.crazyit.crazyjava.generic;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTest {
    static <T> void fromArrayToCollection(T[] arr, Collection<T> collection) {
        for (T t : arr) {
            collection.add(t);
        }
    }

    public static void main(String[] args) {
        Object[] objs = new Object[5];
        Collection<Object> co = new ArrayList<>();
        fromArrayToCollection(objs, co);
        System.out.println(co);
        String[] as = new String[5];
        Collection<String> cs = new ArrayList<>();
        fromArrayToCollection(as, cs);
        System.out.println(cs);
        fromArrayToCollection(as, co);
        System.out.println(co);

        Number[] an = new Number[5];
        Float[] af = new Float[5];
        Integer[] ai = new Integer[5];
        Collection<Number> cn = new ArrayList<>();
        fromArrayToCollection(af, cn);
        System.out.println(cn);
        fromArrayToCollection(ai, cn);
        System.out.println(cn);
        fromArrayToCollection(an, cn);
        System.out.println(cn);
//        fromArrayToCollection(as, cn);
    }
}
