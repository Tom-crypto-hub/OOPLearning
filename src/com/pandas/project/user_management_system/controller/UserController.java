package com.pandas.project.user_management_system.controller;

import com.pandas.project.user_management_system.model.User;

import javax.jws.soap.SOAPBinding;

public class UserController {
    // 用户组
    private User[] users;
    // 用户总数
    private int total;
    // 用户数组容量
    private int cap = 16;

    // 构造方法
    public UserController(){
        users = new User[cap];
    }

    // 获取用户个数
    public int getTotal(){
        return this.total;
    }

    // 获取用户列表
    public void show(){

    }

    // 新增用户
    public boolean addUser(User user){
        return false;
    }

    // 删除用户
    public boolean delUser(User user){
        return false;
    }

    // 修改用户
    public boolean updateUser(User user){
        return false;
    }

    // 查找用户
    public User findUser(int index){
        return new User();
    }

    // 退出
    public int exit(){
        return 0;
    }
}
