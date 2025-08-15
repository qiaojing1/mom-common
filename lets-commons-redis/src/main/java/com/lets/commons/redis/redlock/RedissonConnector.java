package com.lets.commons.redis.redlock;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Redisson配置类
 **/

@Configuration
@EnableConfigurationProperties({Redisson2Properties.class})
public class RedissonConnector {

    @Resource
    private Redisson2Properties redisson2Properties;

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();

        // 哨兵模式配置
        if (redisson2Properties.getSentinel() != null) {
            Redisson2Properties.Sentinel sentinel = redisson2Properties.getSentinel();

            // 转换节点地址格式 (添加redis://前缀)
            String[] sentinelNodes = sentinel.getNodes().stream()
                    .map(node -> "redis://" + node)
                    .toArray(String[]::new);

            config.useSentinelServers()
                    .setMasterName(sentinel.getMaster())
                    .addSentinelAddress(sentinelNodes)
                    .setDatabase(redisson2Properties.getDatabase())
                    .setPassword(redisson2Properties.getPassword());
        }
        // 单机模式保留作为fallback
        else {
            String address = "redis://" + redisson2Properties.getHost() + ":" + redisson2Properties.getPort();
            config.useSingleServer()
                    .setAddress(address)
                    .setPassword(redisson2Properties.getPassword())
                    .setDatabase(redisson2Properties.getDatabase());
        }

        return Redisson.create(config);
    }
}
