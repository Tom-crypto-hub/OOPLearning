package com.pandas.project.user_management_system.view;

import com.pandas.project.user_management_system.service.LoginService;
import com.pandas.project.user_management_system.service.UserService;
import com.pandas.project.user_management_system.model.User;
import com.pandas.project.user_management_system.util.FileOperation;
import com.pandas.project.user_management_system.util.LogSystem;
import com.pandas.project.user_management_system.util.MenuUtil;
import com.pandas.project.user_management_system.util.NumberUtil;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author wangjing
 * @create 2020-08-13 16:04
 */
public class View {
    UserService userService = new UserService(Objects.requireNonNull(FileOperation.readTxt()));
    Scanner scanner = new Scanner(System.in);
    LogSystem logSystem = new LogSystem();

    public View() throws IOException {
    }

    // 欢迎来到用户管理登录界面
    public boolean loginUI(){
        System.out.println("\t\t\t\t欢迎进入用户管理系统");
        System.out.println("\t\t\t*****************************");
        System.out.println("\t\t**************************************");
        System.out.println("\t******************请登录******************************");
        //登陆成功返回true，登陆失败返回false
        return loginInputView();
    }

    public boolean loginInputView(){
        for(int i = 0; i < 5; i++) {
            System.out.println("请输入管理员账户：");
            String adminName = scanner.next();
            System.out.println("请输入管理员密码：");
            String adminPassword = scanner.next();

            LoginStatus status = LoginService.login(adminName, adminPassword);
            if (status == LoginStatus.ERROR_ACCOUNT) {
                System.out.println("管理用户名不存在，请再次输入：");
            } else if (status == LoginStatus.ERROR_PASSWORD) {
                System.out.println("密码错误，请再次输入：");
            } else if (status == LoginStatus.SUCCESSED) {
                System.out.println("登陆成功！");
                return true;
            }
        }
        System.out.println("管理员用户名和密码输入错误超过5次，程序退出！");
        return false;
    }

    // 菜单界面
    public void printMenu(){
        System.out.println("---------------------------------");
        System.out.println("\t\t\t0.最近日志");
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
        User[] users = userService.show();
        for (int i = 0; i< users.length;i++){
            System.out.println("\t\t"+(i+1)+"\t\t\t"+users[i].getName()+"\t\t\t"
                    +users[i].getAge()+"\t\t\t"+users[i].getGender()
                    +"\t\t\t"+users[i].getPhone()+"\t\t\t"+users[i].getEmail());
        }
        System.out.println("共有"+ userService.getTotal()+"条数据");
    }

    // 新增用户界面
    public void addUserUI(){
        System.out.println("\t-----------新增用户-----------");
        System.out.println("请输入姓名：");
        String name=MenuUtil.readString(5);
        System.out.println("请输入性别：");
        char gender=MenuUtil.readChar();
        if(gender == '男' || gender == '女'){

        }
        else gender = '男';
        System.out.println("请输入年龄：");
        int age=MenuUtil.readInt();
        System.out.println("请输入电话：");
        String phone= MenuUtil.readString(11);
        if(!NumberUtil.isMobile(phone)) {
            System.out.println("输入格式不符合规范");
            phone = "17700000000";
        }
        System.out.println("请输入邮箱：");
        String email=MenuUtil.readString(20);
        if (!NumberUtil.checkEmail(email)){
            System.out.println("输入格式不符合规范");
            email = "123567@qq.com";
        }
        User user=new User(userService.getTotal() + 1,name,gender, age,phone,email);
        if(userService.addUser(user))
            System.out.println("用户添加成功！");
        else System.out.println("用户添加失败！");
        logSystem.addLogs("新增用户：" + user.show());
    }

    // 删除用户界面
    public void delUserUI(){
        System.out.println("\t-----------删除用户-----------");
        System.out.println("请输入要删除的用户编号：");
        int userId=scanner.nextInt();
        User user = userService.findUser(userId);
        System.out.println("确定删除Y/N：");
        char yesOrNo=scanner.next().charAt(0);
        if(yesOrNo=='Y'){
            if(userService.delUser(userId)){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
            logSystem.addLogs("删除用户成功：" + user.show());
        }else {
            logSystem.addLogs("删除用户失败：" + user.show());
            return;
        }

    }

    // 更改用户界面
    public void updateUserUI(){
        System.out.println("\t-----------更改用户-----------");
        System.out.println("请输入修改用户的编号：");
        int id=scanner.nextInt();
        if(id> userService.getTotal()){
            System.out.println("当前用户不存在");
            return;
        }
        User user = userService.findUser(id);
        System.out.println("请输入姓名：");
        user.setName(MenuUtil.readString(5,user.getName()));
        System.out.println("请输入性别：");
        user.setGender(MenuUtil.readChar(user.getGender()));
        if(user.getGender() != '男' || user.getGender() != '女')
            user.setGender('男');
        System.out.println("请输入年龄：");
        user.setAge(MenuUtil.readInt(user.getAge()));
        System.out.println("请输入电话：");
        user.setPhone(MenuUtil.readString(11,user.getPhone()));
        if(!NumberUtil.isMobile(user.getPhone())) {
            System.out.println("输入格式不符合规范");
            user.setPhone("17700000000");
        }
        System.out.println("请输入邮箱：");
        user.setEmail(MenuUtil.readString(20,user.getEmail()));
        if (!NumberUtil.checkEmail(user.getEmail())){
            System.out.println("输入格式不符合规范");
            user.setEmail("12357@qq.com")  ;
        }
       // User user=new User(id,name,gender,age,phone,email);
        System.out.println("确定修改Y/N：");
        char yesOrNo=scanner.next().charAt(0);
        if(yesOrNo=='Y') {
            if (userService.updateUser(user)) {
                System.out.println("修改成功");
                logSystem.addLogs("修改用户成功：" + user.show());
            } else {
                System.out.println("修改失败");
                logSystem.addLogs("修改用户失败：" + user.show());
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
        User user= userService.findUser(id);
        System.out.println(user.show());
    }

    // 退出
    public void exitSystem() throws IOException {
        // 存入文件
        FileOperation.writeTxt(userService.show(), userService.getTotal());
        // 写入日志
        logSystem.resetLogContext();
        System.out.println("系统退出成功！");
        System.exit(0);
    }

    // 汇总
    public void start() throws IOException {
        if (loginUI()) {
            logSystem.addLogs("登录系统成功！登录时间：" + FileOperation.getCurrentTime());
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
                    case 0:
                        logSystem.showLog();
                        break;
                    default:
                        System.out.println("输入指令错误");
                        break;
                }
            }
        }
    }

}
