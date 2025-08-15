package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用料清单 子项类型[1标准件，2退回件]
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/5/31 13:40
 */
public enum BillSubTypeEnum implements IEnum<Object> {

    STANDARD("1", "标准件"),
    RETURN("2", "退回件"),
    ;

    private final String value;

    @Getter
    private final String name;

    BillSubTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BillSubTypeEnum element : BillSubTypeEnum.values()) {
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
        for (BillSubTypeEnum element : BillSubTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (!StringUtils.isEmpty(name)) {
            for (BillSubTypeEnum element : values()) {
                if (name.equals(element.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> getNames() {
        return Arrays.stream(values()).map(BillSubTypeEnum::getName).collect(Collectors.toList());
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {

        return this.value.equals(value);
    }

}
