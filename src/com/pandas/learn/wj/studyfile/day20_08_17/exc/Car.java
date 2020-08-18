package com.pandas.learn.wj.studyfile.day20_08_17.exc;

/**
 * @author wangjing
 * @create 2020-08-17 19:03
 */
public class Car extends Vehicle {
    private int loader;

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public Car(){
        super();
        loader = 4;
    }

    public Car(int wheels, double weight, int loader){
        super(wheels, weight);
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car: " + "车轮数：" + getWheels() + "，车重：" + getWeight() +
                "kg，限载人数：" + loader +
                "人。";
    }
}
