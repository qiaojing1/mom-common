package com.lets.commons.redis.util;

import com.lets.commons.redis.redlock.RedisLocker;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.model.whereBuild.SpringContextUtil;
import org.redisson.api.RLock;

public class RedisLockUtil {
    private RedisLockUtil() {
    }

    public static RLock getLock(String key) {
        RedisLocker locker = (RedisLocker) SpringContextUtil.getApplicationContext().getBean("redisLocker");
        return locker.getLock(key);
    }

    public static RLock getLock(String key, int waitTime) {
        RedisLocker locker = (RedisLocker) SpringContextUtil.getApplicationContext().getBean("redisLocker");
        RLock lock = locker.getLock(key, waitTime);
        ServiceAssert.notNull(lock, "获取锁失败");
        return lock;
    }

    public static void unlock(RLock lock) {
        RedisLocker locker = (RedisLocker) SpringContextUtil.getApplicationContext().getBean("redisLocker");
        locker.unlock(lock);
    }

}
