package com.lets.commons.redis.util;

import cn.hutool.core.collection.CollUtil;
import com.lets.commons.redis.constant.RedisConstant;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.collection.entity.CollDeviceItemRealtime;
import org.apache.commons.lang3.StringUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.ValueOperations;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * 获取实时点位
 * @author: DING WEI
 * @date: 2024/3/28 13:28
 */
public class RealtimeItemUtil {

    /**
     * 获取采集器的所有实时点位
     * @param letsRedisTemplate
     * @param collectorId 采集器主键
     * @param server 服务标识，无实际作用
     * @return
     * @author DING WEI
     * @date 2024/3/28 13:57
     * @version 1.0
     */
    public static Set<String> getRealtimeKey(RedisTemplate<String, Object> letsRedisTemplate, String collectorId, String server) {
        Set<String> result = new HashSet<>();
        RedisKeyBean redisKeyBean = RedisKeyBean.getInstance(letsRedisTemplate);
        String keyPre = RedisConstant.REAL_TIME_ITEM + collectorId;
        Set<String> itemKeys = redisKeyBean.scanRedisKeys(keyPre, server);
        if (CollUtil.isNotEmpty(itemKeys)) {
            keyPre = keyPre + GlobalConstant.COLON_HALF_ANGLE;
            for (String itemKey : itemKeys) {
                result.add(itemKey.replace(keyPre, GlobalConstant.EMPTY_STR));
            }
        }
        return result;
    }

    /**
     * 获取采集器的所有点位值
     * @param letsRedisTemplate
     * @param collectorId 采集器主键
     * @param server 服务标识，无实际作用
     * @return
     * @author DING WEI
     * @date 2024/3/28 13:57
     * @version 1.0
     */
    public static List<CollDeviceItemRealtime> getRealtimeItem(RedisTemplate<String, Object> letsRedisTemplate, String collectorId, String server) {
        List<CollDeviceItemRealtime> realtimeList = new ArrayList<>();
        if (StringUtils.isNotBlank(collectorId)) {
            RedisKeyBean redisKeyBean = RedisKeyBean.getInstance(letsRedisTemplate);
            Set<String> result = redisKeyBean.scanRedisKeys(RedisConstant.REAL_TIME_ITEM + collectorId, server);
            if (CollUtil.isNotEmpty(result)) {
                for (String itemKey : result) {
                    Object itemValue = letsRedisTemplate.opsForValue().get(itemKey);
                    if (Objects.nonNull(itemValue) && itemValue instanceof CollDeviceItemRealtime) {
                        CollDeviceItemRealtime realtime = (CollDeviceItemRealtime) itemValue;
                        realtimeList.add(realtime);
                    }
                }
            }
        }
        return realtimeList;
    }

    /**
     * 获取实时点位
     * @param letsRedisTemplate
     * @param collectorId 采集器主键
     * @param itemKey 点位key
     * @return
     * @author DING WEI
     * @date 2024/3/28 13:56
     * @version 1.0
     */
    public static Object getValue(RedisTemplate<String, Object> letsRedisTemplate, String collectorId, String itemKey) {
        String key = RedisConstant.REAL_TIME_ITEM + collectorId + GlobalConstant.COLON_HALF_ANGLE + itemKey;
        return letsRedisTemplate.opsForValue().get(key);
    }

    /**
     * 设置实时点位到缓存
     * @param letsRedisTemplate
     * @param itemList 实时点位集合
     * @param timeout 过期时间
     * @param unit 过期时间单位
     * @return
     * @author DING WEI
     * @date 2024/3/28 13:55
     * @version 1.0
     */
    public static Set<String> setValue(RedisTemplate<String, Object> letsRedisTemplate, ArrayList<CollDeviceItemRealtime> itemList, Long timeout, TimeUnit unit) {
        Set<String> collectionIds = new HashSet<>();
        letsRedisTemplate.executePipelined(new SessionCallback<Object>() {
            @Override
            public <K, V> Object execute(RedisOperations<K, V> operations) throws DataAccessException {
                ValueOperations<String, Object> op1 = (ValueOperations<String, Object>) operations.opsForValue();
                for (CollDeviceItemRealtime itemRealtime : itemList) {
                    String collectionId = itemRealtime.getCollectionId();
                    String itemKey = itemRealtime.getItemKey();
                    String key = RedisConstant.REAL_TIME_ITEM + collectionId + GlobalConstant.COLON_HALF_ANGLE + itemKey;
                    op1.set(key, itemRealtime, timeout, unit);
                }
                return null;
            }
        });
        return collectionIds;
    }
}
