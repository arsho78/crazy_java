package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.TreeMap;

public class TreeMapTest {


    static class R implements Comparable<R> {
        int count;

        public R(int count) {
            this.count = count;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == TreeMapTest.R.class) {
                TreeMapTest.R r = (TreeMapTest.R) obj;
                return r.count == this.count;
            }
            return false;
        }

        @Override
        public String toString() {
            return "R[count:" + count + "]";
        }

        @Override
        public int compareTo(R o) {
            return o.count > this.count ? -1 :
                    this.count > o.count ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        TreeMap<TreeMapTest.R, String> map = new TreeMap<>();
        map.put(new R(100), "crazy java");
        map.put(new R(200), "crazy ios");
        map.put(new R(150), "java ee");

        System.out.println(map);
        System.out.println(map.firstEntry());
        System.out.println(map.lastKey());
        System.out.println(map.higherKey(new R(110)));
        System.out.println(map.lowerEntry(new R(110)));
        System.out.println(map.subMap(new R(101), new R(199)));
    }
}



