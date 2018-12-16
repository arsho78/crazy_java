package net.xiaoluo.crazyit.crazyjava.multithreads;

public class SecondThread implements Runnable {
  private int i;
  @Override
  public void run() {
    for (; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    } //end for
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
      if (i == 20) {
        SecondThread secondThreat = new SecondThread();
        new Thread(secondThreat, "线程A").start();
        new Thread(secondThreat, "线程B").start();
      } //end if
    } //end for
  }
}

