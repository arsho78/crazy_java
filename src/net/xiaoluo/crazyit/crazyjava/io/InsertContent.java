package net.xiaoluo.crazyit.crazyjava.io;

import java.io.*;
import java.util.Objects;

public class InsertContent {
    public static void insert(String fileName, long pos, CharSequence charSequence) throws IOException {

        File temp = File.createTempFile("tmp", null);
        temp.deleteOnExit();
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
             FileInputStream tmpInput = new FileInputStream(temp);
             FileOutputStream tmpOutput = new FileOutputStream(temp)) {

            raf.seek(pos);
            int hasRead = 0;
            byte[] buf = new byte[1024];
            while ((hasRead = raf.read(buf)) > 0) {
                tmpOutput.write(buf, 0, hasRead);
            } //end while
            raf.seek(pos);
            raf.write(Objects.toString(charSequence).getBytes());
            while ((hasRead = tmpInput.read(buf)) > 0) {
                raf.write(buf, 0, hasRead);
            } //end while
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } //end try
    }

    public static void main(String[] args) throws IOException {
        insert("out.txt", 0, "new inserted content \n");
    }
}
