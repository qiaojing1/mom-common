/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 创建、计划、计划确认、下达、开工、完工、关闭
 * @version 1.0
 */
public enum OrderDispatchStatusEnum implements IEnum<Object> {

    NOT_START(0, "未派工"),
    START(1, "已派工"),
    ;

    private Integer value;

    @Getter
    private String name;

    OrderDispatchStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OrderDispatchStatusEnum element : OrderDispatchStatusEnum.values()) {
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
        for (OrderDispatchStatusEnum element : OrderDispatchStatusEnum.values()) {
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

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }
}
