package com.pandas.learn.wj.studyfile.day20_08_17.exc;

/**
 * @author wangjing
 * @create 2020-08-17 19:14
 */
public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, 20);
        System.out.println(vehicle.toString());

        Car car = new Car(4, 18, 5);
        System.out.println(car.toString());

        Truck truck = new Truck(4, 35, 2, 20);
        System.out.println(truck.toString());

    }
}
