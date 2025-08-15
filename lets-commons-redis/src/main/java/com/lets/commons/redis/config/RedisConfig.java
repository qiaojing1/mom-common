package com.lets.commons.redis.config;

import org.slf4j.Logger;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * redis序列化配置
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
@Configuration
public class RedisConfig  extends CachingConfigurerSupport {

    private final static Logger logger = org.slf4j.LoggerFactory.getLogger(RedisConfig.class);

//    @Primary
//    @Bean(name ="cacheManager")
//    public CacheManager cacheManager(RedisConnectionFactory factory) {
//        RedisCacheConfiguration cacheConfiguration =
//                RedisCacheConfiguration.defaultCacheConfig()
//                        .entryTtl(Duration.ofDays(1))
//                        .disableCachingNullValues()
//                        .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new
//                                GenericJackson2JsonRedisSerializer()));
//        return RedisCacheManager.builder(factory).cacheDefaults(cacheConfiguration).build();
//    }

    @Bean("letsRedisTemplate")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        // key的序列化类型
        redisTemplate.setKeySerializer(new RedisKeySerializer());
        // key haspmap序列化
        redisTemplate.setHashKeySerializer(new RedisKeySerializer());
        return redisTemplate;
    }

    /**
     * 次redisTemplate为采集器中读取点位实时数据，因为该缓存数据为字符串
     * @param factory
     * @return
     * @author DING WEI
     * @date 12/7/21 1:52 PM
     * @version 1.0
     */
    @Bean("letsRedisTemplate4Point")
    public RedisTemplate<String, Object> letsRedisTemplate4Point(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        // key的序列化类型
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        // key haspmap序列化
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }

    /**
     * 此时，缓存的key是包名+方法名+参数列表，这样就很难会冲突了。
     *
     * @return
     */
    @Override
    @Bean
    public KeyGenerator keyGenerator() {
        KeyGenerator keyGenerator = (target, method, objects) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(target.getClass().getName());
            sb.append("::" + method.getName() + ":");
            for (Object obj : objects) {
                sb.append(obj.toString());
            }
            System.out.println("RedisConfig.keyGenerator()");
            return sb.toString();
        };
        return keyGenerator;
    }
}