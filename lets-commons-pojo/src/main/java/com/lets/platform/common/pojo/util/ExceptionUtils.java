package com.lets.platform.common.pojo.util;

import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.exception.LetsException;

import java.sql.SQLException;

/**
 * 解析Exception
 * @author: DING WEI
 * @date: 2024/1/24 13:27
 */
public class ExceptionUtils {

    public static void handle4LockCatch(Exception e) {
        e.printStackTrace();
        if (e instanceof LetsException) {
            LetsException lets = (LetsException) e;
            ServiceAssert.getThrow(0, lets.getContent());
        } else {
            Throwable cause = e.getCause();
            if (cause instanceof LetsException) {
                ServiceAssert.getThrow(0, cause.getMessage());
            } else if (cause instanceof SQLException) {
                SQLException sqlException = (SQLException) cause;
                ServiceAssert.getThrow(0, sqlException.getMessage());
            }
        }
        ServiceAssert.getThrow(0, "服务繁忙,稍后重试");
    }

    public static StringBuilder getMsg(Exception e) {
        StringBuilder msg = new StringBuilder();
        if (e instanceof LetsException) {
            LetsException lets = (LetsException) e;
            msg.append(lets.getContent());
        } else {
            Throwable cause = e.getCause();
            if (cause instanceof LetsException) {
                msg.append(cause.getMessage());
            } else if (cause instanceof SQLException) {
                SQLException sqlException = (SQLException) cause;
                msg.append(sqlException.getMessage());
            }
        }
        return msg;
    }
}
