package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteToProcess {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("java -classpath /home/xiao/works/crazy_java/out/production/crazy_java net.xiaoluo.crazyit.crazyjava.io.ReadStandard");

        try (PrintStream ps = new PrintStream(p.getOutputStream())) {
            ps.println("普通字符串");
            ps.println(new WriteToProcess());
        } //end of try
    }
}

class ReadStandard {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             PrintStream ps = new PrintStream(new FileOutputStream("out.txt"))) {
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                ps.println("键盘输入的内容是： " + sc.next());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }//end of try
    }
}
