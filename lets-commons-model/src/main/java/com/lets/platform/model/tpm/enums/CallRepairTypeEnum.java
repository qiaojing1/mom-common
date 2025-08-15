package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 报修类型[1:机械故障,2:电气报修,3:其他故障]
 * @author DING WEI
 * @date 2024/11/18 14:35
 * @version 1.0
 */
public enum CallRepairTypeEnum implements IEnum<Object> {

    MECHANICS_FAULT("1","机械故障"),
    ELECTRICAL_FAULT("2","电气报修"),
    OTHER_FAULT("3", "其他故障"),
    ;

    private String value;

    private String name;

    CallRepairTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CallRepairTypeEnum element : CallRepairTypeEnum.values()) {
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
        for (CallRepairTypeEnum element : CallRepairTypeEnum.values()) {
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
