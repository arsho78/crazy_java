package net.xiaoluo.crazyit.crazyjava.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

public class MethodParameterTest {
    public static void main(String[] args) throws Exception {
        Class<Test> clazz = Test.class;
        Method method = clazz.getMethod("replace", String.class, List.class);
        System.out.println("replace方法的形参个数为：" + method.getParameterCount());
        Parameter[] parameters = method.getParameters();
        int count = 1;
        for (Parameter para : parameters) {
            if (para.isNamePresent()) {

                System.out.println("参数名：" + para.getName());
                System.out.println("形参类型：" + para.getType());
                System.out.println("泛型类型：" + para.getParameterizedType());
            }
        } //end for parameters
    }
}

class Test {
    public void replace(String str, List<String> list) {

    }
}
