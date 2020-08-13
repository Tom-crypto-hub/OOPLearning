package com.pandas.project.user_management_system.view;

import com.pandas.project.user_management_system.controller.UserController;

import java.util.Scanner;

/**
 * @author wangjing
 * @create 2020-08-13 16:04
 */
public class View {
    UserController userController = new UserController();
    Scanner scanner = new Scanner(System.in);

    // 欢迎来到用户管理登录界面
    public boolean loginUI(){
        return false;
    }

    // 菜单界面
    public void printMenu(){

    }

    // 用户列表
    public void showUserListUI(){

    }

    // 新增用户界面
    public void addUserUI(){

    }

    // 删除用户界面
    public void delUserUI(){

    }

    // 更改用户界面
    public void updateUserUI(){

    }

    // 查找用户界面
    public void findUserUI(){

    }

    // 退出
    public void exitSystem(){

    }

    // 汇总
    public void start(){

    }
}
