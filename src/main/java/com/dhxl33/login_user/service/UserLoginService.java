package com.dhxl33.login_user.service;

import com.dhxl33.login_user.pojo.UserLogin;

/**
 * Created by qidd on 2018-4-29
 */
public interface UserLoginService {
    UserLogin login(String userName, String password);
}
