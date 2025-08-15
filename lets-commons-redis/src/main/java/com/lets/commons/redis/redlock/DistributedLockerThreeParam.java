package com.lets.commons.redis.redlock;

/**
 * 获取锁管理类
 *
 * @version 1.0
 * @ClassName DistributedLockerThreeParam
 * @author: DING WEI
 * @create: 2021/05/21 16:46
 **/
public interface DistributedLockerThreeParam {

    /**
     * 获取锁
     * @param resourceName  锁的名称
     * @param worker 获取锁后的处理类
     * @param input
     * @param type
     * @param <T>
     * @return 处理完具体的业务逻辑要返回的数据
     * @throws UnableToAcquireLockException
     * @throws Exception
     */
    <T, I, C> T lock(String resourceName, AcquiredLockWorkerThreeParam<T, I, C> worker, I input, C type) throws UnableToAcquireLockException, Exception;

    /**
     * 获取锁
     * @param resourceName
     * @param worker
     * @param lockTime
     * @param input
     * @param type
     * @return
     * @author DING WEI
     * @date 2021/5/21 16:48
     * @version 1.0
     * @throws UnableToAcquireLockException
     * @throws Exception
     **/
    <T, I, C> T lock(String resourceName, AcquiredLockWorkerThreeParam<T, I, C> worker, int lockTime, I input, C type) throws UnableToAcquireLockException, Exception;

}
