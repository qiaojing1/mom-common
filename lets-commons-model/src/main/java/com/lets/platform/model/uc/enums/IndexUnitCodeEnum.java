package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 首页组件类型
 * @author DING WEI
 * @date 2024/1/12 10:52
 * @version 1.0
 */
public enum IndexUnitCodeEnum implements IEnum<Object> {

    CIRCULAR_DIAGRAM("CircularDiagram", "环形图"),
    CUSTOM_STATUS_CARD("CustomStatusCard", "自定义_状态卡片"),
    APPROVAL_AGENCY("approvalAgency", "自定义_审批代办"),
    COMMON_FUNCTIONS("commonFunctions", "自定义_常用功能"),
    ;

    private String value;

    private String name;

    IndexUnitCodeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (IndexUnitCodeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (IndexUnitCodeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
