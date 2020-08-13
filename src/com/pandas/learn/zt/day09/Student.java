package com.pandas.learn.zt.day09;

/*3.猜数字游戏：一个类Student有两个成员变量name、score,定义
        一个方法printScore，对Student类的成员变量score，当score大
        于等于95时，输出当前学生姓名，分数，等级为A,当score大于
        等于80.小于95时，输出当前学生姓名，分数，等级为B,否则输出
        学生姓名、成绩，等级为C。编写测试类*/
public class Student {
    private String name;
    private double scor;

    public Student(String name, double scor) {
        this.name = name;
        this.scor = scor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScor() {
        return scor;
    }

    public void setScor(double scor) {
        this.scor = scor;
    }
    /*方法printScore，对Student类的成员变量score，当score大
    于等于95时，输出当前学生姓名，分数，等级为A,当score大于
    等于80.小于95时，输出当前学生姓名，分数，等级为B,否则输出
    学生姓名、成绩，等级为C。*/
    public void printScore(double scor){
        if(scor>=95){
            System.out.println("'"+name+"'"+" "+"成绩："+this.scor+"等级："+"A");
        }else if (scor>=80&&scor<95){
            System.out.println("'"+name+"'"+" "+"成绩："+this.scor+"等级："+"B");
        }else  {
            System.out.println("'"+name+"'"+" "+"成绩："+this.scor+"等级："+"C");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("人上人", 5);
        Student s2 = new Student("职业选手", 100);
        Student s3 = new Student("平凡之路", 80);
        s1.printScore(s1.scor);
        s2.printScore(s2.scor);
        s3.printScore(s3.scor);
    }
}


