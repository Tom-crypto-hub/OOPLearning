package com.pandas.learn.zh.person;

import java.util.Random;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Random random = new Random();
        person.setAge(random.nextInt(131));
        System.out.println(person.getAge());
    }
}
