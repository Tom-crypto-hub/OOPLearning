package com.pandas.learn.wj.studyfile.day20_08_20.test04;

/**
 * @author wangjing
 * @create 2020-08-20 15:35
 */
public class Auto {
    // 轮胎个数 汽车颜色 车身重量、速度
    private int tiresNum;
    private String color;
    private double weight;
    private double speed;

    public int getTiresNum() {
        return tiresNum;
    }

    public void setTiresNum(int tiresNum) {
        this.tiresNum = tiresNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Auto(){
        tiresNum = 4;
        color = "red";
        weight = 300;
        speed = 0;
    }

    public Auto(int tiresNum, String color, double weight, double speed) {
        this.tiresNum = tiresNum;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    // 加速
    public void addSpeed(double speed){
        this.speed += speed;
    }

    // 减速
    public void subSpeed(double speed){
        this.speed -= speed;
    }

    // 停车
    public void spot(){
        this.speed = 0;
    }



}
