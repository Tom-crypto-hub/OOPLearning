package com.pandas.learn.wj.studyfile.day20_08_15.exc2;

/**
 * @author wangjing
 * @create 2020-08-15 10:10
 */
public class Monkey {
    protected String name;

    public Monkey (String s){
        name = s;
    }

    public void speak(){
        System.out.println("咿咿呀呀......");
    }

    public void run(){
        System.out.println("我会奔跑");
    }
}
