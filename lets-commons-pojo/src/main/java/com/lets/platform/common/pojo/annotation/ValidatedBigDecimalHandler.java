package com.lets.platform.common.pojo.annotation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * 校验BigDecimal值的范围
 * @ClassName ValidatedBigDecimalHandler
 * @author: DING WEI
 * @create: 2023/09/20 19:16
 * @Version 1.0
 **/
public class ValidatedBigDecimalHandler implements ConstraintValidator<ValidBigDecimal, Object> {

    private boolean required = false;
    private BigDecimal minValue;
    private BigDecimal maxValue;
    private boolean includeMin;
    private boolean includeMax;

    @Override
    public void initialize(ValidBigDecimal constraintAnnotation) {
        this.minValue = new BigDecimal(constraintAnnotation.min());
        this.maxValue = new BigDecimal(constraintAnnotation.max());
        this.includeMin = constraintAnnotation.includeMin();
        this.includeMax = constraintAnnotation.includeMax();
        this.required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(Object param, ConstraintValidatorContext constraintValidatorContext) {
        if (required) {
            if (Objects.isNull(param) || StringUtils.isBlank(param.toString())) {
                return Boolean.FALSE;
            }
        }
        if (Objects.nonNull(param) && StringUtils.isNotBlank(param.toString())) {
            // 进行校验
            BigDecimal value = new BigDecimal(param.toString());
            if (includeMin) {
                if (includeMax) {
                    return minValue.compareTo(value) != 1 && maxValue.compareTo(value) != -1;
                } else {
                    return minValue.compareTo(value) != 1 && maxValue.compareTo(value) == 1;
                }
            } else {
                if (includeMax) {
                    return minValue.compareTo(value) == -1 && maxValue.compareTo(value) != -1;
                } else {
                    return minValue.compareTo(value) == -1 && maxValue.compareTo(value) == 1;
                }
            }
        }
        return Boolean.TRUE;
    }
}
