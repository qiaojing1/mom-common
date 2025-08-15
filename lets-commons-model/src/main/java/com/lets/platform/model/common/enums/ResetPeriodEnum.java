package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 重置周期 枚举
 *
 * @ClassName ResetPeriodEnum
 * @author: QIAO
 * @create: 2021/08/18 08:45
 * @Version 1.0
 **/
public enum ResetPeriodEnum implements IEnum<Object> {

    NONE("0", "无"),
    DAY("1", "日"),
    WEEK("2", "周"),
    MONTH("3", "月"),
    YEAR("4", "年"),
    FIELD("5", "字段"),
    ;

    private String value;

    private String source;

    ResetPeriodEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ResetPeriodEnum element : ResetPeriodEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ResetPeriodEnum element : ResetPeriodEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }
}
