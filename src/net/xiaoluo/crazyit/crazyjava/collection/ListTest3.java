package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListTest3 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add("book1");
        books.add("book12");
        books.add("book123");
        books.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(books);
        books.replaceAll(ele -> ((String) ele).length());
        System.out.println(books);

    }
}
