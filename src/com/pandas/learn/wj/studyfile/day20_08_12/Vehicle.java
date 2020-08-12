package com.pandas.learn.wj.studyfile.day20_08_12;

/**
 * @author wangjing
 * @create 2020-08-12 14:18
 *
 * 请定义一个交通工具(Vehicle)的类，其中有:
 * 属性：速度(speed)，车的类型(type)等等
 * 方法：移动(move())，设置速度(setSpeed(double s))，
 * 加速speedUp(double s),减速speedDown(double s)等等.
 * 最后在测试类Vehicle中的main()中实例化一个交通工具对象，
 * 并通过构造方法给它初始化speed,type的值，并且打印出来。
 * 另外，调用加速，减速的方法对速度进行改变
 */
public class Vehicle {
    private double speed;
    private String type;

    public Vehicle(String type, double speed){
        this.type = type;
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void speedUp(double s){
        this.speed += s;
    }

    public void speedDown(double s){
        this.speed -= s;
    }

    public void move(){
        System.out.println("车型：" + type + "\t速度：" + speed);
    }
}
