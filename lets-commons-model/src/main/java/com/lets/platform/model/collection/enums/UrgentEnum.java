package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 预警等级 枚举
 *
 * @ClassName UrgentEnum
 * @author: DING WEI
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum UrgentEnum implements IEnum<Object> {

    LOW("1", "低"),
    JUST_SO_SO("2", "一般"),
    HIGH("3", "高");
    ;

    private String value;

    private String name;

    UrgentEnum(String value, String name) {
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
        for (UrgentEnum element : UrgentEnum.values()) {
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
