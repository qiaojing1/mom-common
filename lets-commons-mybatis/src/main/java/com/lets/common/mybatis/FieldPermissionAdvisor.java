package com.lets.common.mybatis;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * 字段静态切点
 * @author DING WEI
 * @create 2022/03/04
 * @since 1.0.0
 */
@Component
@Aspect
public class FieldPermissionAdvisor extends StaticMethodMatcherPointcutAdvisor implements InitializingBean {

    private static final long serialVersionUID = 1L;

    @Resource
    private FieldPermissionInterceptor fieldPermissionInterceptor;

    /**
     * 切入点方法匹配方式
     * */
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        // 类注解 AnnotationUtils.findAnnotation(aClass, FieldPermission.class)
        // 方法注解 AnnotationUtils.findAnnotation(method, FieldPermission.class)
        return Objects.nonNull(AnnotationUtils.findAnnotation(method, FieldPermission.class));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setAdvice(fieldPermissionInterceptor);
    }
}