package com.pandas.learn.wj.studyfile.day20_08_20.test03;

/**
 * @author wangjing
 * @create 2020-08-20 15:30
 */
public class Truck extends Vehicles {

    private float load;

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }

    public Truck(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }

    public void showTruck(){
        System.out.println("商标：" + getBrand() + ", 颜色：" + getColor() + ", 载重：" + load);
    }

}
