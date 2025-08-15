package com.lets.platform.model.adapter.enums;

import org.springframework.util.StringUtils;

/**
 * 历史状态数据来源
 * @author DING WEI
 * @date 2023/12/16 9:45
 * @version 1.0
 */
public enum HistoryStatusDataSourceEnum {

    ITEM_COLLECTION("1", "点位采集"),
    OFF_LINE_SYS_INNER("2", "掉线系统内部发送"),
    SYS_COMPENSATE("3", "系统补偿"),
    ;

    private String value;
    private String name;

    HistoryStatusDataSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (HistoryStatusDataSourceEnum element : HistoryStatusDataSourceEnum.values()) {
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
