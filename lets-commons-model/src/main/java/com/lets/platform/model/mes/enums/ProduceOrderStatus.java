package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产工单状态 1未投产、2已投产、3进行中、4已暂停、5强制完成、6已完成
 * @author DING WEI
 * @date 9/24/21 15:52
 * @version 1.0
 */
public enum ProduceOrderStatus implements IEnum<Object> {

    UN_PUT_PRODUCT("1", "未投产"),
    PUT_PRODUCT("2", "已投产"),
    PRODUCT_ING("3", "进行中"),
    SUSPEND("4", "已暂停"),
    FORCE_FINISH("5", "强制完成"),
    FINISH("6", "已完成"),
    ;

    private String value;

    private String name;

    ProduceOrderStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceOrderStatus element : ProduceOrderStatus.values()) {
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
        for (ProduceOrderStatus element : ProduceOrderStatus.values()) {
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
