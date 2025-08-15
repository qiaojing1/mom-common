package com.lets.platform.model.uc.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 排序字段 枚举
 *
 * @ClassName OrderFieldEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum UcOrderFieldEnum implements IEnum<Object> {

    DEFAULT("default", "m.create_time"),
    DEFAULT1("default", "create_time"),
    ID("id", "m.id"),
    // sys_tenancy 租户表
    SYS_TENANCY_STATUS("status", "m.status"),
    SYS_TENANCY_BEGIN_TIME("beginTime", "m.begin_time"),
    SYS_TENANCY_END_TIME("endTime", "m.end_time"),

    // sys_menu 菜单表
    SYS_MENU_CODE("menuCode", "sm.MENU_CODE"),
    SYS_MENU_CREATE_TIME("createTime", "sm.CREATE_TIME"),

    // sys_org 组织表
    SYS_ORG_DEFAULT("org_default", "m.rank"),

    COMPONENT_ORDER("componentOrder", "m.component_order"),
    ;

    // TODO 其他表字段

    private String value;

    private String field;

    UcOrderFieldEnum(String value, String field) {
        this.value = value;
        this.field = field;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getOrderField(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (UcOrderFieldEnum element : UcOrderFieldEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getField();
            }
        }
        return null;
    }

    public String getField() {
        return field;
    }
}
