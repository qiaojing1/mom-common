package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 物料字典类型 枚举
 * @author DING WEI
 * @date 8/29/21 10:19 AM
 * @version 1.0
 */
public enum QualityTestingToolDictTypeEnum implements IEnum<Object> {

    CLASSIFY("0", "质检工具分类"),
    UNIT("1", "质检工具单位"),
    TOOL("2", "质检工具"),

    ;

    private String value;

    private String name;

    QualityTestingToolDictTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (QualityTestingToolDictTypeEnum element : QualityTestingToolDictTypeEnum.values()) {
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
        for (QualityTestingToolDictTypeEnum element : QualityTestingToolDictTypeEnum.values()) {
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
