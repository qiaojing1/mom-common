package com.lets.commons.redis.redlock;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * 锁
 *
 * @version 1.0
 * @ClassName RedisLockerThreeParam
 * @author: DING WEI
 * @create: 2021/05/21 16:51
 **/
@Component
public class RedisLockerThreeParam implements DistributedLockerThreeParam {

    private final static String LOCKER_PREFIX = "lock_three_param:";

    @Resource
    private RedissonClient redissonClient;

    @Override
    public <T, I, C> T lock(String resourceName, AcquiredLockWorkerThreeParam<T, I, C> worker, I input, C type) throws InterruptedException, UnableToAcquireLockException, Exception {
        return lock(resourceName, worker, 100, input, type);
    }

    @Override
    public <T, I, C> T lock(String resourceName, AcquiredLockWorkerThreeParam<T, I, C> worker, int lockTime, I input, C type) throws UnableToAcquireLockException, Exception {
        RLock lock = redissonClient.getLock(LOCKER_PREFIX + resourceName);
        // 等待10秒并在锁定时间后自动解锁
        boolean success = lock.tryLock(10, lockTime, TimeUnit.SECONDS);
        if (success) {
            try {
                return worker.invokeAfterLockAcquire(input, type);
            } finally {
                lock.unlock();
            }
        }
        throw new UnableToAcquireLockException();
    }

}
