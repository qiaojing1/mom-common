package com.lets.platform.common.pojo.base;

import com.alibaba.ttl.TransmittableThreadLocal;

public final class SqlTransConfig
{

    private static TransmittableThreadLocal<Boolean> cfg = new TransmittableThreadLocal<Boolean>();


    public static void stopTran()
    {
        cfg.set(false);
    }

    public static void startTran()
    {
        cfg.set(true);
    }

    public static boolean getTranFlag()
    {
        return cfg.get();
    }
}
