package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 设备负荷定义方式[1:按排班时间,2:按状态时长,3:按固定时间]
 * @author DING WEI
 * @date 2024/12/9 14:23
 * @version 1.0
 */
public enum DeviceLoadDefinitionEnum implements IEnum<Object> {

    SCHEDULING("1","按排班时间"),
    STATUS_DURATION("2","按状态时长"),
    FIX_DURATION("3", "按固定时间"),
    ;

    private String value;

    private String name;

    DeviceLoadDefinitionEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DeviceLoadDefinitionEnum element : DeviceLoadDefinitionEnum.values()) {
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
        for (DeviceLoadDefinitionEnum element : DeviceLoadDefinitionEnum.values()) {
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

}
