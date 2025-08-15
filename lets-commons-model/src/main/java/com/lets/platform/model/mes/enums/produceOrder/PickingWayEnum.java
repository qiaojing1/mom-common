package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 领料方式
 * @author DING WEI
 * @date 2024/9/2 11:53
 * @version 1.0
 */
public enum PickingWayEnum implements IEnum<Object> {

    NORMAL("1", "正常领料"),
    DIRECTLY_REVERSE("2", "直接倒冲领料"),
    NOT("3", "不领料"),
    ALLOCATION_REVERSE("4", "调拨倒冲领料"),
    OUTSOURCING_ALLOCATION_REVERSE("5", "委外工序调拨倒冲领料"),
    ;

    private final String value;

    @Getter
    private final String name;

    PickingWayEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PickingWayEnum element : PickingWayEnum.values()) {
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
        for (PickingWayEnum element : PickingWayEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> all = new ArrayList<>();
        for (PickingWayEnum element : values()) {
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
