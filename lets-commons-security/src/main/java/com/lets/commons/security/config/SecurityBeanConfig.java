package com.lets.commons.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Security所需Bean
 *
 * @ClassName SecurityBeanConfig
 * @author: DING WEI
 * @create: 2021/04/29 09:10
 * @Version 1.0
 **/
@Configuration
public class SecurityBeanConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
