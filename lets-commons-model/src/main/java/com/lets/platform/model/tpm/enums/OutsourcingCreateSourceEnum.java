package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 委外维修创建来源[1:维修派发，2:维修处理]
 * @author DING WEI
 * @date 2024/12/4 10:58
 * @version 1.0
 */
public enum OutsourcingCreateSourceEnum implements IEnum<Object> {

    REPAIR_DISPATCH(1, "维修派发"),
    REPAIR_HANDLER(2, "维修处理"),
    ;

    private Integer value;

    private String name;

    OutsourcingCreateSourceEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OutsourcingCreateSourceEnum element : OutsourcingCreateSourceEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (OutsourcingCreateSourceEnum element : OutsourcingCreateSourceEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
