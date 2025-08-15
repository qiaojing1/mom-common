package com.lets.platform.common.pojo.annotation;

import com.lets.platform.common.pojo.base.WorkflowRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import({WorkflowRegister.class})
public @interface ItemsScan {

    String[] basePackages() default {};
}