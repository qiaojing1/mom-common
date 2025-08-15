package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 阈值检测方式[1:标准值、2：区间值]
 * @author DING WEI
 * @date 2025/4/8 15:26
 * @version 1.0
 */
public enum ThresholdDetectionMethodEnum implements IEnum<Object> {

    STANDARD("1", "标准值"),
    RANGE("2", "区间值"),
    ;

    private String value;

    private String name;

    ThresholdDetectionMethodEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ThresholdDetectionMethodEnum element : ThresholdDetectionMethodEnum.values()) {
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
        for (ThresholdDetectionMethodEnum element : ThresholdDetectionMethodEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
