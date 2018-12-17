package net.xiaoluo.crazyit.crazyjava.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadTeacher {
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("teacher.txt"))) {
            Teacher t1 = (Teacher) input.readObject();
            Teacher t2 = (Teacher) input.readObject();
            Person p = (Person) input.readObject();
            Teacher t3 = (Teacher) input.readObject();

            System.out.println(t1 == t2);
            System.out.println(t1.getStudent() == t2.getStudent());
            System.out.println(t1.getStudent() == p);
            System.out.println(t2 == t3);
        } catch (EOFException e) {
            System.out.println("已读完文件");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } //end try
    }
}
