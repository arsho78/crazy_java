package net.xiaoluo.crazyit.crazyjava.reflect;

public class GunDog implements Dog {
    @Override
    public void info() {
        System.out.println("我是一只猎狗");
    }

    @Override
    public void run() {
        System.out.println("我在快速奔跑");
    }
}
