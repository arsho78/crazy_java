package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroupTest {
    public static void main(String[] args) {
        String str = "phone number 1: 13500004444" + "phone number 2: 13612345678" + "phone number 3: 15898765432";
        Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
        while (m.find()) {
            System.out.println(m.group() + "子串所在位置：" + m.start() + "~" + (m.end() - 1));
        }
    }
}
