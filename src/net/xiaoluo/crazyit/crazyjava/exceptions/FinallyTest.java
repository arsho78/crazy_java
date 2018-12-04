package net.xiaoluo.crazyit.crazyjava.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("a.txt"));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
//            return;
            System.exit(1);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("execute finally block");
        }
    }
}
