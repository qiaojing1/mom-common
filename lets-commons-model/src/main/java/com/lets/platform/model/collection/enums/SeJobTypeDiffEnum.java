package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 作业类型-区分 枚举
 * @author DING WEI
 * @date 2023/2/1 10:10
 * @version 1.0
 */
public enum SeJobTypeDiffEnum implements IEnum<Object> {

    TYPE("1", "作业类型"),
    PROJECT("2", "作业项目"),
    ;

    private String value;

    private String name;

    SeJobTypeDiffEnum(String value, String name) {
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
        for (SeJobTypeDiffEnum element : SeJobTypeDiffEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
