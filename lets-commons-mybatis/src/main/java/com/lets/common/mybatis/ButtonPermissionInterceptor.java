package com.lets.common.mybatis;

import com.lets.commons.redis.constant.RedisConstant;
import com.lets.commons.security.access.ResourceServerSecurityAccessConfiguration;
import com.lets.commons.security.pojo.User;
import com.lets.commons.security.util.SecurityUtils;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.RoleTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 按钮权限-拦截器
 * @author DING WEI
 * @date 8/23/21 9:12 PM
 * @version 1.0
 */
@Component
@Slf4j
public class ButtonPermissionInterceptor implements MethodInterceptor {

    @Autowired
    private RedisTemplate<String, Object> letsRedisTemplate;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        ButtonPermission annotation = method.getAnnotation(ButtonPermission.class);
        if (Objects.nonNull(annotation)) {
            // 获取当前请求
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if (Objects.nonNull(attributes)) {
                if (annotation.enable()) {
                    User principal = SecurityUtils.getPrincipal();
                    String roleType = principal.getRoleType();
                    String userId = principal.getId();
                    String tenancyId = principal.getTenancyId();
                    // 超级管理员、系统管理员 放行
                    if (RoleTypeEnum.SUPER_ADMIN_ROLE.getValue().equals(roleType)
                            || RoleTypeEnum.SYS_ADMIN_ROLE.getValue().equals(roleType)) {
                        return invocation.proceed();
                    }
                    HttpServletRequest request = attributes.getRequest();
                    String resUrl = request.getRequestURI();
                    // 如果是current请求直接忽略
                    if (GlobalConstant.CURRENT.equals(resUrl)) {
                        return invocation.proceed();
                    }

                    // 来自服务内部feign直接忽略
                    String requestFrom = request.getHeader(GlobalConstant.REQUEST_FROM);
                    if (GlobalConstant.SERVER_INNER.equals(requestFrom)) {
                        return invocation.proceed();
                    }

                    // 系统中 配置过的不需要 权限的接口
                    String[] excludedAuthPages = ResourceServerSecurityAccessConfiguration.EXCLUDED_AUTH_PAGES;
                    for (String excludedAuthPage : excludedAuthPages) {
                        // Url匹配
                        if (antPathMatcher.match(excludedAuthPage, resUrl)) {
                            return invocation.proceed();
                        }
                    }
                    // 获取 当前url需要的角色
                    Set<String> roleCodeSet = new HashSet<>();
                    Object roleIdObject = letsRedisTemplate.opsForHash().get(RedisConstant.RBAC_URL_ROLES + tenancyId, resUrl);
                    if (roleIdObject != null && roleIdObject instanceof Set && !CollectionUtils.isEmpty((Set<String>) roleIdObject)) {
                        roleCodeSet = (Set<String>) roleIdObject;
                        roleCodeSet.removeAll(Collections.singleton(null));
                    }
                    ServiceAssert.isTrue(!CollectionUtils.isEmpty(roleCodeSet), 0, GlobalConstant.PERMISSION_LIMIT);
                    // 获取 当前用户 的角色
                    Object roleObject = letsRedisTemplate.opsForHash().get(RedisConstant.RBAC_USER_ROLES, userId);
                    Set<String> hasRoles = new HashSet<>();
                    if (roleObject != null && roleObject instanceof Set && !CollectionUtils.isEmpty((Set<String>)roleObject)) {
                        hasRoles = (Set<String>) roleObject;
                        hasRoles.removeAll(Collections.singleton(null));
                    }
                    ServiceAssert.isTrue(CollectionUtils.containsAny(hasRoles, roleCodeSet), 0, GlobalConstant.PERMISSION_LIMIT);
                }
            }
        }
        return invocation.proceed();
    }

}
