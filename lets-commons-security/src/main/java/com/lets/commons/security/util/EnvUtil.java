package com.lets.commons.security.util;

import com.google.common.base.Strings;
import com.lets.commons.security.pojo.EnvironEntity;
import com.lets.commons.security.pojo.UserVo;
import com.lets.platform.common.pojo.exception.LetsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * Created by 乔静 on 2022/3/24.
 */
public class EnvUtil {
    private static final Logger logger = LoggerFactory.getLogger(EnvUtil.class);


    public static String getCurrentToken() {
        return EnvironEntity.getToken();
    }

    public static String getCurClientType() {
        return EnvironEntity.getClientType();
    }

    public static String getCurModule() {
        return EnvironEntity.getModule();
    }

    public static String getCurView() {
        return EnvironEntity.getView();
    }

    public static void deleteTokenKey() {
        EnvironEntity.delTokenKey();
    }

    public static String getTokenKey() {
        return EnvironEntity.getTokenKey();
    }

    /*
       获取当前用户语言
       返回 default、 en、zh等
     */
    public static String getCurLanguage() {
        String language = EnvironEntity.getLanguage();
        if (StringUtils.isEmpty(language)) {
            language = "zh-CN";
        }
        return language;
    }

    /*
        这里 返回当前登录用户的id，如果需要获取当前登录用户的其它信息，从 getCurUserObject 中获取
     */
    public static String getCurUser() {
        return getCurUserObject().getId();
    }


    public static UserVo getCurUserObject() {
        UserVo userVo = ThreadEnvUtil.getUserObject();
        if (userVo != null && !Strings.isNullOrEmpty(userVo.getId())) {
            return userVo;
        }
        throw new LetsException(401, "用户未登录");
    }
}
