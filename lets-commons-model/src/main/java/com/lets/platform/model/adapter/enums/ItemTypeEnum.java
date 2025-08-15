package com.lets.platform.model.adapter.enums;

import org.springframework.util.StringUtils;

/**
 * 点位类型 枚举
 *
 * @ClassName RelationTypeEnum
 * @author: DING WEI
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum ItemTypeEnum {

    COMMON("0", "Common", "普通"),
    ALARM_ITEM("1", "AlarmItem", "报警项"),
    ALARM_LIST("2", "AlarmList", "报警列表"),
    DEVICE_STATUS("3", "DeviceStatus", "设备状态"),
    DATA_RECEIVER("4", "DataReceiver", "接收器"),
    ;

    private String value;
    private String name;
    private String desc;

    ItemTypeEnum(String value, String name, String desc) {
        this.value = value;
        this.name = name;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (ItemTypeEnum element : ItemTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
