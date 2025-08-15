package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 资产类型
 */
public enum MaterialAssetTypeEnum implements IEnum<Object> {

    MACHINE("1", "机器设备"),
    INSTRUMENT("2", "仪器"),
    CONTAINER("3", "容器"),
    TRANSPORTATION_TOOLS("4", "运输工具"),
    FIXED_ASSET("5", "固定资产"),
    ;

    private final String value;
    @Getter
    private final String name;

    MaterialAssetTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialAssetTypeEnum element : values()) {
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
        for (MaterialAssetTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> codes = new ArrayList<>();
        for (MaterialAssetTypeEnum element : values()) {
            codes.add(element.getValue());
        }
        return codes;
    }

    public static MaterialAssetTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MaterialAssetTypeEnum element : values()) {
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
