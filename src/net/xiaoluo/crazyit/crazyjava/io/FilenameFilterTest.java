package net.xiaoluo.crazyit.crazyjava.io;

import java.io.File;

public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File(".");
        String[] files = file.list((dir, name) -> name.endsWith("java") ||
                                                  new File(name).isDirectory());
        for (String fileName : files) {
            System.out.println(fileName);
        }
    }
}
