package com.lets.platform.common.pojo.annotation;


import com.lets.platform.common.pojo.constant.FlowActionMethodEnum;

import java.lang.annotation.*;

/**
 * <p>
 * 流程操作
 * </p>
 *
 * @author FZY
 * @since 2023-11-10
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FlowAction {

    /**
     * 菜单编码
     */
    String menuCode() default "";

    /**
     * 操作
     */
    FlowActionMethodEnum method() default FlowActionMethodEnum.SUBMIT;
}
