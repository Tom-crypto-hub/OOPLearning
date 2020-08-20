package com.pandas.learn.wj.studyfile.day20_08_18.exc3;

/**
 * @author wangjing
 * @create 2020-08-18 15:31
 */
public class Circle extends MyShape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(Math.PI * radius * radius);
    }

    @Override
    public void getLength() {
        System.out.println(Math.PI * radius * 2);
    }
}
