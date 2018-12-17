package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteTeacher {
    public static void main(String[] args) {
        Person student = new Person("孙悟空", 10);
        Teacher teacher1 = new Teacher("如来佛", student);
        Teacher teacher2 = new Teacher("观世音", student);
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("teacher.txt"))) {
            output.writeObject(teacher1);
            output.writeObject(teacher2);
            output.writeObject(student);
            output.writeObject(teacher2);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } //end try
    }
}
