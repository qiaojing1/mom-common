package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库类型 枚举
 *
 * @author DING WEI
 * @version 1.0
 * @date 2022/5/12 10:18
 */
public enum NewDataItemTypeEnum implements IEnum<Object> {

    BOOLEAN("boolean", "布尔"),
    INT("int", "整型"),
    FLOAT("float", "浮点"),
    STRING("string", "字符串"),
    ;

    private String value;

    private String name;


    NewDataItemTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }


    public static NewDataItemTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (NewDataItemTypeEnum element : NewDataItemTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (NewDataItemTypeEnum element : NewDataItemTypeEnum.values()) {
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
        for (NewDataItemTypeEnum element : NewDataItemTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> result = new ArrayList<>();
        for (NewDataItemTypeEnum element : NewDataItemTypeEnum.values()) {
            result.add(element.getName());
        }
        return result;
    }
}
