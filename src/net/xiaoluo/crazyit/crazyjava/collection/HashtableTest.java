package net.xiaoluo.crazyit.crazyjava.collection;

import java.util.Hashtable;

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<HashtableTest.A, Object> ht = new Hashtable<>();
        ht.put(new A(6000), "crazy java");
        ht.put(new A(875), "java ee");
        ht.put(new A(123), new B());
        System.out.println(ht);

        System.out.println(ht.containsValue("test"));

        System.out.println(ht.containsKey(new A(123)));
        ht.remove(new A(875));
        System.out.println(ht);
    }

    static class A {
        int count;

        public A(int count) {
            this.count = count;
        }

        @Override
        public int hashCode() {
            return this.count;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == A.class) {
                return ((A) obj).count == this.count;
            }
            return false;
        }
    }

    static class B {
        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }

}




