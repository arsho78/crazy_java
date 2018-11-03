package net.xiaoluo.crazyit.crazyjava.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {

        Properties props = new Properties();

        props.setProperty("name", "xiao");
        props.setProperty("gender", "male");
        props.setProperty("age", "20");

        System.out.println(props);
        props.store(new FileOutputStream("temp.txt"), "comment line");

        props.setProperty("age", "18");
        System.out.println(props);

        props.load(new FileInputStream("temp.txt"));
        System.out.println(props.getProperty("age"));
    }
}
