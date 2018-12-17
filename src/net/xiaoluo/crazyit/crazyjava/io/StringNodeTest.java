package net.xiaoluo.crazyit.crazyjava.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
    public static void main(String[] args) {
        char[] chars = new char[32];
        int hasRead = 0;
        String str = "line1\n" +
                     "line2\n" +
                     "line3\n" +
                     "line4\n";
        try (StringReader reader = new StringReader(str)) {
            while ((hasRead = reader.read(chars)) > 0) {
                System.out.println(new String(chars, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }//end of try

        try (StringWriter writer = new StringWriter(20)) {
            writer.write("newline1\n");
            writer.write("newline2\n");
            writer.write("newline3\n");
            writer.write("newline4\n");
            System.out.println(writer.toString());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }//end of try
    }
}
