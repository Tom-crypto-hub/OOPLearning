package com.pandas.wj.learn;

/**
 * @author wangjing
 * @create 2020-08-12 8:37
 */
public class Person {
    private String name;
    private int age;

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

    public void show(){
        System.out.println("name: " + name + "\tage" + age);
    }

}
