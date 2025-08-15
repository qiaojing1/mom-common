package com.lets.platform.common.pojo.annotation;


import java.lang.annotation.*;

/**
 * <p>
 * 流程表单配置
 * </p>
 *
 * @author FZY
 * @since 2023-11-10
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FlowFormConfiguration {

    /**
     * 菜单编码
     */
    String menuCode();

    /**
     * 路由名称
     */
    String routeName();

    /**
     * 主键
     */
    String key() default "id";

    FlowFormField[] fields() default {};
}
