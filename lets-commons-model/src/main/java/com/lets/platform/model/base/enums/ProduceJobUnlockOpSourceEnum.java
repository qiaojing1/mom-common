package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备解锁-操作来源[1web端2扫码]
 * @author DING WEI
 * @date 2024/2/23 16:19
 * @version 1.0
 */
public enum ProduceJobUnlockOpSourceEnum implements IEnum<Object> {

    WEB(1, "web"),
    SCAN_CODE(2, "扫码"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    ProduceJobUnlockOpSourceEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceJobUnlockOpSourceEnum element : values()) {
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
        for (ProduceJobUnlockOpSourceEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (ProduceJobUnlockOpSourceEnum element : values()) {
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
