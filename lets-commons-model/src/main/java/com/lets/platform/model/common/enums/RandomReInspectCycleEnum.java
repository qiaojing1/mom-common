package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 随机复检周期
 * @author DING WEI
 * @date 2024/12/24 16:08
 * @version 1.0
 */
public enum RandomReInspectCycleEnum implements IEnum<Object> {

    WEEK("1", "周", "10 0 0 ? * 2", 1),
    MONTH("2", "月", "10 0 0 1 * ?", 4),
    YEAR("3", "年", "10 0 0 1 1 ?", 52),
    ;

    private String value;

    private String name;

    private String cron;
    // 随机倍数
    @Getter
    private Integer randomMultiple;

    RandomReInspectCycleEnum(String value, String name, String cron) {
        this.value = value;
        this.name = name;
        this.cron = cron;
    }

    RandomReInspectCycleEnum(String value, String name, String cron, Integer randomMultiple) {
        this.value = value;
        this.name = name;
        this.cron = cron;
        this.randomMultiple = randomMultiple;
    }

    public static RandomReInspectCycleEnum getEnumByValue(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (RandomReInspectCycleEnum element : RandomReInspectCycleEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RandomReInspectCycleEnum element : RandomReInspectCycleEnum.values()) {
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
        for (RandomReInspectCycleEnum element : RandomReInspectCycleEnum.values()) {
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

    public String getCron() {
        return cron;
    }
}
