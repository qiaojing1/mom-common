package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 物料属性
 */
public enum MaterialTypeEnum implements IEnum<Object> {

    PURCHASED_PART("1", "采购件", "CGJ"),
    SELF_MADE_PARTS("2", "自制件", "ZZJ"),
    OUTSOURCED_PARTS("3", "委外件", "WWJ"),
    COST_PARTS("4", "费用件", "FYJ"),
    VIRTUAL_PARTS("5", "虚拟件", "XNJ"),
    SERVICE_PARTS("6", "服务件", "FWJ"),
    ASSET_PARTS("7", "资产件", "ZCJ"),
    CUSTOMER_SUPPLIED_PARTS("8", "客供件", "KGJ"),
    ;

    private final String value;
    // 名称首字母缩写
    @Getter
    private final String abbr;
    @Getter
    private final String name;

    MaterialTypeEnum(String value, String name, String abbr) {
        this.value = value;
        this.name = name;
        this.abbr = abbr;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialTypeEnum element : values()) {
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
        for (MaterialTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getAbbr(String value) {
        if (StringUtils.isEmpty(value)) {
            return GlobalConstant.EMPTY_STR;
        }
        for (MaterialTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getAbbr();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> codes = new ArrayList<>();
        for (MaterialTypeEnum element : values()) {
            codes.add(element.getValue());
        }
        return codes;
    }

    public static MaterialTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MaterialTypeEnum element : values()) {
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
