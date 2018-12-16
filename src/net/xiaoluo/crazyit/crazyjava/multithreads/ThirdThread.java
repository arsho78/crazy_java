package net.xiaoluo.crazyit.crazyjava.multithreads;

import java.util.concurrent.FutureTask;

public class ThirdThread {
  public static void main(String[] args) {
    ThirdThread tt = new ThirdThread();
    FutureTask<Integer> task = new FutureTask<>(() ->{
      int i = 0;
      for (; i < 100; i++) {
        System.out.println(Thread.currentThread().getName() + " " + i);
      } //end for
      return i;
    });
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
      if (i == 20) {
        new Thread(task, "线程").start();
      } //end if
    } //end for
    try {
      System.out.println("子线程的返回值: " + task.get());
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
