package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * PQC 不合格品处理结果 枚举
 */
public enum PqcHandleResultEnum implements IEnum<String> {

    SCRAP("1", "报废"),
    DEFECT("2", "不良"),
    REPAIR("4", "返修"),
    ;

    private final String value;

    @Getter
    private final String name;

    PqcHandleResultEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PqcHandleResultEnum element : PqcHandleResultEnum.values()) {
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
        for (PqcHandleResultEnum element : PqcHandleResultEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

    @Override
    public String getValue() {
        return value;
    }

}
