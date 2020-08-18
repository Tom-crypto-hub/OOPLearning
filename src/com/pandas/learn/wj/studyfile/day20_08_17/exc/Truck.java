package com.pandas.learn.wj.studyfile.day20_08_17.exc;

/**
 * @author wangjing
 * @create 2020-08-17 19:04
 */
public class Truck extends Car {
    // 限载重
    private double payload;

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public Truck(){
        super();
        payload = 20;
    }

    public Truck(int wheels, double weight, int loader, int payload){
        super(wheels, weight, loader);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck: " + "车轮数：" + getWheels() + "，车重：" + getWeight() +
                "kg，限载人数：" + getLoader() +
                "人，限载重量：" + payload +
                "kg。";
    }
}

// 1 1 1 0 0 0