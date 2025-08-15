package com.lets.platform.model.common.util;

import cn.hutool.extra.spring.SpringUtil;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.common.pojo.message.I18nUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/**
 * validator的校验工具
 */
public class ValidateUtil {

    private static final AtomicReference<Validator> validatorRef = new AtomicReference<>();

    public static Validator getValidator() {
        validatorRef.compareAndSet(null, SpringUtil.getBean(Validator.class));
        return validatorRef.get();
    }

    /**
     * 校验实体类
     */
    public static <T> void validate(T t) {
        Set<ConstraintViolation<T>> constraintViolations = getValidator().validate(t);
        if (constraintViolations.size() > 0) {
            StringBuilder validateError = new StringBuilder();
            for (ConstraintViolation<T> constraintViolation : constraintViolations) {
                validateError.append(I18nUtils.getKey(constraintViolation.getMessage())).append(";");
            }
            throw new LetsException(GlobalConstant.ZERO, validateError.toString());
        }
    }

    /**
     * 通过组来校验实体类
     */
    public static <T> void validate(T t, Class<?>... groups) {
        Set<ConstraintViolation<T>> constraintViolations = getValidator().validate(t, groups);
        if (!constraintViolations.isEmpty()) {
            StringBuilder validateError = new StringBuilder();
            for (ConstraintViolation<T> constraintViolation : constraintViolations) {
                validateError.append(I18nUtils.getKey(constraintViolation.getMessage())).append(";");
            }
            throw new LetsException(GlobalConstant.ZERO, validateError.toString());
        }
    }
}
