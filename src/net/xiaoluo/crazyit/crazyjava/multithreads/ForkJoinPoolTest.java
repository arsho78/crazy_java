package net.xiaoluo.crazyit.crazyjava.multithreads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ForkJoinPoolTest {
  public static void main(String[] args) {
    ForkJoinPool pool = new ForkJoinPool();
    pool.submit(new PrintTask(0, 300));
    try {
      pool.awaitTermination(2, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    pool.shutdown();
  }
}
