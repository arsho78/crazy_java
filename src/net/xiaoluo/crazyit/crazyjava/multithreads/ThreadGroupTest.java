package net.xiaoluo.crazyit.crazyjava.multithreads;

public class ThreadGroupTest {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("我的线程组");
        ThreadGroup mainTg = Thread.currentThread().getThreadGroup();
        System.out.println(mainTg.getName());
        System.out.println(mainTg.isDaemon());
        tg.setDaemon(true);
        System.out.println(tg.isDaemon());
        new Thread(tg, () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "线程1").start();
        new Thread(tg, () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "线程2").start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(tg.isDestroyed());
    }
}
