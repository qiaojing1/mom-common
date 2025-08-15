package com.lets.common.mybatis;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * 按钮静态切点
 * @author DING WEI
 * @create 2022/03/04
 * @since 1.0.0
 */
@Component
@Aspect
public class ButtonPermissionAdvisor extends StaticMethodMatcherPointcutAdvisor implements InitializingBean {

    private static final long serialVersionUID = 545158457213842666L;

    @Autowired
    private ButtonPermissionInterceptor buttonPermissionInterceptor;

    /**
     * 切入点方法匹配方式
     * */
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        // 类注解 AnnotationUtils.findAnnotation(aClass, ButtonPermission.class)
        // 方法注解 AnnotationUtils.findAnnotation(method, ButtonPermission.class)
        return Objects.nonNull(AnnotationUtils.findAnnotation(method, ButtonPermission.class));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setAdvice(buttonPermissionInterceptor);
    }
}