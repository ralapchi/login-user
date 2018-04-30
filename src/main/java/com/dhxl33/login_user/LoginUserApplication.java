package com.dhxl33.login_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LoginUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginUserApplication.class, args);
    }
}
