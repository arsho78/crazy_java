package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            books.add("book" + i);
        }
        ListIterator<String> it = books.listIterator();

        while (it.hasNext()) {
            it.next();
            it.add("--------------");
        }
        books.stream().forEach(System.out::println);
//        while (it.hasPrevious()) {
//            String s = it.previous();
//            if (s.equals("--------------")) {
//                it.remove();
//            }
//
//        }
        books.removeIf("--------------"::equals);
        System.out.println(books);
    }
}
