package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ReplaceTest {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("replace.txt"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("replace.txt"))) {
            Person2 p = new Person2("孙悟空", 100);
            out.writeObject(p);
            ArrayList list = (ArrayList) in.readObject();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        } //end try
    }
}
