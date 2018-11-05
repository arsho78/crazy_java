package net.xiaoluo.crazyit.crazyjava.generic;

public class ArrayErr {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        Number[] numbers = integers;
        numbers[0] = 1;
        numbers[1] = 0.2;
    }
}
