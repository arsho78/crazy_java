package net.xiaoluo.crazyit.crazyjava.io;

import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("RandomAccessFileTest.java", "r")) {
            System.out.println("起始位置：  " + raf.getFilePointer());
            byte[] bytes = new byte[1024];
            int hasRead = 0;
            raf.seek(300);

            while ((hasRead = raf.read(bytes)) > 0) {
                System.out.println(new String(bytes, 0, hasRead));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }//end of try
    }
}
