package net.xiaoluo.crazyit.crazyjava.annotations;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class ActionListenerInstaller {
    public static void processAnnotations(Object obj) {
        Objects.requireNonNull(obj, "无法在空对象上安装监听器");
        Class cl = obj.getClass();
        for (Field f : cl.getDeclaredFields()) {
            f.setAccessible(true);
            ActionListenerUser alu = f.getAnnotation(ActionListenerUser.class);
            Object fObj = null;
            try {
                fObj = f.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (alu != null && fObj != null &&
                fObj instanceof AbstractButton) {
                Class<? extends ActionListener> listenerClass = alu.listener();
                ActionListener listener = null;
                try {
                    listener = listenerClass.getDeclaredConstructor().newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                AbstractButton ab = (AbstractButton) fObj;
                ab.addActionListener(listener);
            }

        }
    }
}
