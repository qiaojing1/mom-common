package com.lets.commons.security.util;

import com.lets.commons.security.pojo.EnvironEntity;
import com.lets.commons.security.pojo.User;
import com.lets.commons.security.pojo.UserVo;
import com.lets.platform.common.pojo.exception.LetsException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 鉴权工具类,获取当前请求中用户信息
 **/
@Slf4j
@Component
public class SecurityUtils {

    /**
     * 令牌缓存前缀
     */
    public static final String AUTH_PREFIX = "auth:";
    /**
     * 未知的
     */
    private static final String UNKNOWN = "unknown";
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 获取用户名称
     *
     * @return String 用户名称
     * @author DING WEI
     */
    public static String getUsername() {
        User user = getPrincipal();
        return user.getUsername();
    }


    /**
     * 获取用户数据
     *
     * @return User 用户对象
     * @author DING WEI
     */
    public static User getPrincipal() {
        UserVo user = ThreadEnvUtil.getUserObject();
        User u = new User();
        BeanUtils.copyProperties(user, u);
        if (StringUtils.isNotBlank(u.getId())) {
            return u;
        }
        throw new LetsException(401, "用户未登录");
    }

    /**
     * 判断用户是否拥有目标角色
     *
     * @param role 角色名称
     * @return boolean true 拥有
     * @author DING WEI
     */
    public static boolean hasRole(String role) {
        User user = getPrincipal();
        return user.getRoles().contains(role);
    }


    /**
     * 获取用户Id
     *
     * @return Long 用户Id
     * @author DING WEI
     */
    public static String getUserId() {
        User user = getPrincipal();
        return user.getId();
    }

    /**
     * 获取租户ID
     *
     * @return String
     * @author DING WEI
     * @date 2021/04/23 13:24
     */
    public static String getTenancyId() {
        User user = getPrincipal();
        return user.getTenancyId();
    }

    public static String getClientId() {
        return EnvironEntity.getClientType();
    }

    public static String getLanguage() {
        return EnvironEntity.getLanguage();
    }

    public static String getCurrentToken() {
        return EnvironEntity.getToken();
    }

    public static String getCurClientType() {
        return EnvironEntity.getClientType();
    }

    public static String getCurModule() {
        return EnvironEntity.getModule();
    }

    public static String getTokenKey() {
        return EnvironEntity.getTokenKey();
    }

    /**
     * 获取用户角色类型
     *
     * @return String
     * @author DING WEI
     * @date 2021/04/23 13:24
     */
    public static String getRoleType() {
        User user = getPrincipal();
        return user.getRoleType();
    }

    /**
     * 判断是否拥有资源
     *
     * @param resource 资源名称
     * @return boolean true 拥有
     * @author DING WEI
     */
    public static boolean hasResource(String resource) {
        User user = getPrincipal();
        return user.getResources().contains(resource);
    }


    /**
     * 密码加密
     *
     * @param password 密码
     * @return String 加密后的密码
     * @author DING WEI
     */
    public static String encrypt(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    /**
     * 校验密码hash是否匹配
     *
     * @param paw      密码
     * @param hashPass 密码hash值
     * @author DING WEI
     * @date 2021/04/23 14:16
     */
    public static Boolean matches(String paw, String hashPass) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.matches(paw, hashPass);
    }

    /**
     * 获取用户数据
     *
     * @author DING WEI
     * @date 2021/04/23 13:52
     */
    public static UserVo currentUser() {
        return ThreadEnvUtil.getUserObject();
    }

    @PostConstruct
    public void init() {
        SecurityUtils securityUtils = this;
        securityUtils.redisTemplate = this.redisTemplate;
    }
}