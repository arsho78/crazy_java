package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add("Martin");
        c.add(6);
        System.out.println("the size of Collection c is " + c.size());

        c.remove(6);
        System.out.println("the size of Collection c is " + c.size());

        System.out.println("does Collection c contains \"Martin\": " + c.contains("Martin"));

        c.add("king");
        System.out.println("items in collection c: " + c);

        Collection books = new HashSet();
        books.add("king");
        books.add("book2");
        System.out.println("does collection c include all items in collection books: " + c.containsAll(books));
        c.removeAll(books);
        System.out.println("items in collection c: " + c);
        c.clear();
        System.out.println("items in collection c: " + c);
        books.retainAll(c);
        System.out.println("items in collection books: " + books);

    }
}
