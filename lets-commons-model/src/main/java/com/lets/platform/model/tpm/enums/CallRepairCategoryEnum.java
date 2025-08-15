package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 报修类别[1:设备报修,2:零星报修]
 * @author DING WEI
 * @date 2024/11/18 14:35
 * @version 1.0
 */
public enum CallRepairCategoryEnum implements IEnum<Object> {

    DEVICE_REPORT("1","设备报修"),
    OTHER_REPORT("2","零星报修"),

    ;

    private String value;

    private String name;

    CallRepairCategoryEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CallRepairCategoryEnum element : CallRepairCategoryEnum.values()) {
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
        for (CallRepairCategoryEnum element : CallRepairCategoryEnum.values()) {
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
