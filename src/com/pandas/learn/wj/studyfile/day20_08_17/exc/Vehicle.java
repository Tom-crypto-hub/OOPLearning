package com.pandas.learn.wj.studyfile.day20_08_17.exc;

/**
 * @author wangjing
 * @create 2020-08-17 19:02
 *
 * 设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight。
 * 小车类Car是Vehicle的子类，其中包含的属性有载人数loader。卡车类
 * Truck是Car类的子类，其中包含的属性有载重量payload。每个类都有构
 * 造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能。
 */
public class Vehicle {
    private int wheels;
    private double weight;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vehicle(){
        wheels = 4;
        weight = 100;
    }

    public Vehicle(int wheels, double weight){
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "车轮数：" + wheels +
                ", 车重：" + weight +
                "千克。";
    }
}
