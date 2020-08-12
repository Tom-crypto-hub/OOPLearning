package com.pandas.learn.wj.studyfile.day20_08_12;

/**
 * @author wangjing
 * @create 2020-08-12 16:06
 *
 * 定义NumberUtil类，其中属性为：在其中声明方法实现加、
 * 减、乘、除操作，实现重载。编写测试类进行测试
 */
public class NumberUtil {
    public static int add(int a, int b){
        return a + b;
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static char add(char a, char b){
        return (char)(a + b);
    }

    public static int sub(int a, int b){
        return a - b;
    }
    public static double sub(double a, double b){
        return a - b;
    }
    public static char sub(char a, char b){
        return (char)(a - b);
    }

    public static int mul(int a, int b){
        return a * b;
    }
    public static double mul(double a, double b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }
    public static double div(double a, double b){
        return a / b;
    }
}
