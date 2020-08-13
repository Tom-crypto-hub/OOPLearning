package com.pandas.project.user_management_system.controller;

import com.pandas.project.user_management_system.model.User;



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
    public User[] show(){
        User[] usersInfo = new User[total];
        for (int i = 0; i <usersInfo.length ; i++) {
            usersInfo[i]=users[i];
        }
        return usersInfo;
    }

    // 新增用户
    public boolean addUser(User user){
        if (users.length<=total){
            cap = cap<<1;
            users[total]=user;
            total++;
            return true;
        }else{
            users[total]=user;
            total++;
        }
        return true;
    }

    // 删除用户
    public boolean delUser(int index){
        if(index > total || index < 0){
            System.out.println("输入的id错误");
            return false;
        }
        for (int i = index-1; i <total-1 ; i++) {
            users[i]=users[i+1];
        }
        users[total-1]=null;
        total--;
        return true;
        //ssssssssssssssssssssss
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
