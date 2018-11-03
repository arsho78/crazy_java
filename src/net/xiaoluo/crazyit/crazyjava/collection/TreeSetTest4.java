package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.TreeSet;

public class TreeSetTest4 {
    public static void main(String[] args) {
        TreeSet<M> ts = new TreeSet<>((ele1, ele2) -> {
            return ele1.age < ele2.age ? -1 : ele1.age > ele2.age ? 1 : 0;
        });
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);
    }
}

class M {
    int age;

    @Override
    public String toString() {
        return "M[age:" + age + "]";
    }

    public M(int age) {
        this.age = age;
    }
}
