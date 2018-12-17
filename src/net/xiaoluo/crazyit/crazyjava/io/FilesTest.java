package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesTest {
    public static void main(String[] args) throws Exception {
        Files.copy(Paths.get("src/net/xiaoluo/crazyit/crazyjava/io/FilesTest.java"), new FileOutputStream("a.txt"));
        System.out.println(Files.isHidden(Paths.get("src/net/xiaoluo/crazyit/crazyjava/io/FilesTest.java")));
        List<String> lines = Files.readAllLines(Paths.get("src/net/xiaoluo/crazyit/crazyjava/io/FilesTest.java"), Charset.forName("UTF-8"));
        System.out.println(lines);
        System.out.println(Files.size(Paths.get("src/net/xiaoluo/crazyit/crazyjava/io/FilesTest.java")));
        List<String> poem = new ArrayList<>();
        poem.add("第一行");
        poem.add("第二行");
        Files.write(Paths.get("poem.txt"), poem, Charset.forName("UTF-8"));
        Files.list(Paths.get(".")).forEach(path -> System.out.println(path));
        Files.lines(Paths.get("src/net/xiaoluo/crazyit/crazyjava/io/FilesTest.java"), Charset.forName("UTF-8")).forEach(line -> System.out.println(line));
        FileStore store = Files.getFileStore(Paths.get("."));
        System.out.println(store.getTotalSpace());
        System.out.println(store.getUsableSpace());
    }
}
