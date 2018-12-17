package net.xiaoluo.crazyit.crazyjava.flowarray;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InputValidationTest {
    //    测试输入数据校验功能
    @Test
    public void validateTest() {
        Assert.assertTrue(Num2Rmb.validate("123.22"));
        Assert.assertFalse(Num2Rmb.validate("0123.00"));
        Assert.assertTrue(Num2Rmb.validate("123"));
        Assert.assertTrue(Num2Rmb.validate("123.1"));
        Assert.assertTrue(Num2Rmb.validate("0"));
        Assert.assertTrue(Num2Rmb.validate("00"));
        Assert.assertFalse(Num2Rmb.validate("123.000"));
        Assert.assertFalse(Num2Rmb.validate("123."));
    }

    //    测试整数，小数部分分离功能
    @Test
    public void splitTest() {
        String[] parts = null;
        parts = "123.22".split("\\.");
        System.out.println(parts.length);
        Assert.assertEquals(parts[0], "123");
        Assert.assertEquals(parts[1], "22");
        parts = "123.0".split("\\.");
        System.out.println(parts.length);
        Assert.assertEquals(parts[0], "123");
        Assert.assertEquals(parts[1], "0");
        parts = "123".split("\\.");
        System.out.println(parts.length);
        Assert.assertEquals(parts[0], "123");
//        Assert.assertEquals(parts[1], "22");
    }

    //    测试小数部分转换功能
    @Test
    public void xiaoShuConvertTest() {
        Assert.assertEquals(Num2Rmb.convertXiaoShu("01"), "壹分");
        Assert.assertEquals(Num2Rmb.convertXiaoShu("00"), "");
        Assert.assertEquals(Num2Rmb.convertXiaoShu("10"), "壹角");
        Assert.assertEquals(Num2Rmb.convertXiaoShu("0"), "");
    }
}
