package com.pandas.learn.zt.day09;
/*定义一个人类Person该类中应该有两个私有属性姓名name和年
        龄age。定义构造方法用来初始化属性。再定义显示display方法将
        姓名和年龄打印出来。编写测试类在main方法中创建人类的实例然
        后将信息显示。*/
public class Person {
    private String name;
    private int age;

    public void display(){
        System.out.println("姓名:"+name+" "+"年龄："+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
