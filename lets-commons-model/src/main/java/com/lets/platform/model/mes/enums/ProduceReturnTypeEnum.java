package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产退料类型 枚举
 * @author DING WEI
 * @date 2022/5/23 13:33
 * @version 1.0
 */
public enum ProduceReturnTypeEnum implements IEnum<Object> {

    PRODUCTION("1", "生产退料"),
    CONSUMABLES("2", "耗材退料"),
    ;

    private String value;

    private String name;

    ProduceReturnTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceReturnTypeEnum element : ProduceReturnTypeEnum.values()) {
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
        for (ProduceReturnTypeEnum element : ProduceReturnTypeEnum.values()) {
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
