package com.lets.commons.security.util;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.lets.commons.redis.util.UnitUtil;
import com.lets.commons.security.pojo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: LY
 * @Date: 2020/6/22 15:23
 */
public class ThreadEnvUtil {
    private static final Logger logger = LoggerFactory.getLogger(ThreadEnvUtil.class);

    protected static TransmittableThreadLocal<UserVo> userVoThreadLocal = new TransmittableThreadLocal<UserVo>() {
        protected UserVo initialValue() {
            return new UserVo();
        }
    };

    public static void SetUserObject(UserVo userVo) {
        userVoThreadLocal.set(userVo);
        UnitUtil.setTenancyId(userVo.getTenancyId());
    }

    public static void clear() {
        userVoThreadLocal.remove();
        SetUserObject(new UserVo());
    }

    public static UserVo getUserObject() {
        return userVoThreadLocal.get();
    }
}
