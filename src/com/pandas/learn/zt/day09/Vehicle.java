package com.pandas.learn.zt.day09;
/*4.请定义一个交通工具(Vehicle)的类，其中有:
        属性：速度(speed)，车的类型(type)等等
*/
public class Vehicle {
    private double speed;
    private String type;

    public Vehicle(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }
//    设置速度
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", type='" + type + '\'' +
                '}';
    }

    /*方法：移动(move())，设置速度(setSpeed(doubles))，加速
        speedUp(doubles),减速speedDown(doubles)等等.
    */
//   移动
    public void move(){
        System.out.println("路况良好，开车！"+"\n"+"车速："+speed);
    }
//   加速
    public double speedUp(double up){
        System.out.println("加速，顶得住");
        speed+=up;
        return speed;
    }
//    减速
    public double speedDown(double down){
        System.out.println("交警出没，减速");
        speed-=down;
        return speed;
    }

}
