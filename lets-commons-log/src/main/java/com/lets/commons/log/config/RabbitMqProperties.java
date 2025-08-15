package com.lets.commons.log.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * RabbitMQ配置信息
 * @Author DING WEI
 * @Date 2021/08/18 16:38
 * @Version 1.0
 **/
@Data
@ConfigurationProperties(prefix = "spring.rabbitmq")
public class RabbitMqProperties {

    private String host;
    private String port;
    private String username;
    private String password;
    private String logExchangeName;
    private String logQueueName;

}