package com.pandas.learn.wj.studyfile.day20_08_19.test2;

import java.util.Objects;

/**
 * @author wangjing
 * @create 2020-08-19 15:48
 */
public class Person {
    private String neme;
    private int age;
    Integer a;

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public String getNeme() {
        return neme;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // 手动重写
//    public boolean equals(Object obj){
//        if(obj == null){
//            return false;
//        }
//        if(obj instanceof Person){
//            Person person = (Person) obj;
//            return person.getNeme().equals(getNeme()) && person.getAge() == getAge();
//        }
//        return false;
//    }

    // 自动重写
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getNeme().equals(person.getNeme());
    }

}
