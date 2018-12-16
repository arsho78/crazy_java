package net.xiaoluo.crazyit.crazyjava.multithreads;

public class Light {
  private boolean isOn;

  public Light(boolean isOn) {
    this();
    this.isOn = isOn;
  }

  public Light() {
    this.isOn = false;
  }

  public synchronized void on(int i) {
    if (isOn) {
      try {
        this.wait();
        this.on(i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } else {
      this.isOn = true;
      System.out.println(Thread.currentThread().getName() + "第" + i + "次" + "打开了灯");
      notifyAll();
    }
  }

  public synchronized void off(int i) {
    if (!isOn) {
      try {
        this.wait();
        this.off(i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } else {
      this.isOn = false;
      System.out.println(Thread.currentThread().getName() + "第" + i + "次" + "关了灯");
      notifyAll();
    }
  }

  public synchronized void switchOnOff(int i) {
    if (isOn) {
      this.off(i);
    } else {
      this.on(i);
    }
    try {
      wait(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
