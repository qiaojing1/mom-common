package com.lets.commons.log.aspect;

import com.lets.platform.common.pojo.annotation.EnableLog;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 日志静态切点
 * @author DING WEI
 * @date 8/17/21 10:30 AM
 * @version 1.0
 */
@Component
@Aspect
public class LogAdvisor extends StaticMethodMatcherPointcutAdvisor implements InitializingBean {

    private static final long serialVersionUID = 545158457213842666L;

    @Autowired
    private LogInterceptor logInterceptor;

    /**
     * 切入点方法匹配方式
     * */
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return (AnnotationUtils.findAnnotation(aClass, EnableLog.class) != null
                || AnnotationUtils.findAnnotation(method, EnableLog.class) != null);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.setAdvice(logInterceptor);
    }
}