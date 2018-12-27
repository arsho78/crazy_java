package net.xiaoluo.crazyit.crazyjava.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) throws Exception {

        MyInvocationHandler handler = new MyInvocationHandler();
        Creature c = (Creature) Proxy.newProxyInstance(Creature.class.getClassLoader(),
                                                       new Class[]{Creature.class},
                                                       handler);
        Creature c1 = (Creature) Proxy.newProxyInstance(Creature.class.getClassLoader(),
                                                        new Class[]{Creature.class},
                                                        handler);
        c.walk();
        c.sayHello("Martin");

        c1.walk();
        c1.sayHello("Xiao");
    }
}

interface Creature {
    void walk();

    void sayHello(String name);
}

class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---正在执行方法： " + method + "---");
        if (args != null) {
            System.out.println("下面是执行方法时传入的实参");
            for (Object arg : args) {
                System.out.println(arg);
            } //end for args
        } else {
            System.out.println("方法没有实参");
        } //end if
        return null;
    }
}
