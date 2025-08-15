package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 订单类型
 * @author Qiao
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum DemandOrderType implements IEnum<Object> {

    NOMAL("1", "一般订单"),
    EXCHANGE("2", "换货订单"),
    GIVE("3", "赠送订单"),
    STOCKUP("4", "备货订单"),
    ;

    private String value;

    private String name;

    DemandOrderType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DemandOrderType element : DemandOrderType.values()) {
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
        for (DemandOrderType element : DemandOrderType.values()) {
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
