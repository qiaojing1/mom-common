package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产工单类型 1普通工单、2重工工单
 * @author DING WEI
 * @date 9/24/21 15:52
 * @version 1.0
 */
public enum ProduceOrderType implements IEnum<Object> {

    ORDINARY_ORDER("1", "普通工单"),
    OVER_ORDER("2", "重工工单"),
    ;

    private String value;

    private String name;

    ProduceOrderType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceOrderType element : ProduceOrderType.values()) {
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
        for (ProduceOrderType element : ProduceOrderType.values()) {
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
