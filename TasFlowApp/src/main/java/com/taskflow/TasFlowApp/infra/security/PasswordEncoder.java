package com.taskflow.TasFlowApp.infra.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

    public String encoder(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
}
