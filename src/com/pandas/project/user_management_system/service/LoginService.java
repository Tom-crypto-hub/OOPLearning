package com.pandas.project.user_management_system.service;

import com.pandas.project.user_management_system.view.LoginStatus;

/**
 * @author wangjing
 * @create 2020-08-13 16:35
 */
public class LoginService {
    // 登录
    private static String adminName = "admin";
    private static String adminPassword = "admin";

    public static LoginStatus login(String username, String password){
        LoginStatus status = LoginStatus.ERROR;
        if (adminName.equals(username)){
            if (adminPassword.equals(password)){
                status = LoginStatus.SUCCESSED;
            }else{
                status = LoginStatus.ERROR_PASSWORD;
                System.out.println("密码错误，请再次输入：");
            }
        }else{
            status = LoginStatus.ERROR_ACCOUNT;
            System.out.println("管理用户名不存在，请再次输入：");
        }
        return status;
    }
}
