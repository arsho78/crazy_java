package net.xiaoluo.crazyit.crazyjava.reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Properties;

public class ObjectPoolFactory {
    HashMap<String, Object> objectPool = new HashMap<>();

    private Object createObject(String className) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName(className);
        return clazz.getConstructor().newInstance();
    }

    public void initPool(String fileName) throws IOException,
                                                 IllegalAccessException,
                                                 ClassNotFoundException,
                                                 NoSuchMethodException,
                                                 InvocationTargetException,
                                                 InstantiationException {
        try (FileInputStream in = new FileInputStream(fileName)) {
            Properties properties = new Properties();
            properties.load(in);
            for (String name : properties.stringPropertyNames()) {
                objectPool.put(name, createObject(properties.getProperty(name)));
            } //end for properties.stringPropertyNames()
        }  //end try
    }

    public Object getObject(String name) {
        return objectPool.get(name);
    }

    public static void main(String[] args) throws Exception {
        ObjectPoolFactory pf = new ObjectPoolFactory();
        pf.initPool("obj.txt");
        System.out.println(pf.getObject("a"));
        System.out.println(pf.getObject("b"));
    }

}
