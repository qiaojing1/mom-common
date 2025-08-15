package com.lets.commons.redis.redlock;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * 锁
 */
@Component
public class RedisLocker implements DistributedLocker {

    private static final String LOCKER_PREFIX = "lock:";
    private static final int DEFAULT_WAIT_TIME = 10;

    @Resource
    private RedissonClient redissonClient;

    @Override
    public <T, I> T lock(String resourceName, AcquiredLockWorker<T, I> worker, I input) throws Exception {
        return lock(resourceName, worker, 100, input);
    }

    @Override
    public <T, I> T lock(String resourceName, AcquiredLockWorker<T, I> worker, int lockTime, I input) throws Exception {
        RLock lock = redissonClient.getLock(LOCKER_PREFIX + resourceName);
        // 等待10秒并在锁定时间后自动解锁
        boolean success = lock.tryLock(10, lockTime, TimeUnit.SECONDS);
        if (success) {
            try {
                return worker.invokeAfterLockAcquire(input);
            } finally {
                lock.unlock();
            }
        }
        throw new UnableToAcquireLockException();
    }

    @Override
    public RLock getLock(String key) {
        return getLock(key, DEFAULT_WAIT_TIME);
    }

    @Override
    public RLock getLock(String key, int waitTime) {
        RLock lock = redissonClient.getLock(LOCKER_PREFIX + key);
        try {
            if (lock.tryLock(waitTime, TimeUnit.SECONDS)) {
                return lock;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public void unlock(RLock lock) {
        lock.unlock();
    }
}
