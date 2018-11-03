package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        Iterator it = hs.iterator();
        R r = (R) it.next();
        r.setCount(-3);
        System.out.println(hs);
        hs.remove(new R(-3));
        System.out.println(hs);
        System.out.println("hs是否包含count为-3的R对象" + hs.contains(new R(-3)));
        System.out.println("hs是否包含count为-2的R对象" + hs.contains(new R(-2)));

    }
}

class R implements Comparable<R> {
    @Override
    public int compareTo(R o) {
        return count < o.getCount() ? -1 :
                count == o.getCount() ? 0 : 1;
    }

    private int count;

    public R(int count) {
        this.count = count;
    }

//    @Override
//    public int hashCode() {
//        return this.count;
//    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj != null && obj.getClass() == R.class) {
            return this.count == ((R) obj).getCount() ? true : false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "R[count" + count + "]";
    }
}
