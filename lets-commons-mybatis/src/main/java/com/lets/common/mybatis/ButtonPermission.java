package com.lets.common.mybatis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 按钮权限注解
 * @author DING WEI
 * @date 8/24/21 8:04 AM
 * @version 1.0
 */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ButtonPermission {

    /** 是否开启 */
    boolean enable() default true;
}
