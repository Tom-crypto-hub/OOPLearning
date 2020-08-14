package com.pandas.project.user_management_system.service;

import java.util.Scanner;

/**
 * @author wangjing
 * @create 2020-08-13 16:35
 */
public class LoginService {
    // 登录
    private String adminName="admin";
    private String adminPassword="admin";
    boolean b=false;
    Scanner scanner = new Scanner(System.in);
    public boolean login(){
        int a=0;
        for (int i=1;i<=5;i++){
            System.out.println("请输入管理员账户：");
            String adminName= scanner.next();
            System.out.println("请输入管理员密码：");
            String adminPassword=scanner.next();
            if (this.adminName.equals(adminName)){
                if (this.adminPassword.equals(adminPassword)){
                    System.out.println("登陆成功！");
                    b =true;
                    break;
                }else{
                    System.out.println("密码错误，请再次输入：");
                    a++;
                }
            }else{
                System.out.println("管理用户名不存在，请再次输入：");
                a++;
            }
        }
        if(a==5){
            System.out.println("管理员用户名和密码输入错误不能超过5次！");
        }
        return b;
    }

}
