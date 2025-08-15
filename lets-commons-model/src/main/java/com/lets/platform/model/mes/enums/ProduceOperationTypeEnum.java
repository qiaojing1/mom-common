package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产-操作类型 枚举
 * @author Qiao
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum ProduceOperationTypeEnum implements IEnum<Object> {

    RECEIVE("1", "接收"),
    REPORT("2", "报工 "),
    ;

    private String value;

    private String name;

    ProduceOperationTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceOperationTypeEnum element : ProduceOperationTypeEnum.values()) {
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
        for (ProduceOperationTypeEnum element : ProduceOperationTypeEnum.values()) {
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
