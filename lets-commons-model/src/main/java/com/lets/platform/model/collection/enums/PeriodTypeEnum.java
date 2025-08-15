package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 时段类型[1:尖峰时段,2:峰平谷时段]
 * @author DING WEI
 * @date 2024/12/30 14:14
 * @version 1.0
 */
public enum PeriodTypeEnum implements IEnum<Object> {

    TIP_PEAK_FLAT_VALLEY("1", "尖峰时段"),
    PEAK_FLAT_VALLEY("2", "峰平谷时段"),
    ;

    private String value;

    private String name;

    PeriodTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PeriodTypeEnum element : PeriodTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
