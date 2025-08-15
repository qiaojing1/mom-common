package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * MRP试算状态
 * @author Qiao
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum OperationStatus implements IEnum<Object> {

    NOT("1", "未试算"),
    ING("2", "试算中"),
    FINISH("3", "试算完成"),
    ;

    private String value;

    private String name;

    OperationStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OperationStatus element : OperationStatus.values()) {
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
        for (OperationStatus element : OperationStatus.values()) {
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
