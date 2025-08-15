package com.lets.commons.redis.redlock;

/**
 * 获取锁后需要处理的逻辑
 *
 * @version 1.0
 * @ClassName AcquiredLockWorkerThreeParam
 * @author: DING WEI
 * @create: 2021/05/21 16:43
 **/
public interface AcquiredLockWorkerThreeParam<T, I, C> {

    /**
     * 获得锁之后的处理逻辑
     * @param input
     * @param type
     * @return
     * @author DING WEI
     * @date 2021/5/21 16:45
     * @version 1.0
     * @throws Exception
     **/
    T invokeAfterLockAcquire(I input, C type) throws Exception;

}
