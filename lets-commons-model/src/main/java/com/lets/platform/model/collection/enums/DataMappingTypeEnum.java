package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据映射类型 枚举
 *
 * @ClassName DataMappingTypeEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum DataMappingTypeEnum implements IEnum<Object> {

    FORMAT_CONVERT("1", "格式转换"),
    NUMERICAL_CONVERT("2", "数值转换"),
    ;

    private String value;

    private String name;

    DataMappingTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DataMappingTypeEnum element : DataMappingTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DataMappingTypeEnum element : DataMappingTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (DataMappingTypeEnum element : DataMappingTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (DataMappingTypeEnum element : DataMappingTypeEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
