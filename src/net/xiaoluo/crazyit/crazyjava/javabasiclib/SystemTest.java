package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws IOException {
        Map<String, String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name + " ---> " + env.get(name));
        }
        System.out.println(System.getenv("PATH"));
        Properties props = System.getProperties();
        props.store(new FileOutputStream("props.txt"), "system properties");
        System.out.println(props.getProperty("os.name"));
    }
}
