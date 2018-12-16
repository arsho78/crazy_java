package net.xiaoluo.crazyit.crazyjava.multithreads;

public class JoinThread implements Runnable {
  private int i;

  @Override
  public void run() {
    for (; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    } //end for
  }

  public static void main(String[] args) {
    JoinThread jt = new JoinThread();
    Thread t = null;

    for (int i = 0; i < 200; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
      if (i == 20) {
        t = new Thread(jt, "被加入的新线程");
        try {
          t.start();
          t.join();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      } //end if
    } //end for
  }
}
