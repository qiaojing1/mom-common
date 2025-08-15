package com.lets.platform.common.pojo.annotation;

import java.lang.annotation.*;

/**
 * 日志注解
 * @author DING WEI
 * @date 8/17/21 10:21 AM
 * @version 1.0
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableLog {

    String value() default "";

    String belongMenu() default "";

    String triggerEvent() default "";
}
