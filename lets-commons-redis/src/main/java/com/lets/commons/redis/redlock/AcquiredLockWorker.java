package com.lets.commons.redis.redlock;

/**
 * 获取锁后需要处理的逻辑
 *
 * @version 1.0
 * @ClassName AcquiredLockWorker
 * @author: DING WEI
 * @create: 2021/05/21 16:43
 **/
public interface AcquiredLockWorker<T, I> {

    /**
     * 获得锁之后的处理逻辑
     * @param input
     * @return
     * @author DING WEI
     * @date 2021/5/21 16:45
     * @version 1.0
     * @throws Exception
     **/
    T invokeAfterLockAcquire(I input) throws Exception;

}
