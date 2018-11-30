package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

class Custom {
    String name;
    static int MAX_AGE;
}

public class VarHandleTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String[] sa = {"java", "kotlin", "go"};
        VarHandle avh = MethodHandles.arrayElementVarHandle(sa.getClass());
        boolean r = avh.compareAndSet(sa, 2, "go", "lua");
        System.out.println(r);
        System.out.println(Arrays.toString(sa));
        System.out.println(avh.get(sa, 1));
        System.out.println(avh.getAndSet(sa, 2, "swift"));
        System.out.println(Arrays.toString(sa));

        VarHandle vh1 = MethodHandles.lookup().findVarHandle(Custom.class, "name", String.class);
        Custom c1 = new Custom();
//        System.out.println(vh1.get(c1));
        vh1.set(c1, "Tom");
        System.out.println(c1.name);
        VarHandle vh2 = MethodHandles.lookup().findStaticVarHandle(Custom.class, "MAX_AGE", int.class);
        System.out.println(vh2.get());
        vh2.set(200);
        System.out.println(Custom.MAX_AGE);
    }
}
