package com.pandas.learn.wj.studyfile.day20_08_13.user.service;

import com.pandas.learn.wj.studyfile.day20_08_13.user.model.User;

/**
 * @author wangjing
 * @create 2020-08-13 11:44
 */
public class UserService {
    private User[] users;
    private int total;
    private int maxCapacity;

    public UserService() {
        maxCapacity = 4;
        this.total = 0;
        this.users = new User[maxCapacity];
    }

    public User[] getUserList(){
        return users;
    }

    public int getTotal(){
        return total;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    public boolean addUser(User user){
        for(int i = 0; i < total; i++){
            if(users[i].getName().equals(user.getName())){
                System.out.println("用户名已存在！");
                return false;
            }
        }
        if(user.getId() == 0)
            user.setId(total);
        if(total < maxCapacity){
            users[total] = user;
        }
        else{
            User[] users = new User[maxCapacity<<1];
            System.arraycopy(this.users, 0, users, 0, total);
            users[total] = user;
            this.users = users;
        }
        total++;
        System.out.println("添加成功！");
        return true;
    }

    /**
     * 删除用户
     * @param user
     */
    public boolean deleteUser(User user){
        if(total == 0) return false;
        for(int i = 0; i < total; i++){
            if(this.users[i].getName().equals(user.getName())){
                // 删除

                for(int j = i; j < total - 1; j++){
                    this.users[j] = this.users[j + 1];
                }this.users[total - 1] = null;
                total--;
                return true;
            }
        }
        return false;
    }

    /**
     * 更改用户
     * @param user
     * @return
     */
    public boolean updateUser(User user){
        if (total == 0) return false;
        for(int i = 0; i < total; i++){
            if(this.users[i].getName().equals(user.getName())) {
                this.users[i] = user;
                return true;
            }
        }
        return false;
    }

}

