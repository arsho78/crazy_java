package net.xiaoluo.crazyit.crazyjava.multithreads;

public class PriorityTest implements Runnable {
    private int i;

    @Override
    public void run() {
        for (; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i +
                               ", 优先级为： " + Thread.currentThread().getPriority());
        } //end for
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i +
                               ", 优先级： " + Thread.currentThread().getPriority());
            if (i == 20) {
                Thread tLow = new Thread(new PriorityTest(), "低级");
                tLow.start();
                System.out.println("将优先级从" + tLow.getPriority() + "调整到最低" + Thread.MIN_PRIORITY);
                tLow.setPriority(Thread.MIN_PRIORITY);
            } //end if

            if (i == 40) {
                Thread tHigh = new Thread(new PriorityTest(), "高优先级线程");
                tHigh.start();
                System.out.println("将优先级从" + tHigh.getPriority() + "调整到最低" + Thread.MAX_PRIORITY);
                tHigh.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
