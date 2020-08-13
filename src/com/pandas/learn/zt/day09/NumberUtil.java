package com.pandas.learn.zt.day09;
/*5.定义NumberUtil类，其中属性为：在其中声明方法实现加、减、
        乘、除操作，实现重载。编写测试类进行测试*/
public class NumberUtil {
    public int add(int number1,int number2){
        int add=number1+number2;
        return add;
    }
    public double add(double number1,double number2){
        double add=number1+number2;
        return add;
    }
    public int sub(int number1,int number2){
        int sub=number1-number2;
        return sub;
    }
    public double sub(double number1,double number2){
        double sub=number1-number2;
        return sub;
    }
    public int ride(int number1,int number2){
        int ride=number1*number2;
        return ride;
    }
    public double ride(double number1,double number2){
        double ride=number1*number2;
        return ride;
    }
//    除法除数不能为0
    public int division(int number1,int number2){
        if (number2==0){
            System.out.println("除数不能为0");
            return -1;
        }else {
            int div=number1/number2;
            return div;
        }
    }
    public double division(double number1,double number2){
        if (number2==0){
            System.out.println("除数不能为0");
            return -1;
        }else {
            double div=number1/number2;
            return div;
        }
    }

}
