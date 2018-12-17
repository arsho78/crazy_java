package net.xiaoluo.crazyit.crazyjava.io;

import java.nio.CharBuffer;

public class BufferTest {
    public static void main(String[] args) {
        CharBuffer buf = CharBuffer.allocate(8);
        System.out.println("capacity: " + buf.capacity());
        System.out.println("limit: " + buf.limit());
        System.out.println("position: " + buf.position());

        buf.put('a');
        buf.put('b');
        buf.put('c');
        System.out.println("--------------------");
        System.out.println("capacity: " + buf.capacity());
        System.out.println("limit: " + buf.limit());
        System.out.println("position: " + buf.position());

        buf.flip();
        System.out.println("--------------------");
        System.out.println("capacity: " + buf.capacity());
        System.out.println("limit: " + buf.limit());
        System.out.println("position: " + buf.position());

        System.out.println(buf.get());
        System.out.println("--------------------");
        System.out.println("capacity: " + buf.capacity());
        System.out.println("limit: " + buf.limit());
        System.out.println("position: " + buf.position());

        buf.clear();
        System.out.println("--------------------");
        System.out.println("capacity: " + buf.capacity());
        System.out.println("limit: " + buf.limit());
        System.out.println("position: " + buf.position());

        System.out.println(buf.get(2));
    }
}
