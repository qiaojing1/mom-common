package com.lets.commons.security.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lets.commons.security.pojo.LoginWhiteListConfig;
import com.lets.commons.security.util.EnvUtil;
import com.lets.platform.common.pojo.enums.ClientEnum;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Objects;

/**
 * @Author: qiaojing @Date: 2020/4/26 4:24 AM
 */
@Configuration
@EnableFeignClients(basePackages = "com.lets")
public class FeignClientConfiguration implements RequestInterceptor {

    @Resource
    @Lazy
    private RedisTemplate<Object, String> letsRedisTemplate;

    @Resource
    private LoginWhiteListConfig loginWhiteListConfig;

    @Resource
    private ObjectMapper objectMapper;

    @Override
    public void apply(RequestTemplate template) {
        String path = template.path();
        //白名单
        if (!loginWhiteListConfig.isWhiteList(path)) {
            String clientType = EnvUtil.getCurClientType();
            if (ClientEnum.EXT.getClientId().equals(clientType)) {
                template.header("ext_token", EnvUtil.getCurrentToken());
                template.header("client_type", clientType);
            } else if (ClientEnum.XXL_JOB.getClientId().equals(clientType)) {
                template.header("xxl_job_token", EnvUtil.getCurrentToken());
                template.header("client_type", clientType);
            } else {
                template.header("access_token", EnvUtil.getTokenKey());
                template.header("client_type", clientType);
            }
        } else {
            String clientType = EnvUtil.getCurClientType();
            String tokenKey = EnvUtil.getTokenKey();
            if (ClientEnum.EXT.getClientId().equals(clientType)) {
                template.header("ext_token", EnvUtil.getCurrentToken());
                template.header("client_type", clientType);
            } else if (ClientEnum.XXL_JOB.getClientId().equals(clientType)) {
                template.header("xxl_job_token", EnvUtil.getCurrentToken());
                template.header("client_type", clientType);
            } else if (StringUtils.isNotBlank(clientType) && StringUtils.isNotBlank(tokenKey)) {
                Object tokenInRedis = letsRedisTemplate.opsForValue().get(tokenKey);
                if (Objects.nonNull(tokenInRedis)) {
                    template.header("access_token", EnvUtil.getTokenKey());
                    template.header("client_type", clientType);
                }
            } else if ("dev".equals(System.getenv("env"))) {
                template.header("access_token", EnvUtil.getTokenKey());
                template.header("client_type", clientType);
            }
        }
        //判断是否是feign调用的依据
        template.header("is_feign", "true");
    }

    @Bean
    public Encoder feignEncoder() {
        return new SpringEncoder(feignHttpMessageConverter());
    }

    @Bean
    public Decoder feignDecoder() {
        return new ResponseEntityDecoder(new SpringDecoder(feignHttpMessageConverter()));
    }

    private ObjectFactory<HttpMessageConverters> feignHttpMessageConverter() {
        final HttpMessageConverters httpMessageConverters =
                new HttpMessageConverters(false, Collections.singleton(new MappingJackson2HttpMessageConverter(objectMapper)));
        return () -> httpMessageConverters;
    }
}
