package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue numbers = new PriorityQueue();
        numbers.add(6);
        numbers.add(-3);
        numbers.add(20);
        numbers.add(18);
        System.out.println(numbers);
//        numbers.forEach(System.out::println);
        System.out.println(numbers.size());
        int size = numbers.size();
        for (int i = 0; i < size; i++) {
            System.out.println(numbers.poll());
        }
    }
}
