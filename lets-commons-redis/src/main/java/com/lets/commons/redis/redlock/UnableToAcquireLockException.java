package com.lets.commons.redis.redlock;

/**
 * 异常类
 *
 * @version 1.0
 * @ClassName UnableToAcquireLockException
 * @author: DING WEI
 * @create: 2021/05/21 16:47
 **/
public class UnableToAcquireLockException extends RuntimeException {

    public UnableToAcquireLockException() {
    }

    public UnableToAcquireLockException(String message) {
        super(message);
    }

    public UnableToAcquireLockException(String message, Throwable cause) {
        super(message, cause);
    }
}
