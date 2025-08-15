package com.lets.platform.model.common.domain;

import feign.RequestTemplate;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.codec.Encoder;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class FeignConfig {
    // 关键配置：自定义编码器
    @Bean
    public Encoder feignEncoder(ObjectFactory<HttpMessageConverters> messageConverters) {
        return new SpringFormEncoder(new SpringEncoder(messageConverters) {
            @Override
            public void encode(Object object, Type bodyType, RequestTemplate template) {
                if (object instanceof byte[]) {
                    // 强制设置二进制内容类型
                    template.header("Content-Type", MediaType.APPLICATION_OCTET_STREAM_VALUE);
                    template.body((byte[]) object, StandardCharsets.UTF_8);
                } else {
                    super.encode(object, bodyType, template);
                }
            }
        });
    }

    // 显式注册字节数组转换器
    @Bean
    public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
        return new ByteArrayHttpMessageConverter();
    }
}