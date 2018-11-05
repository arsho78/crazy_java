package net.xiaoluo.crazyit.crazyjava.generic;

public class GenericDiamondTest {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<>(5);
        MyClass<String> mc2 = new <Integer>MyClass<String>(5);
//        MyClass<String> mc3 = new <Integer> MyClass<>(5);
    }
}

class MyClass<E> {
    public <T> MyClass(T t) {
        System.out.println("the value of t is " + t);
    }
}


