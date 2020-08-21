package com.pandas.learn.wj.studyfile.day20_08_20.test03;

/**
 * @author wangjing
 * @create 2020-08-20 15:28
 */
public class Car extends Vehicles {

    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }

    public void showCar(){
        System.out.println("商标：" + getBrand() + ", 颜色：" + getColor() + ", 座位个数：" + seats);
    }
}
