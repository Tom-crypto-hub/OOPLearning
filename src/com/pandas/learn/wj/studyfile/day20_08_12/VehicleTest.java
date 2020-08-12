package com.pandas.learn.wj.studyfile.day20_08_12;

/**
 * @author wangjing
 * @create 2020-08-12 14:21
 */
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("宝马", 100);
        vehicle.move();
        vehicle.speedDown(20);
        vehicle.move();
        vehicle.speedUp(30);
        vehicle.move();
    }
}
