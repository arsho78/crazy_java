package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
    public static void main(String[] args) {

        Collection books = new HashSet<>();
        books.add("martin");
        books.add("joe");
        books.add("kate");

        Iterator it = books.iterator();
        while (it.hasNext()) {
            String book = (String) it.next();
            if (book.equals("joe")) {
                books.remove(book);
            }
        }

    }
}
