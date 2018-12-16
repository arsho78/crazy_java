package net.xiaoluo.crazyit.crazyjava.exceptions;

public class FinallyFlowTest {
    public static void main(String[] args) throws Exception {
        System.out.println(test());
    }

    private static boolean test() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}
