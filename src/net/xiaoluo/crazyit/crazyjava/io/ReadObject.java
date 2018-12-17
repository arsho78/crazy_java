package net.xiaoluo.crazyit.crazyjava.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        String s = "the person's info is:\n\tname: %1s\n\tage: %2s";
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("persons.txt"))) {
            Person[] persons = (Person[]) input.readObject();
            for (Person p : persons) {
                System.out.println(String.format(s, p.getName(), p.getAge()));
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } //end try
    }
}

