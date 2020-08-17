package com.pandas.learn.wj.studyfile.day20_08_15.exc3;

/**
 * @author wangjing
 * @create 2020-08-15 10:25
 */
public class PlainRectTest {
    public static void main(String[] args) {
        PlainRect plainRect = new PlainRect(10, 10, 10, 20);
        System.out.println("面积： " + plainRect.area());
        System.out.println("周长： " + plainRect.perimeter());
        if(plainRect.isInside(25.5, 13)){
            System.out.println("点(25.5，13)在矩形内");
        }
        else System.out.println("点(25.5，13)不在矩形内");


    }
}
