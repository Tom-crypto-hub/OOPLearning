package com.pandas.learn.zt.day09;
    /*最后在测试类Vehicle中的main()中实例化一个交通工具对象，
    并通过构造方法给它初始化speed,type的值，并且打印出来。另外，
    调用加速，减速的方法对速度进行改变*/

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle ae86 = new Vehicle(120, "AE86");
        Vehicle tan = new Vehicle(70, "吃尾气的");
        System.out.println(ae86.toString());
        System.out.println(tan.toString());
        tan.setSpeed(60);
        ae86.speedUp(30);
        tan.speedDown(10);
        System.out.println(ae86.getSpeed());
        System.out.println(tan.getSpeed());
    }
}
