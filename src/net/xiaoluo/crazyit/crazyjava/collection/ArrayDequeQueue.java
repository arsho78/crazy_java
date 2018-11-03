package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.ArrayDeque;

public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque<String> books = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            books.offerLast("book" + i);
        }
        System.out.println(books);
        for (int i = 0; i < 5; i++) {
            System.out.println(books.poll());
        }

    }
}
