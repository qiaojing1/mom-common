package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 采集告警消息类别 枚举
 *
 * @ClassName WarnPushTypeEnum
 * @author: DING WEI
 * @create: 2022/04/14 13:32
 * @Version 1.0
 **/
public enum WarnPushTypeEnum implements IEnum<Object> {

    WARN("1", "告警"),
    EARLY_WARNING("2", "预警"),
    ERROR_OFFLINE("3", "异常掉线"),
    ;

    private String value;

    private String name;

    WarnPushTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WarnPushTypeEnum element : WarnPushTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
