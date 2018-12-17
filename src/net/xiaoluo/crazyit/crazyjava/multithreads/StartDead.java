package net.xiaoluo.crazyit.crazyjava.multithreads;

public class StartDead implements Runnable {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        } //end for
    }

    public static void main(String[] args) {
        StartDead sd = new StartDead();
        Thread t = null;
        for (int i = 0; i < 300; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                t = new Thread(sd, "新线程");
                t.start();
                System.out.println(t.isAlive());
            } //end if
            if (i > 20 && !t.isAlive()) {
                t.start();
            }
        }
    }
}
