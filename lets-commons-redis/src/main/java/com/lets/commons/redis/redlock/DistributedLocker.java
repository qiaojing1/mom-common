package com.lets.commons.redis.redlock;

import org.redisson.api.RLock;

/**
 * 获取锁管理类
 *
 * @version 1.0 @ClassName DistributedLocker
 * @author: DING WEI
 * @create: 2021/05/21 16:46
 */
public interface DistributedLocker {

  /**
   * 获取锁
   *
   * @param resourceName 锁的名称
   * @param worker 获取锁后的处理类
   * @param input
   * @param <T>
   * @return 处理完具体的业务逻辑要返回的数据
   * @throws UnableToAcquireLockException
   * @throws Exception
   */
  <T, I> T lock(String resourceName, AcquiredLockWorker<T, I> worker, I input)
      throws UnableToAcquireLockException, Exception;

  /**
   * 获取锁
   *
   * @param resourceName
   * @param worker
   * @param lockTime
   * @param input
   * @return
   * @author DING WEI
   * @date 2021/5/21 16:48
   * @version 1.0
   * @throws UnableToAcquireLockException
   * @throws Exception
   */
  <T, I> T lock(String resourceName, AcquiredLockWorker<T, I> worker, int lockTime, I input)
      throws UnableToAcquireLockException, Exception;

  RLock getLock(String key);

  RLock getLock(String key, int waitTime);

  void unlock(RLock lock);
}
