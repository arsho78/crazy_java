package net.xiaoluo.crazyit.crazyjava.exceptions;

public class ThrowTest {
    public static void main(String[] args) {
        int n = 3;
        try {
            throwChecked(-3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        throwRuntime(n);
    }

    public static void throwChecked(int a) throws Exception {
        if (a > 0) {
            throw new Exception("number bigger than 0 is not valid");
        }
    }

    public static void throwRuntime(int a) {
        if (a > 0) {
            throw new RuntimeException("number bigger than 0 is not valid");
        }

    }
}
