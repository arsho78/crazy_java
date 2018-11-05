package net.xiaoluo.crazyit.crazyjava.generic;

public class Apple<T> {
    private T info;

    public Apple() {
    }

    public Apple(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Apple<String> appleString = new Apple<>("apple");
        System.out.println(appleString.getInfo());
        Apple<Double> appleDouble = new Apple<>(2.13);
        System.out.println(appleDouble.getInfo());
    }
}
