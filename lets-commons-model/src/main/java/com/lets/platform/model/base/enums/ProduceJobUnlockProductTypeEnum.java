package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备解锁-产品类型[1当日首件2换型第一件3其他]
 * @author DING WEI
 * @date 2024/2/23 16:19
 * @version 1.0
 */
public enum ProduceJobUnlockProductTypeEnum implements IEnum<Object> {

    TODAY_FIRST(1, "当日首件"),
    CHANGE_FIRST(2, "换型第一件"),
    OTHER(3, "其他"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    ProduceJobUnlockProductTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceJobUnlockProductTypeEnum element : values()) {
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
        for (ProduceJobUnlockProductTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (ProduceJobUnlockProductTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }
}
