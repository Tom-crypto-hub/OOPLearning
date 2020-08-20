package com.pandas.learn.wj.studyfile.day20_08_18.exc2;

/**
 * @author wangjing
 * @create 2020-08-18 11:37
 */
public class Test {
    public static void main(String[] args) {
        Number num = new Number01();
        System.out.println(num.method(20));
        num = new Number02();
        System.out.println(num.method(20));

        Number01 num2 = new Number01();
        Number numtest = num2;
        System.out.println(numtest.method(15));
    }
}

