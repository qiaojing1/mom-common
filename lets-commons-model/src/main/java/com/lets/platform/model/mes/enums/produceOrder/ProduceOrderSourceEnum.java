package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 数据来源[1计划订单投放]
 * @author DING WEI
 * @date 2023/12/20 13:40
 * @version 1.0
 */
public enum ProduceOrderSourceEnum implements IEnum<Object> {

    MANUAL_CREATION("0", "手动创建"),
    PLAN_PUT_IN("1", "计划订单投放"),
    ;

    private String value;

    private String name;

    ProduceOrderSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceOrderSourceEnum element : ProduceOrderSourceEnum.values()) {
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
        for (ProduceOrderSourceEnum element : ProduceOrderSourceEnum.values()) {
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
