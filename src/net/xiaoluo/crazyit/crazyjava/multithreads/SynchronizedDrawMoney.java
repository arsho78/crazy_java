package net.xiaoluo.crazyit.crazyjava.multithreads;

public class SynchronizedDrawMoney implements Runnable {
  private Account account;
  private double drawAmount;

  public SynchronizedDrawMoney(Account account, double drawAmount) {
    this.account = account;
    this.drawAmount = drawAmount;
  }

  @Override
  public void run() {
    synchronized (account) {
      if (account.getBalance() >= drawAmount) {
        System.out.println(Thread.currentThread().getName() + "成功取出" + drawAmount);
        try {
          Thread.sleep(1);
        } catch (InterruptedException e) {
          e.printStackTrace();
        } //end try
        account.setBalance(account.getBalance() - drawAmount);
        System.out.println("账户余额： " + account.getBalance());
      } else {
        System.out.println("余额不足");
      }
    }
  }
}
