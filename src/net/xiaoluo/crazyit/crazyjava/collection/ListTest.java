package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        System.out.println(books);
        books.add(2, "book4");
        books.stream().forEach(obj -> System.out.println(obj));
        books.remove(2);
        books.stream().forEach(obj -> System.out.println(obj));
        System.out.println(books.indexOf("book1"));
        books.add(1, "book5");
        books.set(books.size() - 1, "book2");
        System.out.println(books);
        System.out.println(books.lastIndexOf("book2"));
    }
}
