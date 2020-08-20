package com.pandas.learn.wj.studyfile.day20_08_18.exc3;

/**
 * @author wangjing
 * @create 2020-08-18 15:29
 */
public class Rect extends MyShape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void getLength() {
        System.out.println((width + height) * 2);
    }

    @Override
    public void getArea() {
        System.out.println(width * height);
    }
}
