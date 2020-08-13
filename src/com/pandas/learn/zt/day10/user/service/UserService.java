package com.pandas.learn.zt.day10.user.service;

import com.pandas.learn.zt.day10.user.model.UserInfo;
/*处理用户功能逻辑*/
public class UserService {
    private UserInfo[] usersInfo;
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
//   构造用户数组
    public UserService(int count) {
        UserInfo[] users = new UserInfo[count];
    }
//    查看所有用户信息
/*    public UserInfo[] getUsersInfo (){

    }*/
}
