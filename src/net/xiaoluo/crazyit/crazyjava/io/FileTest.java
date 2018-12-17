package net.xiaoluo.crazyit.crazyjava.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());

        File file1 = new File("./CHANGELOG.md");
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        File tmpFile = File.createTempFile("aaa", ".txt", file);
        tmpFile.deleteOnExit();
//        File newFile = new File(System.currentTimeMillis() + "");
//        System.out.println("newFile对象是否存在： " + newFile.exists());
//        newfile.createnewfile();
//        newfile.mkdir();
/*        String[] fileList = file.list();
        for (String fileName : fileList) {
            System.out.println(fileName);
        }
        File[] roots = file.listRoots();
        for (File root : roots) {
            System.out.println(root);
        }*/
    }
}
