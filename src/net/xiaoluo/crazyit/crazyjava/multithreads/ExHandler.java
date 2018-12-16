package net.xiaoluo.crazyit.crazyjava.multithreads;

public class ExHandler {
  public static void main(String[] args) {
    Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
    try {
      int a = 6/0;
      System.out.println("永远不会执行");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("程序正常结束");
  }
}

class MyExHandler implements Thread.UncaughtExceptionHandler{

  @Override
  public void uncaughtException(Thread t, Throwable e) {
    System.out.println(t + "线程出现异常："+ e);
  }
}
