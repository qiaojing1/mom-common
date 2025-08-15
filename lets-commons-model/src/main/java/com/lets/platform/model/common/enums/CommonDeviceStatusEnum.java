package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 设备运行状态四大类
 */
public enum CommonDeviceStatusEnum implements IEnum<Object> {
    RUNNING("running", "运行"),
    FREE("free", "空闲"),
    FAULT("fault", "故障"),
    HALT("halt", "停机"),
    ;

    private String value;

    private String name;

    CommonDeviceStatusEnum(String value, String name) {
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
        for (CommonDeviceStatusEnum element : CommonDeviceStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CommonDeviceStatusEnum element : CommonDeviceStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
