package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 用料清单变更方式
 * @author DING WEI
 * @date 2025/2/18 11:02
 * @version 1.0
 */
public enum BillChangeMethodEnum implements IEnum<Object> {

    WHOLE_ORDER("1", "按整单变更"),
    DETAIL("2", "按明细变更"),

    ;

    private final String value;

    @Getter
    private final String name;

    BillChangeMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BillChangeMethodEnum element : BillChangeMethodEnum.values()) {
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
        for (BillChangeMethodEnum element : BillChangeMethodEnum.values()) {
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

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
