package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.ArrayDeque;

public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque<String> books = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            books.push("book" + i);
        }
        System.out.println(books);
        for (int i = 0; i < 5; i++) {
            System.out.println(books.pop());
        }

    }
}
