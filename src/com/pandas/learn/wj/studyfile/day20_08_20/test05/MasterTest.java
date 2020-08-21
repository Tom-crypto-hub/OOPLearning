package com.pandas.learn.wj.studyfile.day20_08_20.test05;

/**
 * @author wangjing
 * @create 2020-08-20 15:50
 */
public class MasterTest {
    public static void main(String[] args) {
        String animal = "Bird";

        Master master = null;
        switch (animal){
            case "狮子":
            case "Lion":
                master = new WithLion();
                break;
            case "猴子":
            case "Monkey":
                master = new WithMonkey();
                break;
            case "鸟":
            case "Bird":
                master = new WithBird();
                break;
            default:
                System.out.println("请输入正确的喂养动物");
                break;
        }
        master.feed();
    }
}