package com.pandas.learn.wj.studyfile.day20_08_20.test03;

/**
 * @author wangjing
 * @create 2020-08-20 15:32
 */
public class VehiclesTest {
    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles("奔驰", "黑色");
        vehicle.run();
        vehicle.showInfo();

        Car car = new Car("奔驰", "黑色", 4);
        car.showCar();

        Truck truck = new Truck("奔驰", "黑色", 20.5f);
        truck.showTruck();
    }
}
