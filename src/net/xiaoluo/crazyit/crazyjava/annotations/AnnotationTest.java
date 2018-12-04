package net.xiaoluo.crazyit.crazyjava.annotations;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnotationTest {
    private JFrame mainWin = new JFrame("使用注解绑定事件监听器");
    @ActionListenerUser(listener = OkListener.class)
    private JButton ok = new JButton("确定");
    @ActionListenerUser(listener = CancelListener.class)
    private JButton cancel = new JButton("取消");

    public static void main(String[] args) {
        new AnnotationTest().init();
    }

    public void init() {
        JPanel jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);
        mainWin.add(jp);
        ActionListenerInstaller.processAnnotations(this);
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }

}

class OkListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "单击了确认按钮");
    }
}

class CancelListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "单击了取消按钮");

    }
}

