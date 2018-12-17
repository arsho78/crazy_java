package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("poem.txt")) {
            fw.write("title\n");
            fw.write("line1,\n");
            fw.write("line2,\n");
            fw.write("line3,\n");
            fw.write("line4.\n");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }//end of try
    }
}
