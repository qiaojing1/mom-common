package com.lets.platform.model.base.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产作业单状态
 * @author DING WEI
 * @date 2024/2/21 14:03
 * @version 1.0
 */
public enum ProduceJobStatusEnum implements IEnum<Object> {

    NOT_STARTED(0, "未开工"),
    STARTING(1, "进行中"),
    SUSPEND(2, "暂停"),
    FORCE_FINISH(3, "强制完成"),
    FINISHED(4, "完成"),
    ;

    private final Integer value;

    @Getter
    private final String name;

    ProduceJobStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceJobStatusEnum element : values()) {
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
        for (ProduceJobStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (ProduceJobStatusEnum element : values()) {
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
