package net.xiaoluo.crazyit.crazyjava.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AccessExceptionMsg {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("a.txt"));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
