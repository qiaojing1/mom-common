/*
 * csy
 */

package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 尺寸类型
 */
public enum SizeTypeEnum implements IEnum<Object> {
    //线性尺寸、倒圆半径和倒角高度尺寸、角度尺寸
    LINE("1", "线性尺寸"),
    RADIUS("2", "倒圆半径"),
    CHD("3", "倒角高度尺寸"),
    ANGLE("4", "角度尺寸"),
    ;

    private String value;

    private String name;

    SizeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SizeTypeEnum element : SizeTypeEnum.values()) {
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
        for (SizeTypeEnum element : SizeTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> nameLike(String key) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        List<String> list = new ArrayList<>();
        for (SizeTypeEnum element : SizeTypeEnum.values()) {
            if (element.getName().contains(key)) {
                list.add(element.getValue());
            }
        }
        return list;
    }


    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}
