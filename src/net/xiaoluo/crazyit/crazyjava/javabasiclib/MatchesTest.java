package net.xiaoluo.crazyit.crazyjava.javabasiclib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesTest {
    public static void main(String[] args) {
        String[] mails = {"arhso.qc@gmail.com",
                          "arsho78@163.com",
                          "arsho@uibc.edu",
                          "xia_23a@vim.org",
                          "123+3@abc.org",
                          "_ae@123.com"};
        Pattern p = Pattern.compile("\\w+(\\.?)\\w*@\\w+\\.(com|org|edu)");
        Matcher m = null;
        for (int i = 0; i < mails.length; i++) {
            if (m == null) {
                m = p.matcher(mails[i]);
            } else {
                m = m.reset(mails[i]);
            } //end if
            System.out.println(mails[i] + (m.matches() ? " is" : " is not") + " a valid email");
        } //end for
    }
}
