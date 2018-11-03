package net.xiaoluo.crazyit.crazyjava.collection;


import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
    public static void main(String[] args) {
        Collection books = new HashSet<>();
        books.add("martin");
        books.add("joe");
        books.add("kate");
        books.add("fake1");
        books.add("fake2");
        books.add("fake3");
        System.out.println(books);
        books.removeIf(book -> ((String) book).contains("fake"));
        System.out.println(books);
    }
}
