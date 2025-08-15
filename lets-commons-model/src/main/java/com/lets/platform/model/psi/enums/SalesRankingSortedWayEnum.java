package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName SalesRankingSortedWayEnum
 * @Description 销售排名分组方式
 * @Date 2024/1/5 10:11
 **/
public enum SalesRankingSortedWayEnum implements IEnum<Object> {
    MATERIAL("1", "物料"),
    SALE_ORG("2", "销售部门"),
    SALE_GROUP("3", "销售分组"),
    SALE_USER("4", "销售员"),
    ORDER_CUSTOMER("5", "订货客户"),
    ;
    private final String value;

    private final String name;

    SalesRankingSortedWayEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SalesRankingSortedWayEnum element : values()) {
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
        for (SalesRankingSortedWayEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllValues() {
        List<String> values = new ArrayList<>();
        for (SalesRankingSortedWayEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static SalesRankingSortedWayEnum getEnum(String value) {
        for (SalesRankingSortedWayEnum element : values()) {
            if (element.value.equals(value)) {
                return element;
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> values = new ArrayList<>();
        for (SalesRankingSortedWayEnum element : values()) {
            values.add(element.getName());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SalesRankingSortedWayEnum element : SalesRankingSortedWayEnum.values()) {
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
        for (SalesRankingSortedWayEnum element : values()) {
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
