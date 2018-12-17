package net.xiaoluo.crazyit.crazyjava.multithreads;

import java.util.concurrent.locks.ReentrantLock;

public class AccountWithLock {
    private final ReentrantLock lock = new ReentrantLock();
    private String accountNo;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public AccountWithLock(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (this.balance >= amount) {
                this.balance -= amount;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "取出金额： " + amount +
                                   ", 账户余额为： " + this.balance);
            } else {
                System.out.println("余额不足，" + Thread.currentThread().getName() + "无法取钱");
            }
        } finally {
            lock.unlock();
        }
    }
}
