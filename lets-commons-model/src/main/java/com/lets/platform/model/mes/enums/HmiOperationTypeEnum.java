package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 生产-操作类型 枚举
 * @author Qiao
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum HmiOperationTypeEnum implements IEnum<Object> {

    CAN_NOT_RECEIVE("0", "接收", "不可接收"),
    RECEIVE("1", "接收", "可接收"),
    REPORT("2", "报工", "可报工"),
    CAN_NOT_REPORT("3", "报工", "不可报工"),
    ;

    private String value;

    private String name;

    @Getter
    private String canName;

    HmiOperationTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    HmiOperationTypeEnum(String value, String name, String canName) {
        this.value = value;
        this.name = name;
        this.canName = canName;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (HmiOperationTypeEnum element : HmiOperationTypeEnum.values()) {
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
        for (HmiOperationTypeEnum element : HmiOperationTypeEnum.values()) {
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
