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
public enum PartsSizeTypeEnum implements IEnum<Object> {
    //线性尺寸、角度尺寸、半径尺寸、直径尺寸、形位公差、表面粗糙度
    LINE("1", "线性尺寸"),
    ANGLE("2", "角度尺寸"),
    RADIUS("3", "半径尺寸"),
    DIAMETER("4", "直径尺寸"),
    POSITIONAL_TOLERANCE("5", "形位公差"),
    ROUGHNESS("6", "表面粗糙度"),
    ;

    private String value;

    private String name;

    PartsSizeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PartsSizeTypeEnum element : PartsSizeTypeEnum.values()) {
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
        for (PartsSizeTypeEnum element : PartsSizeTypeEnum.values()) {
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
        for (PartsSizeTypeEnum element : PartsSizeTypeEnum.values()) {
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
