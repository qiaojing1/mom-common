package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 故障维修时长统计方式选项[repairWaitDuration:维修等待时长,responseDuration:响应时长,repairDuration:维修时长,pauseDuration:暂停时长]
 * @author DING WEI
 * @date 2024/12/9 14:23
 * @version 1.0
 */
public enum FaultReDuSubChooseEnum implements IEnum<Object> {

    REPAIR_WAIT_DURATION("repairWaitDuration","维修等待时长"),
    RESPONSE_DURATION("responseDuration","响应时长"),
    REPAIR_DURATION("repairDuration", "维修时长"),
    PAUSE_DURATION("pauseDuration", "暂停时长"),
    RECEPTION_DURATION("receptionDuration", "接单时长"),
    ;

    private String value;

    private String name;

    FaultReDuSubChooseEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (FaultReDuSubChooseEnum element : FaultReDuSubChooseEnum.values()) {
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
        for (FaultReDuSubChooseEnum element : FaultReDuSubChooseEnum.values()) {
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
