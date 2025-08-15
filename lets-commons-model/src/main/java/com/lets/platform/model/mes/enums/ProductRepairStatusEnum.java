package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 产品维修状态 [1:待派工、2:已派工、3:已完成]
 * @author DING WEI
 * @date 2025/6/4 14:25
 * @version 1.0
 */
public enum ProductRepairStatusEnum implements IEnum<Object> {

    WAIT_DISPATCH(1, "待派工"),
    DISPATCH(2, "已派工"),
    FINISH(3, "已完成"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    ProductRepairStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProductRepairStatusEnum element : ProductRepairStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static Integer getIntegerValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ProductRepairStatusEnum element : ProductRepairStatusEnum.values()) {
            if (Integer.valueOf(value).equals(element.getValue())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ProductRepairStatusEnum element : ProductRepairStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (ProductRepairStatusEnum element : ProductRepairStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }

    public boolean equals(String value) {
        return this.value.toString().equals(value);
    }

}
