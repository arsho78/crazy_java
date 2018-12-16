package net.xiaoluo.crazyit.crazyjava.multithreads;

public class InvokeRun extends Thread {
  private int i;

  public InvokeRun(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + "" + i);
      //System.out.println(getName() + " " + i);
    } //end for
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
      if (i == 20) {
        new InvokeRun("线程A").run();
        new InvokeRun("线程B").run();
      } //end if
    } //end for
  }
}
