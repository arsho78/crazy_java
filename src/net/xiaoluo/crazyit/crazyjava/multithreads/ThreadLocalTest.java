package net.xiaoluo.crazyit.crazyjava.multithreads;

public class ThreadLocalTest {
    public static void main(String[] args) {
        AccountThreadLocal atl = new AccountThreadLocal("初始账户");
        new Thread(new MyTest(atl), "线程A").start();
        new Thread(new MyTest(atl), "线程B").start();

    }
}

class AccountThreadLocal {
    private ThreadLocal<String> name = new ThreadLocal<>();

    public AccountThreadLocal(String name) {
        this.name.set(name);
        System.out.println("----" + this.name.get());
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }
}

class MyTest implements Runnable {
    private AccountThreadLocal atl;

    public MyTest(AccountThreadLocal atl) {
        this.atl = atl;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                atl.setName(Thread.currentThread().getName());
            }
            System.out.println(atl.getName() + " " + i);
        }
    }
}
