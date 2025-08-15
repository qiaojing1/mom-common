package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 公式类型 枚举
 *
 * @ClassName FormulaTypeEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum FormulaTypeEnum implements IEnum<Object> {

    EXAMPLE_FORMULA("0", "案例公式"),
    TEMPLATE_FORMULA("1", "模板公式"),
    INSTANCE_FORMULA("2", "实例公式"),
    ;

    private String value;

    private String name;

    FormulaTypeEnum(String value, String name) {
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
        for (FormulaTypeEnum element : FormulaTypeEnum.values()) {
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
