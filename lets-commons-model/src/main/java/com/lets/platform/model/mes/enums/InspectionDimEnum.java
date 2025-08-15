package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 制程检验计划巡检纬度[1:时间,2:数量,3:进度]
 */
public enum InspectionDimEnum implements IEnum<Object> {

    TIME(1, "时间"),
    NUMBER(2, "数量"),
    PERCENT(3, "进度"),
    ;

    private Integer value;

    private String name;

    InspectionDimEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InspectionDimEnum element : InspectionDimEnum.values()) {
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
        for (InspectionDimEnum element : InspectionDimEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    @Override
    public Integer getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}
