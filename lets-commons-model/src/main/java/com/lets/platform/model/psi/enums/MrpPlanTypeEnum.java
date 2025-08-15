package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 单位转换类型
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/11 9:15
 */
public enum MrpPlanTypeEnum implements IEnum<Integer> {

    PURCHASE(1, "采购计划"),
    PRODUCTION(2, "生产计划"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    MrpPlanTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MrpPlanTypeEnum element : values()) {
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
        for (MrpPlanTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (MrpPlanTypeEnum element : values()) {
            allName.add(element.getName());
        }
        return allName;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }
}