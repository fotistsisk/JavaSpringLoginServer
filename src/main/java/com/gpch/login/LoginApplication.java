package com.gpch.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@SpringBootApplication
public class LoginApplication {
    private static final Logger logger = LogManager.getLogger(LoginApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }
}
