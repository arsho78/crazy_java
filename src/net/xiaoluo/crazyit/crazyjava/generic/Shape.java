package net.xiaoluo.crazyit.crazyjava.generic;

import java.util.List;

public abstract class Shape {
    public abstract void draw(Canavas c);
}

class Circle extends Shape {
    @Override
    public void draw(Canavas c) {
        System.out.println("print a circle on " + c);
    }
}

class Rectangle extends Shape {
    @Override
    public void draw(Canavas c) {
        System.out.println("print a Rectangle on " + c);
    }
}

class Canavas {
    public void drawAll(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw(this);
        }
    }
}
