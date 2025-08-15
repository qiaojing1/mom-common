package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 折旧方法 枚举
 *
 * @author zhangweiyan
 * @version 1.0
 * @date 11:55:43 2025/01/21
 */
public enum DepreciationMethodEnum implements IEnum<Object> {

    AverageAgeMethod("1", "年限平均法"),
    DoubleDecliningBalanceMethod("2", "双倍余额递减法"),
    SumOfYearsMethod("3", "年数总和法"),
    ;

    private String value;

    private String name;

    DepreciationMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DepreciationMethodEnum element : DepreciationMethodEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DepreciationMethodEnum element : DepreciationMethodEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static DepreciationMethodEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DepreciationMethodEnum element : DepreciationMethodEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}
