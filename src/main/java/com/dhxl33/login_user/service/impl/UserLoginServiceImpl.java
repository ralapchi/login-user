package com.dhxl33.login_user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dhxl33.login_user.pojo.UserLogin;
import com.dhxl33.login_user.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qidd on 2018-4-29
 */
@Service
public class UserLoginServiceImpl  implements UserLoginService {

    @Override
    public UserLogin login(String userName, String password) {

        return new UserLogin();
    }
}
