package net.xiaoluo.crazyit.crazyjava.reflect;


import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

@Repeatable(Annos.class)
@interface Anno {
}

@Retention(value = RetentionPolicy.RUNTIME)
@interface Annos {
    Anno[] value();
}

@SuppressWarnings(value = "unchecked")
@Deprecated
@Anno
@Anno
public class ClassTest {
    private ClassTest() {

    }

    public ClassTest(String name) {
        System.out.println("有参数的构造器");
    }

    public static void main(String[] args) throws Exception {
        Class<ClassTest> clazz = ClassTest.class;
        Constructor[] constructors = clazz.getDeclaredConstructors();
        System.out.println("ClassTest的全部构造器有：");
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        } //end for constructors
        Constructor[] publicConstructors = clazz.getConstructors();
        System.out.println("ClassTest的public构造器包括：");
        for (Constructor c : publicConstructors) {
            System.out.println(c);
        } //end for publicConstructors
        Method[] methods = clazz.getMethods();
        System.out.println("ClassTest的全部public方法：");
        for (Method m : methods) {
            System.out.println(m);
        } //end for methods

        Method m1 = clazz.getMethod("info", String.class);
        System.out.println("ClassTest带参数的info方法为" + m1);

        Annotation[] annotations = clazz.getAnnotations();
        System.out.println("ClassTest使用的Annotation有：");
        for (Annotation a : annotations) {
            System.out.println(a);
        } //end for annotations

        System.out.println("ClassTest上的@SuppressWarning注解为" + Arrays.toString(clazz.getAnnotationsByType(SuppressWarnings.class)));
        System.out.println("ClassTest上的@Anno注解为" + Arrays.toString(clazz.getAnnotationsByType(Annos.class)));

        Class<?>[] inners = clazz.getDeclaredClasses();
        System.out.println("ClassTest包含的内部类有：");
        for (Class c : inners) {
            System.out.println(c);
        } //end for inners

        Class innerClz = Class.forName("net.xiaoluo.crazyit.crazyjava.reflect.ClassTest$Inner");
        System.out.println("Inner类所在的外部类为：" + innerClz.getDeclaringClass());
        System.out.println("ClassTest的包为" + clazz.getPackage());
        System.out.println("ClassTest的父类为" + clazz.getSuperclass());
    }

    public void info() {
        System.out.println("无参数的info方法");
    }

    public void info(String string) {
        System.out.println("有参数的info方法");
    }

    class Inner {
    }
}
