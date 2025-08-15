package com.lets.platform.common.pojo.annotation;

import com.lets.platform.common.pojo.enums.IEnum;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 校验是否是枚举中的值
 * @ClassName ValidatedEnum
 * @author: DING WEI
 * @create: 2021/01/14 19:16
 * @Version 1.0
 **/
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ValidatedEnumHandler.class})
public @interface ValidatedEnum {

    /**
     * 是否必传
     * @return
     */
    boolean required() default false;

    /**
     * @return 指定枚举类型，参数值必须是这个枚举类型中的值
     */
    Class<? extends IEnum<Object>> enumClass();

    /**
     * @return 需要排除的值
     */
    String[] exclusion() default {};

    /**
     * @return the error message template
     */
    String message() default "参数非法;";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * Defines several {@link NotNull} annotations on the same element.
     * @see NotNull
     */
    @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
    @Retention(RUNTIME)
    @Documented
    @interface List {
        NotNull[] value();
    }

}
