package com.lets.platform.common.pojo.config;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * LargeSetCacheConfig
 * @author: DING WEI
 * @date: 2025/8/4 18:02
 */
@Configuration
public class LargeSetCacheConfig {

    /**
     * 配置大容量Set缓存
     * 特点：1天过期、弱引用值减少内存压力、最大容量10万
     */
    @Bean
    public Cache<String, Set<String>> largeSetCache() {
        return CacheBuilder.newBuilder()
                .maximumSize(100_000) // 最大缓存10万个Set
                .expireAfterWrite(1, TimeUnit.DAYS) // 1天过期
                .concurrencyLevel(Runtime.getRuntime().availableProcessors()) // 根据CPU核心数设置并发级别
                .softValues() // 内存不足时自动回收
                .recordStats() // 记录统计信息
                .build();
    }

}
