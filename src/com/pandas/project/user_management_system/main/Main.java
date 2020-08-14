package com.pandas.project.user_management_system.main;

import com.pandas.project.user_management_system.model.User;
import com.pandas.project.user_management_system.util.FileOperation;
import com.pandas.project.user_management_system.view.View;

import java.io.IOException;

/**
 * @author wangjing
 * @create 2020-08-13 16:04
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        int total = 2;
//        User[] users = new User[total];
//        // int id, String name, char gender, int age, String phone, String email
//        users[0] = new User(1, "wj", '男', 20, "13700000000", "1234567@qq.com");
//        users[1] = new User(2, "zh", '女', 18, "13711111111", "7654321@qq.com");
//        FileOperation.writeTxt(users, total);

        new View().start();
    }
}
