package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    static double num = 123456.451;

    public static void main(String[] args) {
        Locale[] locales = {Locale.CHINA, Locale.JAPAN, Locale.US, Locale.GERMAN};
        NumberFormat[] nfs = new NumberFormat[12];

        for (int i = 0; i < locales.length; i++) {
            Locale locale = locales[i];
            nfs[i * 3] = NumberFormat.getNumberInstance(locale);
            nfs[i * 3 + 1] = NumberFormat.getPercentInstance(locale);
            nfs[i * 3 + 2] = NumberFormat.getCurrencyInstance(locale);
        } //end for i

        for (int i = 0; i < locales.length; i++) {
            Locale locale = locales[i];
            String s = null;
            switch (i) {
                case 0:
                    s = "中国制式";
                    break;
                case 1:
                    s = "日本制式";
                    break;
                case 2:
                    s = "美国制式";
                    break;
                case 3:
                    s = "德国制式";
                    break;
            } //end switch i
            System.out.println(s);
            System.out.println(nfs[i * 3].format(num));
            System.out.println(nfs[i * 3 + 1].format(num));
            System.out.println(nfs[i * 3 + 2].format(num));

        } //end for i

    }
}
