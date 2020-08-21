package com.pandas.learn.wj.studyfile.day20_08_20.test05;

/**
 * @author wangjing
 * @create 2020-08-20 15:49
 */
public class WithMonkey extends Master {

    public WithMonkey(){
        super("猴子");
    }

    @Override
    public void feed() {
        System.out.println("猴子吃香蕉");
    }
}
