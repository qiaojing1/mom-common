package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 更换原因[1：内修、2：委外、3：无需维修]
 * @author zhangweiyan
 * @date 2024/11/22 14:35
 * @version 1.0
 */
public enum ChangeReasonEnum implements IEnum<Object> {

    DAMAGED("1","损坏"),
    END_OF_LIFESPAN("2","寿命到期"),
    ;

    private String value;

    private String name;

    ChangeReasonEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ChangeReasonEnum element : ChangeReasonEnum.values()) {
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
        for (ChangeReasonEnum element : ChangeReasonEnum.values()) {
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
