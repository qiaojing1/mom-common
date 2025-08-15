package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 计划订单-齐套状态[0:未计算，1:齐套，2:部分齐套，3:不齐套]
 * @author DING WEI
 * @date 2025/3/4 16:51
 * @version 1.0
 */
public enum PlanOrderKittingStatusEnum implements IEnum<Object> {

    NOT_CAL("1", "未计算"),
    KITTING("2", "齐套"),
    PART_KITTING("3", "部分齐套"),
    UN_KITTING("4", "不齐套"),

    ;

    private String value;

    private String name;

    PlanOrderKittingStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PlanOrderKittingStatusEnum element : PlanOrderKittingStatusEnum.values()) {
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
        for (PlanOrderKittingStatusEnum element : PlanOrderKittingStatusEnum.values()) {
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
