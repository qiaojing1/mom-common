package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 质检状态 需求订单来源
 * @author Qiao
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum DemandOrderSource implements IEnum<Object> {

    SALESORDER("1", "销售订单"),
    STOCKUP("2", "备货订单"),
    ;

    private String value;

    private String name;

    DemandOrderSource(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DemandOrderSource element : DemandOrderSource.values()) {
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
        for (DemandOrderSource element : DemandOrderSource.values()) {
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
