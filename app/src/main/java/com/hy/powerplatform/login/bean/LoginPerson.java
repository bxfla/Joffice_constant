package com.hy.powerplatform.login.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/12/21.
 */

public class LoginPerson implements Serializable {
    public String num;
    public String userName;
    public String loginNum;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(String loginNum) {
        this.loginNum = loginNum;
    }
}
