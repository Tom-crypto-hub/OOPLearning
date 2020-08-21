package com.pandas.learn.wj.studyfile.day20_08_20.test04;

/**
 * @author wangjing
 * @create 2020-08-20 15:40
 */
public class Car extends Auto {
    // 空调
    private String air;
    // CD
    private int CD;

    public String getAir() {
        return air;
    }

    public void setAir(String air) {
        this.air = air;
    }

    public int getCD() {
        return CD;
    }

    public void setCD(int CD) {
        this.CD = CD;
    }

    public Car(String air) {
        this.air = air;
    }

    public Car(int tiresNum, String color, double weight, double speed, String air, int CD) {
        super(tiresNum, color, weight, speed);
        this.air = air;
        this.CD = CD;
    }

    @Override
    public void addSpeed(double speed) {
        super.addSpeed(speed);
    }

    @Override
    public void subSpeed(double speed) {
        super.subSpeed(speed);
    }

    @Override
    public void spot() {
        super.spot();
    }
}
