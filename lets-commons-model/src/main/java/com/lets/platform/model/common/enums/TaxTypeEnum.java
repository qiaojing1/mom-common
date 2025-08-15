package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * TaxTypeEnum
 * @author DING WEI
 * @date 2023/4/26 11:38
 * @version 1.0
 */
public enum TaxTypeEnum implements IEnum<Object> {

    PROPORTION("1","比例（%）", "ratio"),
    UNIT("2","单位税额", "number"),
    OUTPUT_TAX("3", "销项税", "number"),
    INPUT_TAX("4", "进项税", "number"),
    ;

    private final String value;

    @Getter
    private final String name;

    @Getter
    private final String type;

    TaxTypeEnum(String value, String name, String type) {
        this.value = value;
        this.name = name;
        this.type = type;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TaxTypeEnum element : TaxTypeEnum.values()) {
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
        for (TaxTypeEnum element : TaxTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getType(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TaxTypeEnum element : TaxTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getType();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (TaxTypeEnum element : values()) {
            allName.add(element.getName());
        }
        return allName;
    }

    @Override
    public String getValue() {
        return value;
    }

}
