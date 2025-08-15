package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 检验类型
 */
public enum MaterialInspectTypeEnum implements IEnum<String> {
    INCOMING_INSPECTION("1", "进料检验"),
    FINAL_INSPECTION("4", "完工检验"),
    ;

    private final String value;

    @Getter
    private final String name;

    MaterialInspectTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialInspectTypeEnum element : MaterialInspectTypeEnum.values()) {
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
        for (MaterialInspectTypeEnum element : MaterialInspectTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            MaterialInspectTypeEnum[] var = values();
            for (MaterialInspectTypeEnum element : var) {
                if (name.equals(element.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
