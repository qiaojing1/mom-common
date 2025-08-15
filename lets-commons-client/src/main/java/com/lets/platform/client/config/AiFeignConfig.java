

/*
 * csy
 */

package com.lets.platform.client.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2025/3/13
 */
public class AiFeignConfig {
        @Bean
        public RequestInterceptor requestInterceptor() {
            return new AiUrlConfig();
        }

}
