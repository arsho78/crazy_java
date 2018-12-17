package net.xiaoluo.crazyit.crazyjava.io;

import java.io.RandomAccessFile;

public class AppendContentTest {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("out.txt", "rw")) {
            raf.seek(raf.length());
            for (int i = 0; i < 3; i++) {
                raf.write("new content \n".getBytes());
            } //end for i
        } catch (Exception e) {
            e.printStackTrace();
        } //end try
    }
}
