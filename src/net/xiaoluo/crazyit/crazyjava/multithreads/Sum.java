package net.xiaoluo.crazyit.crazyjava.multithreads;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class Sum {
  public static void main(String[] args) {
    int[] arr = new int[100];
    Random rand = new Random();
    int total = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = rand.nextInt(20);
      total += arr[i];
    }
    System.out.println(total);
    ForkJoinPool pool = ForkJoinPool.commonPool();
    Future<Integer> future = pool.submit(new CalTask(arr, 0, arr.length));
    try {
      System.out.println(future.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
    pool.shutdown();
  }
}

class CalTask extends RecursiveTask<Integer> {
private static final int THRESHOLD = 10;
private int[] arr;
private int start;
private int end;

  public CalTask(int[] arr, int start, int end) {
    this.arr = arr;
    this.start = start;
    this.end = end;
  }

  @Override
  protected Integer compute() {
    int sum = 0;
    if (end - start < THRESHOLD) {
      for (int i = start; i < end; i++) {
        sum += arr[i];
      }
      return sum;
    } else {
      int middle = (start + end) /2;
      CalTask left = new CalTask(arr, start, middle);
      CalTask right = new CalTask(arr, middle, end);
      left.fork();
      right.fork();
      return left.join() + right.join();
    }
  }
}
