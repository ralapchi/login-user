package com.dhxl33.login_user.pojo;

import java.io.Serializable;

/**
 * 用户登录
 *
 * @author 郭宏涛
 */
public class UserLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    // 用户id,用uuid生成
    private String userId;

    private String userName;

    private String password;

    // 记录用户是否在线 1在线 0不在线
    private boolean online;

    public UserLogin() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
