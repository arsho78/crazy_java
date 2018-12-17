package net.xiaoluo.crazyit.crazyjava.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest {
    public static void main(String[] args) {
        File file = new File("src/net/xiaoluo/crazyit/crazyjava/io/FileChannelTest.java");
        try (FileChannel inChannel = new FileInputStream(file).getChannel();
             FileChannel outChannel = new FileOutputStream("a.txt").getChannel()) {
            MappedByteBuffer buf = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            outChannel.write(buf);
            buf.flip();
            //CharBuffer charBuf = Charset.forName("UTF-8").decode(buf);
            System.out.println(System.getProperty("file.encoding"));
            //System.out.println(charBuf);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } //end try
    }
}
