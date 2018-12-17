package net.xiaoluo.crazyit.crazyjava.flowarray;

public class Num2Rmb {
    static String[] rmbUnit = {"元", "角", "分"};

    static String convert(String num) {
        String result = "";
        if (validate(num)) {
            num = "" + Double.parseDouble(num);
            String[] parts = num.split("\\.");
            String zhengShu = parts[0];
            String xiaoShu = "";
            if (parts.length > 1) {
                xiaoShu = parts[1];
            }
            return "金额： " + convertZhengShu(zhengShu) + convertXiaoShu(xiaoShu);
        } else return "无效金额";
    }

    static String[] divideNum(String numStr) {
        String[] result = numStr.split("\\.");
        return result;
    }

    static String convertZhengShu(String zhengShu) {
        if (Integer.parseInt(zhengShu) == 0) {
            return CNNumber.cnNumber[0] + rmbUnit[0];
        }
        String result = "";
        boolean isFirstZero = true;
        boolean isZeroAdded = false;
        char[] digits = zhengShu.toCharArray();
        int bigUnitCount = zhengShu.length() % 4;
        for (int i = 0; i < bigUnitCount; i++) {
            for (int j = 0; j < 4; j++) {

            }
        }
        return null;
    }

    static String convertXiaoShu(String xiaoShu) {
        String result = "";
        if (Integer.parseInt(xiaoShu) != 0) {
            for (int i = 0; i < xiaoShu.length(); i++) {
                if (xiaoShu.charAt(i) != '0') {
                    result += CNNumber.cnNumber[xiaoShu.charAt(i) - '0'] + rmbUnit[i + 1];
                }
            }
        }
        return result;
    }

    /*检验输入数据的正确性*/
    static boolean validate(String numStr) {
        return numStr.matches("(0+|([1-9]\\d{0,11}))(.\\d{1,2})?");
    }
}

class CNNumber {
    static String[] cnNumber = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    //    small units are repeatable
    static String[] smallUnits = {"", "拾", "百", "千"};
    //    big units are normmaly not repeatable
    static String[] bigUnits = {"万", "亿", "兆"};
}
