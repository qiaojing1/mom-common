package com.lets.commons.redis.util;

import cn.hutool.core.collection.CollUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.util.*;

/**
 * redis缓存key操作工具类
 *
 * @ClassName RedisKeyBean
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
@Slf4j
public class RedisKeyBean {

    private RedisTemplate<String, Object> redisTemplate;

    private static RedisKeyBean redisKeyBean = null;

    private RedisKeyBean(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 双重判断加锁的懒汉式
     *
     * @param redisTemplate
     * @return
     * @author DING WEI
     * @date 2021/04/23 9:29
     * @version 1.0
     */
    public static RedisKeyBean getInstance(RedisTemplate<String, Object> redisTemplate) {
        if (redisKeyBean == null) {
            synchronized (RedisKeyBean.class) {
                if (redisKeyBean == null) {
                    redisKeyBean = new RedisKeyBean(redisTemplate);
                }
            }
        }
        return redisKeyBean;
    }

    /**
     * 根据preKey前缀获取redis的缓存key
     *
     * @param preKey
     * @param server 服务名称,便于控制台观察
     * @return
     * @author DING WEI
     * @date 2021/04/23 9:14
     * @version 1.0
     */
    public Set<String> scanRedisKeys(String preKey, String server) {
        try {
            long start = System.currentTimeMillis();
            // 需要匹配的key
            String patternKey = preKey + "*";
            ScanOptions options = ScanOptions.scanOptions()
                    // 这里指定每次扫描key的数量
                    .count(10000)
                    .match(patternKey).build();
            RedisSerializer<String> redisSerializer = (RedisSerializer<String>) redisTemplate.getKeySerializer();
            Cursor cursor = (Cursor) redisTemplate.executeWithStickyConnection(redisConnection -> new ConvertingCursor<>(redisConnection.scan(options), redisSerializer::deserialize));
            Set<String> result = new HashSet<>();
            while (cursor.hasNext()) {
                result.add(cursor.next().toString());
            }
            // 切记这里一定要关闭，否则会耗尽连接数。报Cannot get Jedis connection; nested exception is redis.clients.jedis.exceptions.JedisException: Could not get a
            cursor.close();
            log.info("【{}】服务【{}】缓存scan扫描共耗时:{}ms,key数量:{}", server, preKey, System.currentTimeMillis() - start, result.size());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据preKey前缀获取redis的缓存
     *
     * @param preKey
     * @param server 服务名称,便于控制台观察
     * @return
     * @author DING WEI
     * @date 2021/04/23 9:14
     * @version 1.0
     */
    public List<Object> scanRedisKeysAndGetValue(String preKey, String server) {
        List<Object> result = new ArrayList<>();
        try {
            Set<String> redisKeys = scanRedisKeys(preKey, server);
            if (CollUtil.isNotEmpty(redisKeys)) {
                for (String redisKey : redisKeys) {
                    result.add(redisTemplate.opsForValue().get(redisKey));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 批量删除preKey前缀的缓存
     *
     * @param preKey
     * @param server 服务名称[uc|upm|tc等],控制台打印便于观察
     * @author DING WEI
     * @date 2021/04/23 9:21
     * @version 1.0
     */
    public void deleteRedisKeysByPre(String preKey, String server) {
        if (StringUtils.isNotBlank(preKey)) {
            Set<String> redisKeys = scanRedisKeys(preKey, server);
            redisTemplate.delete(redisKeys);
        }
    }

    /**
     * 批量获取多条数据
     *
     * @param keyList
     * @return
     * @author DING WEI
     * @date 2021/04/23 14:43
     * @version 1.0
     */
    public List<Object> batchGet(List<String> keyList) {
        List<Object> objects = redisTemplate.executePipelined((RedisCallback<String>) redisConnection -> {
            StringRedisConnection stringRedisConnection = (StringRedisConnection) redisConnection;
            for (String key : keyList) {
                stringRedisConnection.get(key);
            }
            return null;
        });
        return objects;
    }

    /**
     * 批量获取Hash结构的缓存数据
     *
     * @param keys
     * @return
     * @author DING WEI
     * @date 2021/04/23 13:50
     * @version 1.0
     */
    public List<Object> batGet4Hash(String hKey, Collection<String> keys) {
        List<Object> result = new ArrayList<>();
        if (StringUtils.isNotBlank(hKey) && keys != null && !keys.isEmpty()) {
            List<Object> keyList = new ArrayList<>();
            for (String key : keys) {
                keyList.add(key);
            }
            result = redisTemplate.opsForHash().multiGet(hKey, keyList);
            if (result != null) {
                result.removeAll(Collections.singleton(null));
            }
        }
        return result;
    }

    /**
     * 批量获取Hash结构的缓存数据
     *
     * @param keys
     * @return
     * @author DING WEI
     * @date 2021/04/23 13:50
     * @version 1.0
     */
    public List<Object> batGet4LongHash(String hKey, List<Long> keys) {
        List<Object> result = new ArrayList<>();
        if (StringUtils.isNotBlank(hKey) && keys != null && !keys.isEmpty()) {
            List<Object> keyList = new ArrayList<>();
            for (Long key : keys) {
                keyList.add(key);
            }
            result = redisTemplate.opsForHash().multiGet(hKey, keyList);
            if (result != null) {
                result.removeAll(Collections.singleton(null));
            }
        }
        return result;
    }

}
