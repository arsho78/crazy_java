package net.xiaoluo.crazyit.crazyjava.multithreads;

public class FirstThread extends Thread {
  private int i;

  public FirstThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (; i < 100; i++) {
      System.out.println(this.getName() + "" + i);
    } //end for
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
      if (i == 20) {
        new FirstThread("线程A").start();
        new FirstThread("线程B").start();
      } //end if
    } //end for
  }
}
