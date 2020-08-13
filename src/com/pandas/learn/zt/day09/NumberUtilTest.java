package com.pandas.learn.zt.day09;

public class NumberUtilTest {
    public static void main(String[] args) {
        NumberUtil nu = new NumberUtil();
        System.out.println(nu.add(11,1));
        System.out.println(nu.add(12.322,123.33));
        System.out.println(nu.sub(0,2));
        System.out.println(nu.sub(12.3,2.000));
        System.out.println(nu.ride(12,2));
        System.out.println(nu.ride(12.00,2.4));
        System.out.println(nu.division(12,0));
        System.out.println(nu.division(11.11,1));
    }
}
