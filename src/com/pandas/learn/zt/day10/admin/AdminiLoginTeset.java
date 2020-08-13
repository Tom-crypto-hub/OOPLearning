package com.pandas.learn.zt.day10.admin;

import com.pandas.learn.zt.day10.admin.Administrator;

public class AdminiLoginTeset {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        AdminLogin Login = new AdminLogin();
        admin.setLoginAccount("我有力量");
        admin.setLoginPassword("0");
        Login.adminLogin(admin);
    }
}
