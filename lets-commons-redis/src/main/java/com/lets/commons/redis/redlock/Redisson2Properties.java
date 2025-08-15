package com.lets.commons.redis.redlock;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Redisson配置信息
 * @Author DING WEI
 * @Date 2021/1/27 16:38
 * @Version 1.0
 **/
@Data
@ConfigurationProperties(prefix = "spring.redis")
public class Redisson2Properties {
    // 原有属性保持不变
    private String host;
    private String port;
    private String username;
    private String password;
    private Integer database;

    // 新增哨兵配置
    private Sentinel sentinel;

    @Data
    public static class Sentinel {
        private String master;
        private List<String> nodes;
    }
}