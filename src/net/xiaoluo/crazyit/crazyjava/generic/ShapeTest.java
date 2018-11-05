package net.xiaoluo.crazyit.crazyjava.generic;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        Canavas c = new Canavas();
        c.drawAll(circleList);
    }
}
