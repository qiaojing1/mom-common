package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 下料状态 0未发出、1部分发出、2全部发出、3未接收、4部分接收、5全部接收
 * @author DING WEI
 * @date 2025/6/17 18:06
 * @version 1.0
 */
public enum CuttingStatusEnum implements IEnum<Object> {

    NOT_DISPATCHED(0, "未发出"),
    PARTIALLY_DISPATCHED(1, "部分发出"),
    FULLY_DISPATCHED(2, "全部发出"),
    NOT_RECEIVED(3, "未接收"),
    PARTIALLY_RECEIVED(4, "部分接收"),
    FULLY_RECEIVED(5, "全部接收"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    CuttingStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CuttingStatusEnum element : CuttingStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CuttingStatusEnum element : CuttingStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
