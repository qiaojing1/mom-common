package com.lets.platform.model.psi.entity;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 采购申请-数据来源
 * @author DING WEI
 * @date 2023/12/20 13:40
 * @version 1.0
 */
public enum PurchaseApplyOrderSourceEnum implements IEnum<Object> {

    MANUAL_CREATION("0", "手动创建"),
    PLAN_PUT_IN("1", "计划订单投放"),
    ;

    private String value;

    private String name;

    PurchaseApplyOrderSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PurchaseApplyOrderSourceEnum element : PurchaseApplyOrderSourceEnum.values()) {
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
        for (PurchaseApplyOrderSourceEnum element : PurchaseApplyOrderSourceEnum.values()) {
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
