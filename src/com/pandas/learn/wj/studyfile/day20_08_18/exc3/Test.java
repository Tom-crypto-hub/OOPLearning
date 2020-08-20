package com.pandas.learn.wj.studyfile.day20_08_18.exc3;

/**
 * @author wangjing
 * @create 2020-08-18 15:33
 */
public class Test {
    public static void print(MyShape m){
        m.getArea();
        m.getLength();
    }

    public static void main(String[] args) {
        print(new Rect(10, 20));

        print(new Circle(5));
    }


}
