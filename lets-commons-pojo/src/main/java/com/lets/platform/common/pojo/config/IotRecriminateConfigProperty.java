package com.lets.platform.common.pojo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * iot反控配置
 * @author DING WEI
 * @date 2024/2/23 15:24
 * @version 1.0
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "iot.recriminate")
public class IotRecriminateConfigProperty {

    private String url;
    private String host;

}
