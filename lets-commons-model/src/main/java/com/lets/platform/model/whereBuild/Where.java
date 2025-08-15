package com.lets.platform.model.whereBuild;

import com.lets.platform.common.pojo.enums.ConditionExpressionEnum;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Where {

    /**
     * 查询条件
     */
    ConditionExpressionEnum value() default ConditionExpressionEnum.EQUALS;

    /**
     * 查询字段
     */
    String column();

    /**
     * 目标字段
     */
    String targetField() default "";

    /**
     * 需要feign接口调用的服务名称
     */
    String serverName() default "";
    /**
     * 需要feign接口调用的接口名称
     */
    String feignUrl() default "";
    /**
     * 需要feign接口调用的请求方式
     */
    RequestMethod feignReqMethod() default RequestMethod.GET;

}
