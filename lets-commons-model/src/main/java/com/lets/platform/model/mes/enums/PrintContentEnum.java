package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 打印内容
 */
public enum PrintContentEnum implements IEnum<String> {
    ALL("0", "全部"),
    BILL("1", "单据"),
    BILL_FILES("2", "单据附件"),
    ;

    private final String value;

    @Getter
    private final String name;

    PrintContentEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PrintContentEnum element : PrintContentEnum.values()) {
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
        for (PrintContentEnum element : PrintContentEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static PrintContentEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PrintContentEnum element : PrintContentEnum.values()) {
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
