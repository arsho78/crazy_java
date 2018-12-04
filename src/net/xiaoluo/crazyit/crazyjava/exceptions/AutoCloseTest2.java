package net.xiaoluo.crazyit.crazyjava.exceptions;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class AutoCloseTest2 {
    public static void main(String[] args) throws Exception {
        final BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest.java"));
        PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));
        try (br; ps) {
            System.out.println(br.readLine());
            ps.println("new line");
        }
    }
}
