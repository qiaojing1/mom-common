package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 业务实现类型 枚举
 * @author DING WEI
 * @date 2022/10/26 9:31
 * @version 1.0
 */
public enum BusinessImplTypeEnum implements IEnum<Object> {

    ROUTE("mes_route", "工艺路线"),
    PLAN("mes_plan", "生产计划"),
    ;

    private String value;

    private String name;

    BusinessImplTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BusinessImplTypeEnum element : BusinessImplTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (BusinessImplTypeEnum element : BusinessImplTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
