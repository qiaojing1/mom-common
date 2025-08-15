package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 报修来源[1:点检,2:采集,3:手动,4:巡检,5:预警]
 * @author DING WEI
 * @date 2024/11/18 14:35
 * @version 1.0
 */
public enum CallRepairSourceEnum implements IEnum<Object> {

    SPOT("1","点检"),
    COLLECTION("2","采集"),
    MANUAL("3", "手动"),
    INSPECTION("4", "巡检"),
    EARLY_WARNING("5", "预警"),
    MAINTAIN("6", "保养"),
    ;

    private String value;

    private String name;

    CallRepairSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CallRepairSourceEnum element : CallRepairSourceEnum.values()) {
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
        for (CallRepairSourceEnum element : CallRepairSourceEnum.values()) {
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
