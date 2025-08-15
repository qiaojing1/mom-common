package com.lets.commons.security.pojo;

import com.alibaba.ttl.TransmittableThreadLocal;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class GlobalMemcache {

    private static final Map<String, TransmittableThreadLocal<Object>> threadLocalMap = new ConcurrentHashMap<>();

    private static final byte[] lock = new byte[0];

    public static void setL(String key, Object obj) {
        TransmittableThreadLocal<Object> tl = threadLocalMap.get(key);
        if (obj == null) {
            if (tl != null) {
                tl.set(null);
            }
            return;
        }
        if (tl == null) {
            synchronized (lock) {
                tl = threadLocalMap.get(key);
                if (tl == null) {
                    tl = new TransmittableThreadLocal<>();
                }
            }
        }
        tl.set(obj);
        threadLocalMap.put(key, tl);
    }

    public static Object getL(String key) {
        TransmittableThreadLocal<Object> tl = threadLocalMap.get(key);
        if (tl == null) {
            return null;
        }
        return tl.get();
    }

    public static void del(String key) {
        TransmittableThreadLocal<Object> tl = threadLocalMap.get(key);
        if (Objects.nonNull(tl)) {
            tl.remove();
            threadLocalMap.remove(key);
        }
    }
}
