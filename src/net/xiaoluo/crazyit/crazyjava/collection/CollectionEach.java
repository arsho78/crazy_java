package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionEach {
    public static void main(String[] args) {
        Collection books = new HashSet<>();
        books.add("martin");
        books.add("joe");
        books.add("kate");
        books.forEach(obj -> System.out.println("item: " + obj));
        Iterator it = books.iterator();
        it.forEachRemaining(obj -> System.out.println("item: " + obj));
    }
}
