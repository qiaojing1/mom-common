package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 需求类型
 * @author Qiao
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum DemandTypeEnum implements IEnum<Object> {

    PRODUCE("1", "生产需求"),
    PURCHASE("2", "采购需求"),
    OUTSOURCING("3", "委外需求"),
    ;

    private String value;

    private String name;

    DemandTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DemandTypeEnum element : DemandTypeEnum.values()) {
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
        for (DemandTypeEnum element : DemandTypeEnum.values()) {
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
