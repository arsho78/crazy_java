package net.xiaoluo.crazyit.crazyjava.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromProcessTest {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("tar");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()))) {
            String s = null;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }//end of try
    }
}
