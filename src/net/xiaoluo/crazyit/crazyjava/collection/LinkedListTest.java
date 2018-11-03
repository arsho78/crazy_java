package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();

        books.offer("crazy java");
        books.push("java ee");
        books.offerFirst("crazy android");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("iterating: " + books.get(i));
        }
        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}
