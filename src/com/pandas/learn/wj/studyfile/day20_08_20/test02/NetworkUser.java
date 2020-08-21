package com.pandas.learn.wj.studyfile.day20_08_20.test02;

/**
 * @author wangjing
 * @create 2020-08-20 15:23
 */
public class NetworkUser {
    private int ID;
    private String password;
    private String email;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NetworkUser(int ID, String password, String email) {
        this.ID = ID;
        this.password = password;
        this.email = email;
    }
}
