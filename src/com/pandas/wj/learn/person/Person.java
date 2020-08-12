package com.pandas.wj.learn.person;

/**
 * @author wangjing
 * @create 2020-08-12 10:45
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
        if(age >= 0 && age <= 130){
            this.age = age;
        }
        this.age = 18;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(150);
    }
}

