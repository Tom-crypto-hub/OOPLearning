package com.pandas.learn.wj.studyfile.day20_08_13.prictice1.view;

import com.pandas.learn.wj.studyfile.day20_08_13.prictice1.model.Administrator;

import javax.sound.midi.SoundbankResource;
import java.util.Scanner;

/**
 * @author wangjing
 * @create 2020-08-13 10:56
 */
public class Test {
    public static boolean login(Administrator admin, String username, String password){
        return admin.getLoginAccount().equals(username)
                && admin.getLoginPassword().equals(password);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator();
        admin.setLoginAccount("wj");
        admin.setLoginPassword("123456");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5){
            i++;
            System.out.print("请输入账号：");
            String username = sc.next();
            System.out.print("请输入密码：");
            String password = sc.next();
            if(login(admin, username, password)){
                System.out.println("登录成功！");
                return ;
            }
            else{
                System.out.print("登录失败！");
                if(i != 0){
                    System.out.println("您还有" + (5 - i) + "次机会！");
                }
                else System.out.println("您没有机会了！");
            }
        }
    }
}
