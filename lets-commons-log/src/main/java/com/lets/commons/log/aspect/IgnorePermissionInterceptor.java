package com.lets.commons.log.aspect;

import com.lets.commons.redis.constant.RedisConstant;
import com.lets.commons.security.util.SecurityUtils;
import com.lets.platform.common.pojo.annotation.LetsPermission;
import com.lets.platform.common.pojo.base.ServiceAssert;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.Set;

/**
 * 创建环绕通知,拦截指定方法
 * @author DING WEI
 * @date 8/17/21 10:33 AM
 * @version 1.0
 */
@Component
public class IgnorePermissionInterceptor implements MethodInterceptor {

    @Autowired
    private RedisTemplate<String, Object> letsRedisTemplate;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        LetsPermission annotation = invocation.getMethod().getAnnotation(LetsPermission.class);
        if (Objects.nonNull(annotation)) {
            String resUrl = request.getRequestURI();
            Object roleIdObject = letsRedisTemplate.opsForHash().get(RedisConstant.RBAC_URL_ROLES + SecurityUtils.getTenancyId(), resUrl);
            if (roleIdObject != null && roleIdObject instanceof Set && !CollectionUtils.isEmpty((Set<String>) roleIdObject)) {
                Set<String> roleCodeSet = (Set<String>) roleIdObject;
                String userId = SecurityUtils.getUserId();
                Object roleObject = letsRedisTemplate.opsForHash().get(RedisConstant.RBAC_USER_ROLES, userId);
                if (roleObject != null && roleObject instanceof Set && !org.springframework.util.CollectionUtils.isEmpty((Set<String>)roleObject)) {
                    Set<String> roles = (Set<String>) roleObject;
                    ServiceAssert.isTrue(CollectionUtils.containsAny(roles, roleCodeSet), 0, "访问被拒绝，请联系管理员分配权限");
                }
            }
        }
        return invocation.proceed();
    }
}