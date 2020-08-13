package com.pandas.learn.wj.studyfile.day20_08_13.user;

import com.pandas.learn.wj.studyfile.day20_08_13.user.service.UserService;
import com.pandas.learn.wj.studyfile.day20_08_13.user.view.UserView;

/**
 * @author wangjing
 * @create 2020-08-13 13:53
 */
public class Main {
    public static void main(String[] args) {
        UserView.UIInstance(new UserService());
        while (true){
            switch (UserView.start()){
                case 0:
                    return;
                case 1:
                    UserView.showUsers();
                    break;
                case 2:
                    UserView.addUser();
                    break;
                case 3:
                    UserView.delUser();
                    break;
                case 4:
                    UserView.updateUser();
                    break;
                default:
                    System.out.println("非法指令！");
                    break;
            }
        }
    }
}
