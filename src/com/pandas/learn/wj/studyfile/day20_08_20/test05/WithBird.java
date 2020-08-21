package com.pandas.learn.wj.studyfile.day20_08_20.test05;

/**
 * @author wangjing
 * @create 2020-08-20 15:50
 */
public class WithBird extends Master {
    public WithBird(){
        super("鸟");
    }

    @Override
    public void feed() {
        System.out.println("鸟吃米");
    }
}
