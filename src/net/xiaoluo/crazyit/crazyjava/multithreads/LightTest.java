package net.xiaoluo.crazyit.crazyjava.multithreads;

public class LightTest {
    public static void main(String[] args) {
        Light light = new Light();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                light.switchOnOff(i);
            }
        }, "路人甲").start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                light.switchOnOff(i);
            }
        }, "路人乙").start();
/*    Thread t = new Thread(() -> {
      for (int i = 0; i < 100; i++) {
        light.switchOnOff(i);

      }
    }, "路人丙");
    t.setPriority(Thread.MIN_PRIORITY);
    t.start();*/


    }
}
