package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter[] formatters = {DateTimeFormatter.ISO_LOCAL_DATE,
                                          DateTimeFormatter.ISO_LOCAL_TIME,
                                          DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                                          DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
                                          DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG),
                                          DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")};
        LocalDateTime date = LocalDateTime.now();
        for (int i = 0; i < formatters.length; i++) {
            DateTimeFormatter formatter = formatters[i];
            System.out.println(date.format(formatters[i]));
            System.out.println(formatter.format(date));
        } //end for i
    }
}
