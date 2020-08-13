package com.pandas.learn.wj.studyfile.day20_08_13.user.view;

import com.pandas.learn.wj.studyfile.day20_08_13.user.model.User;
import com.pandas.learn.wj.studyfile.day20_08_13.user.service.UserService;

import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

/**
 * @author wangjing
 * @create 2020-08-13 13:06
 */
public class UserView {
    private static Scanner scanner = new Scanner(System.in);
    private static UserService users;
    private UserView(UserService users){
        UserView.users = users;
    }

    // 单例
    public static UserView UIInstance(UserService users){
        return new UserView(users);
    }

    public static int start(){
        System.out.println("---------------------------------------------");
        String[] strs = {"1.用户列表", "2.新增用户", "3.删除用户", "4.更改用户" };
        for(String str : strs){
            System.out.println("\t\t" + str);
        }
        System.out.println("---------------------------------------------");
        System.out.print("请输入指令：");
        return scanner.nextInt();
    }

    public static void showUsers(){
        if(users.getTotal() == 0) {
            System.out.println("没有用户记录！");
            return;
        }
        System.out.println("编号\t姓名\t性别\t年龄\t手机号\t邮箱");
        for(int i = 0; i < users.getTotal(); i++){
            System.out.println(users.getUserList()[i].toString());
        }
        System.out.println("共有：" + users.getTotal() + " 条记录。");
        System.out.println("---------------------------------------------");
    }

    public static void addUser(){
        System.out.println("---------------------------------------------");
        User user = new User();
        System.out.println("请输入要添加的用户信息：");
        // System.out.print("编号：");
        System.out.print("用户名：");
        user.setName(scanner.next());
        System.out.print("年龄：");
        user.setAge(scanner.nextInt());
        System.out.print("性别：");
        user.setGender(scanner.next().toCharArray()[0]);
        System.out.print("邮箱：");
        user.setEmail(scanner.next());
        System.out.print("手机号：");
        user.setPhone(scanner.next());
        users.addUser(user);
        System.out.println("---------------------------------------------");
    }

    public static void delUser(){
        System.out.println("---------------------------------------------");
        User user = new User();
        System.out.println("请输入要删除的用户信息：");
        System.out.print("用户名：");
        user.setName(scanner.next());
        users.deleteUser(user);
        System.out.println("---------------------------------------------");
    }

    public static void updateUser(){
        System.out.println("---------------------------------------------");
        User user = new User();
        System.out.println("请输入要修改的用户信息：");
        System.out.print("要修改的用户名：");
        user.setName(scanner.next());
        System.out.print("新的年龄：");
        user.setAge(scanner.nextInt());
        System.out.print("新的性别：");
        user.setGender(scanner.next().toCharArray()[0]);
        System.out.print("新的邮箱：");
        user.setEmail(scanner.next());
        System.out.print("新的手机号：");
        user.setPhone(scanner.next());
        users.updateUser(user);
        System.out.println("---------------------------------------------");
    }
}
