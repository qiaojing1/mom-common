package com.lets.platform.common.pojo.util;

import java.util.UUID;

/**
 * ID生成器工具类；使用此类，需要在系统环境变量添加参数：LETSIOT_WORKID；例如：LETSIOT_WORKID=1；在分布式环境下，各服务器需要设置不一样的值
 **/
public class IdUtil {

    private static final long WORK_ID;
    private static final IdGenerator idGenerator;

    static {
        String workId = "10";
        WORK_ID = Long.parseLong(workId);
        idGenerator = new IdGenerator(WORK_ID);
    }

    public static synchronized long getId() {
        return idGenerator.nextId();
    }

    public static synchronized String getStrId() {
        long nextId = idGenerator.nextId();
        return String.valueOf(nextId);
    }

    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.trim().replaceAll("-", "");
    }

}
