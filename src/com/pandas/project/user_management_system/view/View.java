package com.pandas.project.user_management_system.view;

import com.pandas.project.user_management_system.controller.UserController;
import com.pandas.project.user_management_system.model.User;
import com.pandas.project.user_management_system.util.MenuUtil;

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
        System.out.println("---------------------------------");
        System.out.println("\t\t\t1.用户列表");
        System.out.println("\t\t\t2.新增用户");
        System.out.println("\t\t\t3.删除用户");
        System.out.println("\t\t\t4.修改用户");
        System.out.println("\t\t\t5.查找用户");
        System.out.println("\t\t\t6.退出");
        System.out.println("---------------------------------");
    }

    // 用户列表
    public void showUserListUI(){
        System.out.println("\t\t\t-------------用户列表-------------");
        System.out.println("\t\t编号\t\t姓名\t\t年龄\t\t性别\t\t电话\t\t邮箱");
        User[] users = userController.show();
        for (int i = 0; i< users.length;i++){
            System.out.println("\t\t"+(i+1)+"\t\t\t"+users[i].getName()+"\t\t\t"
                    +users[i].getAge()+"\t\t\t"+users[i].getGender()
                    +"\t\t\t"+users[i].getPhone()+"\t\t\t"+users[i].getEmail());
        }
        System.out.println("共有"+userController.getTotal()+"条数据");
    }

    // 新增用户界面
    public void addUserUI(){
        System.out.println("\t-----------新增用户-----------");
        System.out.println("请输入姓名：");
        String name=scanner.next();
        System.out.println("请输入性别：");
        char gender=scanner.next().charAt(0);
        System.out.println("请输入年龄：");
        int age=scanner.nextInt();
        System.out.println("请输入电话：");
        String phone=scanner.next();
        System.out.println("请输入邮箱：");
        String email=scanner.next();
        User user=new User(userController.getTotal(),name,gender, age,phone,email);
        userController.addUser(user);
    }

    // 删除用户界面
    public void delUserUI(){
        System.out.println("\t-----------删除用户-----------");
        System.out.println("请输入要删除的用户编号：");
        int userId=scanner.nextInt();
        System.out.println("确定删除Y/N：");
        char yesOrNo=scanner.next().charAt(0);
        if(yesOrNo=='Y'){
            if(userController.delUser(userId)){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            return;
        }

    }

    // 更改用户界面
    public void updateUserUI(){
        System.out.println("\t-----------更改用户-----------");
        User[] users=userController.show();
        System.out.println("请输入修改用户的编号：");
        int id=scanner.nextInt();
        if(id>users.length){
            System.out.println("当前用户不存在");
            return;
        }
        User user = userController.findUser(id);
        System.out.println("请输入姓名：");
        user.setName(MenuUtil.readString(5,user.getName()));
        System.out.println("请输入性别：");
        user.setGender(MenuUtil.readChar(user.getGender()));
        System.out.println("请输入年龄：");
        user.setAge(MenuUtil.readInt(user.getAge()));
        System.out.println("请输入电话：");
        user.setPhone(MenuUtil.readString(11,user.getPhone()));
        System.out.println("请输入邮箱：");
        user.setEmail(MenuUtil.readString(20,user.getEmail()));
       // User user=new User(id,name,gender,age,phone,email);
        System.out.println("确定修改Y/N：");
        char yesOrNo=scanner.next().charAt(0);
        if(yesOrNo=='Y') {
            if (userController.updateUser(user)) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        }else{
            return;
        }
    }

    // 查找用户界面
    public void findUserUI(){
        System.out.println("\t-----------查找用户-----------");
        System.out.println("请输入查找用户的编号：");
        int id=scanner.nextInt();
        User user=userController.findUser(id);
        System.out.println(user.show());
    }

    // 退出
    public void exitSystem(){
        System.out.println("系统退出成功！");
        System.exit(0);
    }

    // 汇总
    public void start(){
        while (true) {
            printMenu();
            System.out.println("请输入指令");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    showUserListUI();
                    break;
                case 2:
                    addUserUI();
                    break;
                case 3:
                    delUserUI();
                    break;
                case 4:
                    updateUserUI();
                    break;
                case 5:
                    findUserUI();
                    break;
                case 6:
                    exitSystem();
                    break;
                default:
                    System.out.println("输入指令错误");
                    break;
            }
        }
    }

}
