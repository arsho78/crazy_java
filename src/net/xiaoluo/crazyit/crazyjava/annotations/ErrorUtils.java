package net.xiaoluo.crazyit.crazyjava.annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ErrorUtils {
    public static void faultyMethod(List<String>... listStrArray) {
        List[] listArray = listStrArray;
        List<Integer> myList = new ArrayList<>();
        myList.add(new Random().nextInt(100));
        listArray[0] = myList;
        String s = listStrArray[0].get(0);
    }
}
