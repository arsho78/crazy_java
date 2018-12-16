package net.xiaoluo.crazyit.crazyjava.annotations;

import java.lang.reflect.Method;

public class ProcessorTest {
    public static void process(String clazz) throws ClassNotFoundException {
        int passed = 0;
        int failed = 0;
        for (Method m : Class.forName(clazz).getMethods()) {
            if (m.isAnnotationPresent(Testable.class)) {
                try {
                    m.invoke(null);
                    passed++;
                } catch (Exception e) {
                    failed++;
                    System.out.println("method " + "\"" + m.getName() + "\"" + " failed");
                }
            }
        }
        System.out.println("have run " + (passed + failed) + " methods" +
                           ", " + passed + " methods passed" +
                           ", " + failed + " methods failed.");
    }
}
