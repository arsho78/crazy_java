package net.xiaoluo.crazyit.crazyjava.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        byte[] bytes = new byte[1024];
        int hasRead = 0;

        try (FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
             FileOutputStream fos = new FileOutputStream(new File("newFile.txt"))
        ) {
            while ((hasRead = fis.read(bytes)) > 0) {
                fos.write(bytes, 0, hasRead);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }//end of try

    }
}
