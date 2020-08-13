package com.pandas.learn.zt.day10;

import java.util.Scanner;

public class AdminLogin {
    public void adminLogin(Administrator administrator){
        Scanner scanner = new Scanner(System.in);
        int count=1;
        while (count<=5) {
            System.out.println("请输入管理员账户");
            String loginAccount = scanner.next();
            System.out.println("请输入管理员账户密码");
            String loginPassword = scanner.next();
            if (administrator.getLoginAccount().equals(loginAccount)) {
                if (administrator.getLoginPassword().equals(loginPassword)) {
                    System.out.println("登录成功");
                    count = 6;
                } else {
                    System.out.println("密码错误");
                    count ++;
                }
            }else{
                System.out.println("管理员账户输入错误");
                count ++;
            }
        }
    }
}
