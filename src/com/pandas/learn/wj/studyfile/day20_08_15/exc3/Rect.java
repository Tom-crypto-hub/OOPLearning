package com.pandas.learn.wj.studyfile.day20_08_15.exc3;

/**
 * @author wangjing
 * @create 2020-08-15 10:15
 */
public class Rect {
    protected double width;
    protected double height;

    public Rect(){
        width = 10;
        height = 10;
    }

    public Rect(double width, double height){
        this.width = width;
        this.height = height;
    }

    // 求矩形的面积
    public double area(){
        return width * height;
    }

    // 求矩形的周长
    public double perimeter(){
        return (width + height) * 2;
    }
}
