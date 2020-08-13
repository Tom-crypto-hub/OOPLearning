package com.pandas.learn.wj.studyfile.day20_08_13.prictice1.model;

import java.util.Objects;

/**
 * @author wangjing
 * @create 2020-08-13 10:54
 */
public class Administrator {
    private String loginAccount;

    private String loginPassword;

    @Override
    public String toString() {
        return "Administrator{" +
                "loginAccount='" + loginAccount + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}
