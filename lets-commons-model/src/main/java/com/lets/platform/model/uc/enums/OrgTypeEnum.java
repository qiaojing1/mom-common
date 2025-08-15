package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 部门类型
 *
 * @author FZY
 * @version 1.0
 * @date 2023/6/9 17:55
 **/
public enum OrgTypeEnum implements IEnum<Object> {

    MANAGEMENT("1", "管理部门"),
    PRODUCTION("2", "生产部门"),
    SALES("3", "销售部门"),
    MAINTENANCE("4", "维保部门"),
    STORAGE("5", "仓储部门"),
    DIE_FIXTURE("6", "模治具管理部门"),
    PRESSURE_TEST("7", "试压部门"),
    WELDING("8", "焊接部门"),
    PROCUREMENT("9", "采购部门"),
    ADMINISTRATIVE("10", "行政部门"),
    INSPECTION("11", "检验部门"),
    QUALITY("20", "质量部门"),
    DEALER("21", "经销商");

    private final String value;
    @Getter
    private final String name;

    OrgTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (OrgTypeEnum element : OrgTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OrgTypeEnum element : OrgTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getNames() {
        String names[] = new String[OrgTypeEnum.values().length];
        for (int i = 0; i < OrgTypeEnum.values().length; i++) {
            names[i] = OrgTypeEnum.values()[i].getName();
        }
        return String.join(",", names);
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
