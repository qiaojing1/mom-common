package com.lets.platform.common.pojo.message;

import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.enums.I18nTypeEnum;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.Objects;

/**
 * 获取信息 工具类
 *
 * @author: DING WEI
 * @date: 2023/4/11 11:06
 */
@Component
public class I18nUtils {

    public static I18nUtils i18nUtils;

    @Resource
    private MessageSource messageSource;

    /**
     * 获取单个国际化翻译值
     *
     * @param msgKey
     * @see com.lets.platform.common.pojo.enums.ExceptionEnums {@msgKey}
     */
    public static String getKey(String msgKey) {
        return getKey(msgKey, null, null);
    }

    /**
     * 获取单个国际化翻译值
     *
     * @param msgKey
     * @see com.lets.platform.common.pojo.enums.ExceptionEnums {@msgKey}
     */
    public static String getKey(ExceptionEnums msgKey) {
        return getKey(msgKey.getDescription(), null, null);
    }

    /**
     * 获取单个国际化翻译值
     *
     * @param msgKey
     * @param params 动态数据,消息模板中{0},{1}
     * @see com.lets.platform.common.pojo.enums.ExceptionEnums {@msgKey}
     */
    public static String getKey(String msgKey, Object... params) {
        try {
            String lang = I18nTypeEnum.ZH_CH.getValue();
            if (RequestContextHolder.getRequestAttributes() != null) {
                HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                lang = request.getHeader("lang");
            }
            if (I18nTypeEnum.EN_US.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, params, "", Locale.US);
            } else if (I18nTypeEnum.ZH_CH.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, params, "", Locale.CHINA);
            } else if (I18nTypeEnum.JA_JP.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, params, "", Locale.JAPAN);
            }
            return i18nUtils.messageSource.getMessage(msgKey, params, "", Locale.CHINA);
        } catch (Exception e) {
            return msgKey;
        }
    }

    public static String getKey(ExceptionEnums msgKey, Object... params) {
        return getKey(msgKey.getDescription(), params);
    }

    /**
     * 获取单个国际化翻译值
     *
     * @param msgKey
     * @param request
     * @see com.lets.platform.common.pojo.enums.ExceptionEnums {@msgKey}
     */
    public static String getKey(String msgKey, HttpServletRequest request) {
        try {
            if (Objects.isNull(request)) {
                request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            }
            String lang = request.getHeader("lang");
            if (I18nTypeEnum.EN_US.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, null, msgKey, Locale.US);
            } else if (I18nTypeEnum.ZH_CH.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, null, msgKey, Locale.CHINA);
            } else if (I18nTypeEnum.JA_JP.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, null, msgKey, Locale.JAPAN);
            }
            return i18nUtils.messageSource.getMessage(msgKey, null, msgKey, Locale.CHINA);
        } catch (Exception e) {
            return msgKey;
        }
    }

    public static String getKey(ExceptionEnums msgKey, HttpServletRequest request) {
        return getKey(msgKey.getDescription(), request);
    }

    /**
     * 获取单个国际化翻译值
     *
     * @param msgKey
     * @param params  动态数据,消息模板中{0},{1}
     * @param request 请求
     * @see com.lets.platform.common.pojo.enums.ExceptionEnums {@msgKey}
     */
    public static String getKey(String msgKey, HttpServletRequest request, Object... params) {
        try {
            String lang;
            if (request == null) {
                try {
                    ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                    if (servletRequestAttributes != null) {
                        request = servletRequestAttributes.getRequest();
                        lang = request.getHeader("lang");
                    } else {
                        lang = I18nTypeEnum.ZH_CH.getValue();
                    }
                } catch (Exception e) {
                    lang = I18nTypeEnum.ZH_CH.getValue();
                }
            } else {
                lang = request.getHeader("lang");
            }
            if (I18nTypeEnum.EN_US.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, params, msgKey, Locale.US);
            } else if (I18nTypeEnum.ZH_CH.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, params, msgKey, Locale.CHINA);
            } else if (I18nTypeEnum.JA_JP.getValue().equals(lang)) {
                return i18nUtils.messageSource.getMessage(msgKey, params, msgKey, Locale.JAPAN);
            }
            return i18nUtils.messageSource.getMessage(msgKey, params, msgKey, Locale.CHINA);
        } catch (Exception e) {
            return msgKey;
        }
    }

    public static String getKey(ExceptionEnums msgKey, HttpServletRequest request, Object... params) {
        return getKey(msgKey.getDescription(), request, params);
    }

    @PostConstruct
    public void init() {
        i18nUtils = this;
        i18nUtils.messageSource = this.messageSource;
    }
}
