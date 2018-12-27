package net.xiaoluo.crazyit.crazyjava.reflect;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Properties;

public class ExtendedObjectPoolFactory {
    private HashMap<String, Object> objPool = new HashMap<>();
    private Properties config = new Properties();

    private void init(String fileName) {
        try (FileInputStream in = new FileInputStream(fileName)) {
            config.load(in);
        } catch (IOException ioe) {
            System.out.println("读取配置文件" + fileName + "出错");
        } //end try
    }

    private Object createObject(String className) throws ClassNotFoundException,
                                                         NoSuchMethodException,
                                                         IllegalAccessException,
                                                         InstantiationException,
                                                         InvocationTargetException {
        Class<?> clazz = Class.forName(className);
        return clazz.getConstructor().newInstance();
    }

    public Object getObject(String name) {
        return objPool.get(name);
    }

    public void initPool() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (String name : config.stringPropertyNames()) {
            if (!name.contains("%")) {
                objPool.put(name, createObject(config.getProperty(name)));
            } //end if
        } //end for config.stringPropertyNames()
    }

    public void initProperties() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException {
        for (String name : config.stringPropertyNames()) {
            if (name.contains("%")) {
                String[] methodStrArr = name.split("%");
                String methodName = "set" + methodStrArr[1].substring(0, 1).toUpperCase() + methodStrArr[1].substring(1);
                Object obj = objPool.get(methodStrArr[0]);
                Method m = obj.getClass().getMethod(methodName, String.class);
                m.setAccessible(true);
                m.invoke(obj, config.getProperty(name));
            } //end if
        } //end for config.stringPropertyNames()
    }

    public static void main(String[] args) throws Exception {
        ExtendedObjectPoolFactory eopf = new ExtendedObjectPoolFactory();
        eopf.init("extobj.txt");
        eopf.initPool();
        eopf.initProperties();
        System.out.println(eopf.getObject("a"));
    }
}
