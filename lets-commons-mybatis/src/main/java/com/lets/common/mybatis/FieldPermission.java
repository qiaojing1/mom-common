package com.lets.common.mybatis;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 字段权限注解
 * @author DING WEI
 * @date 8/24/21 8:04 AM
 * @version 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldPermission {

    /** 是否开启 */
    boolean enable() default true;

    /** 所属菜单 */
    String menuCode() default "";

    /** 权限字段的层级所在 */
    String[] levelField() default {};

    Class clazz() default Object.class;

}
