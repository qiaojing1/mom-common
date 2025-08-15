package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 是否 枚举
 *
 * @author FZY
 * @version 1.0
 * @date 2022/11/08
 */
public enum SupplierGradeEnum implements IEnum<Object> {
    A("A", "A级"),
    B("B", "B级"),
    C("C", "C级"),
    D("D", "D级");

    private final String value;

    private final String name;

    SupplierGradeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SupplierGradeEnum element : SupplierGradeEnum.values()) {
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
        for (SupplierGradeEnum element : SupplierGradeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SupplierGradeEnum element : SupplierGradeEnum.values()) {
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
        for (SupplierGradeEnum element : values()) {
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
