package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 反查类型 [1逐级反查2单级反查3末级反查]
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum ReverseTypeEnum implements IEnum<Object> {

    EVERY_STAGE("1", "逐级反查"),
    SINGLE_STAGE("2", "单级反查"),
    LAST_STAGE("3", "末级反查"),

    ;

    private String value;

    private String name;

    ReverseTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReverseTypeEnum element : ReverseTypeEnum.values()) {
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
        for (ReverseTypeEnum element : ReverseTypeEnum.values()) {
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
