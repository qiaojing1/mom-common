package com.lets.platform.common.pojo.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 校验BigDecimal范围
 * @ClassName ValidatedBigDecimal
 * @author: DING WEI
 * @create: 2023/09/20 19:16
 * @Version 1.0
 **/
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ValidatedBigDecimalHandler.class})
public @interface ValidBigDecimal {

    /**
     * 是否必传
     * @return
     */
    boolean required() default false;

    /** 默认最小值 */
    String min() default "0";
    /** 是否包含最小值 */
    boolean includeMin() default false;
    /** 默认最大值 */
    String max() default "9999999999.99";
    /** 是否包含最大值 */
    boolean includeMax() default true;

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
