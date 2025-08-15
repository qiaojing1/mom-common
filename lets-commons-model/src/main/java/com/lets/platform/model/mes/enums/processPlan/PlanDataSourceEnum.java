package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 数据来源[0：工单下发、1：页面新增]
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum PlanDataSourceEnum implements IEnum<Object> {

    PRODUCE_ISSUE("0", "工单下发"),
    WEB_ADD("1", "页面新增"),
    ;

    private String value;

    private String name;

    PlanDataSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PlanDataSourceEnum element : PlanDataSourceEnum.values()) {
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
        for (PlanDataSourceEnum element : PlanDataSourceEnum.values()) {
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
