package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 物料齐套 枚举
 * @author Qiao
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum SatisfyEnum implements IEnum<Object> {

    NOT("0", "未计算"),
    SATISFY("1", "满足"),
    NOT_SATISFY("2", "不满足"),
    ;

    private String value;

    private String name;

    SatisfyEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SatisfyEnum element : SatisfyEnum.values()) {
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
        for (SatisfyEnum element : SatisfyEnum.values()) {
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
        return name;
    }

}
