package com.lets.platform.common.pojo.config;

import com.google.common.cache.Cache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

/**
 * SetMembershipService
 * @author: DING WEI
 * @date: 2025/8/4 18:03
 */
@Slf4j
@Service
public class SetMembershipService {

    @Resource
    private Cache<String, Set<String>> largeSetCache;

    /**
     * 判断字符串是否存在于集合中
     */
    public boolean contains(String key, String value) {
        try {
            Set<String> stringSet = largeSetCache.get(key, this::loadInitialSet);
            log.info("缓存条码：{}", stringSet);
            return stringSet != null && stringSet.contains(value);
        } catch (ExecutionException e) {
            // 异常处理
            return false;
        }
    }

    /**
     * 添加新值到集合
     */
    public void add(String key, String value) {
        try {
            log.info("添加缓存：{}-{}", key, value);
            Set<String> stringSet = largeSetCache.get(key, this::loadInitialSet);
            if (stringSet != null) {
                stringSet.add(value);
                // 更新缓存
                largeSetCache.put(key, stringSet);
            }
        } catch (ExecutionException e) {
            // 异常处理
        }
    }

    /**
     * 添加新值到集合
     */
    public void addAll(String key, Set<String> value) {
        try {
            Set<String> stringSet = largeSetCache.get(key, this::loadInitialSet);
            if (stringSet != null) {
                stringSet.addAll(value);
                // 更新缓存
                largeSetCache.put(key, stringSet);
            }
        } catch (ExecutionException e) {
            // 异常处理
        }
    }

    /**
     * 预加载缓存
     */
    public void warmUpCache(String key) {
        try {
            largeSetCache.get(key, this::loadInitialSet);
        } catch (ExecutionException e) {
            // 异常处理
        }
    }

    /**
     * 从数据源加载初始集合
     */
    private Set<String> loadInitialSet() {
        // 这里实现从数据库/文件等加载初始数据的逻辑
        // 使用ConcurrentHashMap支持的Set保证线程安全
        return ConcurrentHashMap.newKeySet();
    }

    /**
     * 获取缓存统计信息（用于监控）
     */
    public String getCacheStats() {
        return largeSetCache.stats().toString();
    }


}
