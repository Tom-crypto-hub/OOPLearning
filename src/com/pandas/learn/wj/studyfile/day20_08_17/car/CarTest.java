package com.pandas.learn.wj.studyfile.day20_08_17.car;

/**
 * @author wangjing
 * @create 2020-08-17 16:16
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("blue", "宝马");
        Car car2 = new Car();
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        if(car1.equals(car2)){
            System.out.println("是同一对象");
        }
        else System.out.println("不是同一对象");
    }
}
