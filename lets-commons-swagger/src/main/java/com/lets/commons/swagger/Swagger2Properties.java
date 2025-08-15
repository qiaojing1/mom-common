package com.lets.commons.swagger;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Swagger配置信息
 * @Author DING WEI
 * @Date 2021/1/27 16:38
 * @Version 1.0
 **/
@Data
@ConfigurationProperties(prefix = "lets.swagger2")
public class Swagger2Properties {

    private String basePackage;
    private String title;
    private String description;
    private String version;
    private String apiName;
    private String apiKeyName;
    private String termsOfServiceUrl;

}