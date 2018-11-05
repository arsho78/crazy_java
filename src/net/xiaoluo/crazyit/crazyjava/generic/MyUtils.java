package net.xiaoluo.crazyit.crazyjava.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUtils {
    public static <T> T copy(Collection<T> from, Collection<? super T> to) {
        T last = null;
        for (T ele : from) {
            last = ele;
            to.add(ele);
        }
        return last;
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        copy(integerList, numberList);
        System.out.println(numberList);

    }
}
