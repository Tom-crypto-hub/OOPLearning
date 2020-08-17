package com.pandas.learn.wj.studyfile.day20_08_15.exc1;

/**
 * @author wangjing
 * @create 2020-08-15 10:04
 */
public class Test {
    public static void main(String[] args) {
        ChinaPeople chinaPeople = new ChinaPeople("张三", "中国人", "功夫");
        chinaPeople.printNationality();
        chinaPeople.showSkill();

        AmericanPeople americanPeople = new AmericanPeople("特朗普", "美国人", "吹牛逼");
        americanPeople.printNationality();
        americanPeople.showSkill();
    }
}
