package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售应收单立账方式
 */
public enum SaleEstablishAccWayEnum implements IEnum<Object> {

    Estimated("1", "暂估应收"),
    Business("2", "业务应收"),
    Finance("3", "财务应收"),
    ;

    private final String value;

    private final String name;

    SaleEstablishAccWayEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SaleEstablishAccWayEnum element : values()) {
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
        for (SaleEstablishAccWayEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllValues() {
        List<String> values = new ArrayList<>();
        for (SaleEstablishAccWayEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }
    public static List<String> getAllName() {
        List<String> values = new ArrayList<>();
        for (SaleEstablishAccWayEnum element : values()) {
            values.add(element.getName());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SaleEstablishAccWayEnum element : SaleEstablishAccWayEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (SaleEstablishAccWayEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
