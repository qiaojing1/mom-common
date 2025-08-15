package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 线边库类型 枚举
 * @author DING WEI
 * @date 8/29/21 10:19 AM
 * @version 1.0
 */
public enum LineStoreTypeEnum implements IEnum<Object> {

    STORE("1", "线边库"),
    AREA("2", "线边库区"),
    ;

    private String value;

    private String name;

    LineStoreTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (LineStoreTypeEnum element : LineStoreTypeEnum.values()) {
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
        for (LineStoreTypeEnum element : LineStoreTypeEnum.values()) {
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
