package com.lets.commons.security.config;

import com.lets.commons.security.interceptor.JWTInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * 处理请求拦截
 *
 * @Author: QIAO JING
 * @Date: 2022/3/24 17:35
 */
@Configuration
public class LetsWebMvcConfig implements WebMvcConfigurer {
    private final Logger logger = LoggerFactory.getLogger(LetsWebMvcConfig.class);

    @Resource
    private JWTInterceptor jwtInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor).addPathPatterns("/**");
    }
}