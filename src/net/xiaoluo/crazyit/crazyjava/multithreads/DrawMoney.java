package net.xiaoluo.crazyit.crazyjava.multithreads;

public class DrawMoney implements Runnable {
  private Account account;
  private double drawAmount;

  public DrawMoney(Account account, double drawAmount) {
    this.account = account;
    this.drawAmount = drawAmount;
  }

  @Override
  public void run() {
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
