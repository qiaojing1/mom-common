package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 工单报工单-数据来源
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/7 17:16
 */
public enum ReportOrderSourceTypeEnum implements IEnum<Object> {

    MOM("1", "MOM"),
    INTELLIGENCE_WORKSHOP("2", "智能车间"),

    ;

    private final String value;

    @Getter
    private final String name;

    ReportOrderSourceTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReportOrderSourceTypeEnum element : ReportOrderSourceTypeEnum.values()) {
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
        for (ReportOrderSourceTypeEnum element : ReportOrderSourceTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (ReportOrderSourceTypeEnum element : ReportOrderSourceTypeEnum.values()) {
            names.add(element.name);
        }
        return names;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
