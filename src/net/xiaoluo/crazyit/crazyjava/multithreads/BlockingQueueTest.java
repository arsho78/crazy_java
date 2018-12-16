package net.xiaoluo.crazyit.crazyjava.multithreads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
  public static void main(String[] args) {
    BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
    new Thread(new Producer(bq), "生产者1").start();
    new Thread(new Producer(bq), "生产者2").start();
    new Thread(new Producer(bq), "生产者3").start();
    new Thread(new Consumer(bq), "消费者1").start();


  }
}

class Producer implements Runnable {
  private BlockingQueue<String> bq;

  public Producer(BlockingQueue<String> bq) {
    this.bq = bq;
  }

  @Override
  public void run() {
    String[] strs = {"java", "spring", "hiberate"};
    for (int i = 0; i < 10; i++) {
      System.out.println("生产者准备生产集合元素");
      try {
        Thread.sleep(200);
        bq.put(strs[i % 3]);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "生产完成" + bq);
    }
  }

}

class Consumer implements Runnable {
private BlockingQueue<String> bq;

  public Consumer(BlockingQueue<String> bq) {
    this.bq = bq;
  }

  @Override
  public void run() {
    while (true) {
      System.out.println("消费者准备消费集合元素");
      try {
        Thread.sleep(200);
        System.out.println("消费者取出并消费了" + bq.take());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "消费完成" + bq);
    }
  }
}
