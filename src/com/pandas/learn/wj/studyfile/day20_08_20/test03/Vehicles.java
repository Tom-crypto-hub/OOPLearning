package com.pandas.learn.wj.studyfile.day20_08_20.test03;

/**
 * @author wangjing
 * @create 2020-08-20 15:25
 */
public class Vehicles {
    // 商标
    private String brand;
    // 颜色
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void run(){
        System.out.println("我已经开动了");
    }

    public void showInfo(){
        System.out.println("商标：" + brand + "，颜色：" + color);
    }


}
