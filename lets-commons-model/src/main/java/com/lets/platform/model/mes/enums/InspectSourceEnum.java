package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;

/**
 * 检验项目来源
 */
public enum InspectSourceEnum implements IEnum<String> {
    SIZE("1", "阀门尺寸数据库"),
    MATERIAL("2", "材质数据库"),
    STANDARD("3", "试压标准库"),
    SALE("4", "销售订单"),
    CUSTOMIZE("5", "自定义"),
    PART_SIZE_INSPECT_BASE("6", "零件检验尺寸库"),
    PAINTING_PLAN("7", "油漆方案库"),
    ;

    private final String value;

    @Getter
    private final String name;

    InspectSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StrUtil.isEmpty(name)) {
            return null;
        }
        for (InspectSourceEnum element : InspectSourceEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (InspectSourceEnum element : InspectSourceEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static InspectSourceEnum getEnum(String value) {
        if (StrUtil.isEmpty(value)) {
            return null;
        }
        for (InspectSourceEnum element : InspectSourceEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
