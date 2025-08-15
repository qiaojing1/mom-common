package com.lets.platform.common.pojo.annotation;

import com.lets.platform.common.pojo.enums.IEnum;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 校验枚举类型的value
 * @ClassName ValidatedEnumHandler
 * @author: DING WEI
 * @create: 2021/01/14 19:17
 * @Version 1.0
 **/
public class ValidatedEnumHandler implements ConstraintValidator<ValidatedEnum, Object> {

    private boolean required = false;
    private Class<? extends IEnum<Object>> enumClass;
    private String[] exclusion;
    private Set<String> valSet;

    @Override
    public void initialize(ValidatedEnum constraintAnnotation) {
        this.enumClass = constraintAnnotation.enumClass();
        this.exclusion = constraintAnnotation.exclusion();
        this.required = constraintAnnotation.required();
        valSet = new HashSet<>();
        IEnum<Object>[] enumConstants = enumClass.getEnumConstants();
        for (IEnum<Object> iEnum : enumConstants) {
            valSet.add(iEnum.getValue().toString());
        }
        for (String i : exclusion) {
            valSet.remove(i);
        }
    }

    @Override
    public boolean isValid(Object param, ConstraintValidatorContext constraintValidatorContext) {
        if (Objects.nonNull(param) && StringUtils.isNotBlank(param.toString())) {
            // 进行校验
            return valSet.contains(param.toString());
        } else {
            // value=null时，需要判断是否必传
            if (required == true) {
                // 必传，报错
                return false;
            } else {
                // 非必传，放行
                return true;
            }
        }
    }
}
