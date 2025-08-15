package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 计划订单-计划状态
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum PlanOrderStatusEnum implements IEnum<Object> {

    NOT_CONFIRM("1", "未确认"),
    YES_CONFIRM("2", "已确认"),
    PART_PUT_IN("3", "部分投放"),
    YES_PUT_IN("4", "已投放"),

    ;

    private String value;

    private String name;

    PlanOrderStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PlanOrderStatusEnum element : PlanOrderStatusEnum.values()) {
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
        for (PlanOrderStatusEnum element : PlanOrderStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(NOT_CONFIRM.getName());
        allName.add(YES_CONFIRM.getName());
        allName.add(PART_PUT_IN.getName());
        allName.add(YES_PUT_IN.getName());
        return allName;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
