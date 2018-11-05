package net.xiaoluo.crazyit.crazyjava.generic;

public class A1 extends Apple<String> {
    @Override
    public String getInfo() {
        return "subclass:" + super.getInfo();
    }
}
