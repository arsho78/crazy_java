package net.xiaoluo.crazyit.crazyjava.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {
            String s = null;
            while ((s = br.readLine()) != null) {
                if (s.equals("exit")) {
                    System.exit(1);
                } //end if
                System.out.println("input content: " + s);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }//end of try
    }
}
