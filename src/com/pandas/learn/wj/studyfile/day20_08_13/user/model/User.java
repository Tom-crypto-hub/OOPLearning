package com.pandas.learn.wj.studyfile.day20_08_13.user.model;

/**
 * @author wangjing
 * @create 2020-08-13 11:42
 */
public class User {
    // 编号id、姓名name、性别gender、年龄age、电话phone、邮箱email
    private int id;
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  id +
                "\t" + name +
                "\t" + gender +
                "\t" + age +
                "\t" + phone +
                "\t" + email;
    }
}
