package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 倒冲领料时机
 * @author DING WEI
 * @date 2024/9/4 15:29
 * @version 1.0
 */
public enum ReversePickingMomentEnum implements IEnum<Object> {

    PRODUCE_REPORT("1", "工单报工"),
    FIRST_PROCESS_RECEIVE("2", "首道工序接收"),
    COMPLETE_STOCK_IN("3", "完工入库"),

    ;

    private final String value;

    @Getter
    private final String name;

    ReversePickingMomentEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReversePickingMomentEnum element : ReversePickingMomentEnum.values()) {
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
        for (ReversePickingMomentEnum element : ReversePickingMomentEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> all = new ArrayList<>();
        for (ReversePickingMomentEnum element : values()) {
            all.add(element.getName());
        }
        return all;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {

        return this.value.equals(value);

    }

}
