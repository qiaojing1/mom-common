package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 委外工序接收模式[0:汇总接收,1:按单接收]
 * @author DING WEI
 * @date 2025/5/26 16:38
 * @version 1.0
 */
public enum OutsourcingInModeEnum implements IEnum<Object> {

    TOTAL_RECEIVE("0", "汇总接收"),
    ORDER_RECEIVE("1", "按单接收"),

    ;

    private final String value;

    @Getter
    private final String name;

    OutsourcingInModeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OutsourcingInModeEnum element : OutsourcingInModeEnum.values()) {
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
        for (OutsourcingInModeEnum element : OutsourcingInModeEnum.values()) {
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
