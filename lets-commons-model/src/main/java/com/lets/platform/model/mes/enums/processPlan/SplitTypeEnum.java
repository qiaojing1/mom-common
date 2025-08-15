package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 拆分类型[1首末拆分、2从当前到末道拆分、3单独拆分]
 * @version 1.0
 */
public enum SplitTypeEnum implements IEnum<Object> {

    FIRST("1", "首末拆分"),
    CURR("2", "从当前到末道拆分"),
    SINGLE("3", "单独拆分"),
    ;

    private String value;

    private String name;

    SplitTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SplitTypeEnum element : SplitTypeEnum.values()) {
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
        for (SplitTypeEnum element : SplitTypeEnum.values()) {
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
