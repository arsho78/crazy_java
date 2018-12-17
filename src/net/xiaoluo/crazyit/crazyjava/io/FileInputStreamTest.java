package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
        int hasRead = 0;
        byte[] bytes = new byte[1024];

        try (fis) {
            while ((hasRead = fis.read(bytes)) > 0) {
                System.out.print(new String(bytes, 0, hasRead));
            }
        } //end of try
    }
}
