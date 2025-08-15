package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * CAD解析A3字段 字段类型[1:主物料,2:子项物料]
 * @author DING WEI
 * @date 2025/4/7 15:30
 * @version 1.0
 */
public enum CadA3FieldTypeEnum implements IEnum<Object> {

    MAIN("1", "主物料"),
    SUB("2", "子项物料"),
    ;

    private final String value;

    @Getter
    private final String name;

    CadA3FieldTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CadA3FieldTypeEnum element : CadA3FieldTypeEnum.values()) {
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
        for (CadA3FieldTypeEnum element : CadA3FieldTypeEnum.values()) {
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

}
