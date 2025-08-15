package com.lets.platform.model.mes.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * BOM类型
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum BomTypeEnum implements IEnum<Object> {

    GROUP(0, "分组"),
    PRODUCE_BOM(1, "制造BOM"),
    ORDER_BOM(2, "订单BOM"),

    ;

    private final Integer value;

    @Getter
    private final String name;

    BomTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BomTypeEnum element : BomTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (BomTypeEnum element : BomTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (BomTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (BomTypeEnum element : values()) {
            names.add(element.getName());
        }
        return names;
    }

    @Override
    public Integer getValue() {
        return value;
    }

}
