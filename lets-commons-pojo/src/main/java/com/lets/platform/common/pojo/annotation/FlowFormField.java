package com.lets.platform.common.pojo.annotation;


import java.lang.annotation.*;

/**
 * <p>
 * 流程操作
 * </p>
 *
 * @author FZY
 * @since 2023-11-10
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FlowFormField {

    /**
     * 字段key
     */
    String key();

    /**
     * 字段名称
     */
    String name();
}
