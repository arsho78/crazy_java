package net.xiaoluo.crazyit.crazyjava.multithreads;

public class DaemonThread implements Runnable {
  private int i;
  @Override
  public void run() {
    for (; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    } //end for
  }

  public static void main(String[] args) {
    DaemonThread dt = new DaemonThread();
    Thread t = new Thread(dt, "新的后台进程");
    t.setDaemon(true);
    t.start();
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    }
  }
}
