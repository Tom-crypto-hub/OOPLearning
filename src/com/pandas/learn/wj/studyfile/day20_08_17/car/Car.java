package com.pandas.learn.wj.studyfile.day20_08_17.car;


import java.util.Objects;

/**
 * @author wangjing
 * @create 2020-08-17 16:10
 */
public class Car {
    // 颜色和型号
    private String color;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(){
        color = "blue";
        model = "宝马";
    }

    public Car(String color, String model){
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car info: " +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '。';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getColor().equals(car.getColor()) &&
                getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getModel());
    }
}
