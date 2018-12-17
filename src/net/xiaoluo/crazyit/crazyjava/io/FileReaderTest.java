package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("FileReaderTest.java");
        char[] chars = new char[32];
        int hasRead = 0;

        while ((hasRead = fr.read(chars)) > 0) {
            System.out.print(new String(chars, 0, hasRead));
        }
        fr.close();
    }
}
