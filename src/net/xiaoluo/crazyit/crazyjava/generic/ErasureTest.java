package net.xiaoluo.crazyit.crazyjava.generic;

public class ErasureTest {
    public static void main(String[] args) {
        Apple<Integer> a = new Apple<>(10);
        System.out.println(a.getSize());
        Apple b = a;
        Number size = b.getSize();
//        Integer size1 = b.getSize();
    }

    static class Apple<T extends Number> {
        T size;

        public Apple(T size) {
            this.size = size;
        }

        public T getSize() {
            return size;
        }

        public void setSize(T size) {
            this.size = size;
        }
    }
}


