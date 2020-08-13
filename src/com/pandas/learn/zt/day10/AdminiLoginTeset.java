package com.pandas.learn.zt.day10;

public class AdminiLoginTeset {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        AdminLogin Login = new AdminLogin();
        admin.setLoginAccount("我有力量");
        admin.setLoginPassword("0");
        Login.adminLogin(admin);
    }
}
