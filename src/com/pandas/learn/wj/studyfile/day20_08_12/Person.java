package com.pandas.learn.wj.studyfile.day20_08_12;

/**
 * @author wangjing
 * @create 2020-08-12 16:51
 *
 *
 * 定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
 * 定义构造方法用来初始化属性。再定义显示display方法将姓名和年龄
 * 打印出来。 编写测试类在main方法中创建人类的实例然后将信息显示。
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("姓名：" + name + "\t年龄：" + age);
    }
}

class PersonTest{
    public static void main(String[] args) {
        Person person = new Person("wj", 20);
        person.display();
    }
}
