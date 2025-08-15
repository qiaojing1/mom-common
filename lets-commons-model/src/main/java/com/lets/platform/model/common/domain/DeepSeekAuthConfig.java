package com.lets.platform.model.common.domain;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

// 认证配置
public class DeepSeekAuthConfig {
    @Bean
    public RequestInterceptor apiKeyInterceptor(
            @Value("${deepseek.api-key:ragflow-FmYjVlNzNlZjI3NjExZWZiYzVkMDI0Mm}") String apiKey) {
        return template -> {
            template.header("Authorization", "Bearer " + apiKey);
            template.header("Content-Type", "application/json"); // 明确指定
        };

    }
}