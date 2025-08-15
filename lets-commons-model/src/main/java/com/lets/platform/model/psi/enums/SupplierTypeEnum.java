package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 容器类型 枚举 @ClassName ResetPeriodEnum
 *
 * @author: QIAO
 * @create: 2021/08/18 08:45 @Version 1.0
 */
public enum SupplierTypeEnum implements IEnum<Object> {

    NORMAL("1", "普通供应商"),
    OUT("2", "委外供应商"),
    SERVER("3", "服务供应商"),
    COMPREHENSIVE("4", "综合供应商"),
    ;

    private String value;

    private String name;

    SupplierTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SupplierTypeEnum element : SupplierTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (SupplierTypeEnum element : SupplierTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SupplierTypeEnum element : SupplierTypeEnum.values()) {
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
