package com.pandas.learn.wj.studyfile.day20_08_12;

/**
 * @author wangjing
 * @create 2020-08-12 13:56
 *
 * 猜数字游戏：一个类Student有两个成员变量name、score,定义一个方法printScore，
 * 对Student类的成员变量score，当score大于等于95时，输出当前学生姓名，分数，等
 * 级为A, 当score大于等于80.小于95时，输出当前学生姓名，分数，等级为B,否则输出
 * 学生姓名、成绩，等级为C。编写测试类
 */
public class Student {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void printScore(){
        if(score >= 95)
            System.out.printf("学生姓名：%s\t分数：%s\t等级为A\n", name, score);
        else if(score >= 80)
            System.out.printf("学生姓名：%s\t分数：%s\t等级为B\n", name, score);
        else
            System.out.printf("学生姓名：%s\t分数：%s\t等级为C\n", name, score);
    }

}
