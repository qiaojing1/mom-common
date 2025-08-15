package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产计划-实现类型 枚举
 * @author DING WEI
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum ReportPickingControlEnum implements IEnum<Object> {

    NOT("0", "不控制"),
    PICKING_MATERIAL("1", "已领料控制"),
    CRUX_PICKING_SET("2", "关键件领用套数控制"),
    ;

    private String value;

    private String name;

    ReportPickingControlEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReportPickingControlEnum element : ReportPickingControlEnum.values()) {
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
        for (ReportPickingControlEnum element : ReportPickingControlEnum.values()) {
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
