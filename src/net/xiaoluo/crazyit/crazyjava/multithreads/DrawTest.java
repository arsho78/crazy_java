package net.xiaoluo.crazyit.crazyjava.multithreads;

public class DrawTest {
    public static void main(String[] args) {
        Account account = new Account("1234", 1000);

/*    new Thread(new DrawMoney(account, 800), "路人甲").start();
    new Thread(new DrawMoney(account, 800), "路人乙").start();*/

/*    new Thread(new SynchronizedDrawMoney(account, 800), "路人甲").start();
    new Thread(new SynchronizedDrawMoney(account, 800), "路人乙").start();*/

/*    SynchronizedAccount synchronizedAccount = new SynchronizedAccount("12345", 1000);
    new Thread(() -> {
      synchronizedAccount.withdraw(800);
    },"路人甲").start();
    new Thread(() -> {
      synchronizedAccount.withdraw(800);
    },"路人乙").start();*/

        AccountWithLock account2 = new AccountWithLock("3333", 1000);
        new Thread(() -> {
            account2.withdraw(800);
        }, "路人甲").start();
        new Thread(() -> {
            account2.withdraw(800);
        }, "路人乙").start();

    }
}
