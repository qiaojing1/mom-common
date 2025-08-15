package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 变更原因[1生产计划调整2客户需求变更]
 * @author DING WEI
 * @date 2023/11/7 17:16
 * @version 1.0
 */
public enum ProduceChangeReasonEnum implements IEnum<Object> {

    PLAN_ADJUSTMENT("1", "生产计划调整"),
    DEMAND_CHANGES("2", "客户需求变更"),

    ;

    private String value;

    private String name;

    ProduceChangeReasonEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceChangeReasonEnum element : ProduceChangeReasonEnum.values()) {
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
        for (ProduceChangeReasonEnum element : ProduceChangeReasonEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(PLAN_ADJUSTMENT.getName());
        allName.add(DEMAND_CHANGES.getName());
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
