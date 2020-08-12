package com.pandas.learn.wj.studyfile.day20_08_12;

/**
 * @author wangjing
 * @create 2020-08-12 16:06
 */
public class NumberUtilTest {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        System.out.println(NumberUtil.add(a, b));
        System.out.println(NumberUtil.sub(a, b));
        System.out.println(NumberUtil.mul(a, b));
        System.out.println(NumberUtil.div(a, b));

        double c = 15;
        double d = 10;
        System.out.println(NumberUtil.add(c, d));
        System.out.println(NumberUtil.sub(c, d));
        System.out.println(NumberUtil.mul(c, d));
        System.out.println(NumberUtil.div(c, d));
    }
}
