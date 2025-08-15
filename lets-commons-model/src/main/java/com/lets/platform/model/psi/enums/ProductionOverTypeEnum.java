package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 超发控制方式[1允许超发、2禁止超发、3按最小发料批量超发]
 * @author DING WEI
 * @date 2024/3/25 17:16
 * @version 1.0
 */
public enum ProductionOverTypeEnum implements IEnum<Object> {

    ALLOW(1, "允许超发"),
    PROHIBIT(2, "禁止超发"),
    MIN(3, "按最小发料批量超发"),
    ;

    private Integer value;
    @Getter
    private String name;

    ProductionOverTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProductionOverTypeEnum element : values()) {
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
        for (ProductionOverTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> codes = new ArrayList<>();
        for (ProductionOverTypeEnum element : values()) {
            codes.add(element.getValue());
        }
        return codes;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (ProductionOverTypeEnum element : values()) {
            names.add(element.getName());
        }
        return names;
    }

    public static ProductionOverTypeEnum getEnum(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ProductionOverTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
