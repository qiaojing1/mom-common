package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 编码类型 枚举
 *
 * @ClassName CodeTypeEnum
 * @author: QIAO
 * @create: 2021/08/18 08:45
 * @Version 1.0
 **/
public enum DateTypeEnum implements IEnum<Object> {

    CURRENT_DAY(1, "当日"),
    CURRENT_WEEK(2, "本周"),
    CURRENT_MONTH(3, "本月"),
    CURRENT_QUARTER(4, "本季度"),
    CURRENT_YEAR(5, "本年"),
    PAST_DAY(6, "昨日"),
    PAST_WEEK(7, "上周"),
    PAST_MONTH(8, "上月"),
    PAST_QUARTER(9, "上一季度"),
    ;

    private int value;

    private String source;

    DateTypeEnum(int value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static int getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return 0;
        }
        for (DateTypeEnum element : DateTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return 0;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DateTypeEnum element : DateTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
