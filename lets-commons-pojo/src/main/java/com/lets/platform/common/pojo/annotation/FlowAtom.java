package com.lets.platform.common.pojo.annotation;

import com.lets.platform.common.pojo.enums.WorkflowTypeEnum;

import java.lang.annotation.*;

/**
 * <p>
 * 原子服务注解
 * </p>
 *
 * @author FZY
 * @since 2023-11-10
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FlowAtom {
    /**
     * 菜单编码
     */
    String menuCode() default "";

    /**
     * 流程类型[1:审批流程;2:业务流程]
     */
    WorkflowTypeEnum type() default WorkflowTypeEnum.APPROVAL_PROCESS;

    /**
     * 业务编码(仅针对type=2的流程)
     */
    String businessKey() default "";

    /**
     * 原子服务编码
     */
    String code() default "";

    /**
     * 原子服务名称
     */
    String name() default "";

    /**
     * 是否是结束后任务(Y/N)
     */
    String isOnlyEndAtom() default "N";

}
