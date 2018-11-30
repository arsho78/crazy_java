package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale[] locales = Locale.getAvailableLocales();
        for (int i = 0; i < locales.length; i++) {
            Locale locale = locales[i];
            System.out.println(locale.getDisplayCountry(Locale.CHINA) + " = " + locale.getCountry() + ", " +
                               locale.getDisplayLanguage() + " = " + locale.getLanguage());
        } //end for i
    }
}

