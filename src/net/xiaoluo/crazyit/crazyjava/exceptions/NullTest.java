package net.xiaoluo.crazyit.crazyjava.exceptions;

import java.util.Date;

public class NullTest {
    public static void main(String[] args) {
        Date date = null;
        try {
            System.out.println(date.after(new Date()));
        } catch (NullPointerException ne) {
            System.out.println("null pointer exception");
        } catch (Exception e) {
            System.out.println("unknown exception");
        }
    }
}
