package com.pandas.learn.wj.studyfile.day20_08_15.exc3;

/**
 * @author wangjing
 * @create 2020-08-15 10:19
 */
public class PlainRect extends Rect {
    protected double startX;
    protected double startY;

    public PlainRect(){
        super();
        startX = 0;
        startY = 0;
    }

    public PlainRect(double startX, double startY, double width, double height){
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    // 判断某一点是否在矩形内
    public boolean isInside(double x,double y){
        return (!(x >= startX) || !(x <= startX + height))
                && (!(y <= startY) || !(y >= startY + width));
    }
}
