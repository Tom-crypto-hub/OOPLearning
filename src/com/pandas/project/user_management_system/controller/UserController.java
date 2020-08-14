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
            return false;
        }
        for (int i = index-1; i <total-1 ; i++) {
            users[i]=users[i+1];
        }
        users[total-1]=null;
        total--;
        return true;

    }

    // 修改用户
    public boolean updateUser(User user){
        if(user.getId()-1<0||user.getId()>total){
            System.out.println("当前用户不存在");
            return false;
        }
        users[user.getId()-1]=user;
        return true;
    }

    // 查找用户
    public User findUser(int index){
        if(index-1<0||index>total){
            System.out.println("当前用户不存在");

        }
        return users[index-1];
    }

    // 退出
    public void exit(){
        System.exit(0);
    }
}
