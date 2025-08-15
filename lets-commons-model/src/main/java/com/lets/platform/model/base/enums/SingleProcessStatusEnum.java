package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 单件工序任务清单-状态
 * @author DING WEI
 * @date 2024/2/21 14:03
 * @version 1.0
 */
public enum SingleProcessStatusEnum implements IEnum<Object> {

    NOT_STARTED(0, "未开工"),
    STARTING(1, "生产中"),
    FINISH(2, "完工"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    SingleProcessStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SingleProcessStatusEnum element : values()) {
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
        for (SingleProcessStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (SingleProcessStatusEnum element : values()) {
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
