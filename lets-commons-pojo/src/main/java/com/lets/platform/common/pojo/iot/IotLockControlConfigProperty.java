package com.lets.platform.common.pojo.iot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * iot锁机控制配置
 * @author DING WEI
 * @date 2024/2/23 15:24
 * @version 1.0
 */
@Data
@Configuration
@RefreshScope
@ConfigurationProperties(prefix = "iot.recriminate.control")
public class IotLockControlConfigProperty {

    private String id;
    private String type;

}
