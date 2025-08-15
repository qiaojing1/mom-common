package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 单据状态
 */
public enum InventoryOrderStatusEnum implements IEnum<Object> {

    NOT_STARTED(0, "未开始"),
    CHECKING(1, "盘点中"),
    END(2, "结案"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    InventoryOrderStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (InventoryOrderStatusEnum element : values()) {
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
        for (InventoryOrderStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (InventoryOrderStatusEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }


    @Override
    public Integer getValue() {
        return value;
    }

}
