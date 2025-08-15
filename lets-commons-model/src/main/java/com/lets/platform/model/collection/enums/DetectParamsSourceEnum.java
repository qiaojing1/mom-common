package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 图表类型 枚举
 *
 * @ClassName RelationTypeEnum
 * @author: QIAO JING
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum DetectParamsSourceEnum implements IEnum<Object> {

    MATERIAL_FIELD("materialField", "物料档案"),
    EXT_FIELD("extField", "扩展规格属性"),
    FIXED("fixed", "固定值"),
    SPECIFIC("specificField", "特征属性")
    ;

    private String value;

    private String name;

    DetectParamsSourceEnum(String value, String name) {
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
        for (DetectParamsSourceEnum element : DetectParamsSourceEnum.values()) {
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
