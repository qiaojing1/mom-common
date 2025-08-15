package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产-操作状态 枚举
 * @author DING WEI
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum ProduceOperationStatusEnum implements IEnum<Object> {

    NOT_REDUCTION("0", "未还原"),
    REDUCTION_ED("1", "已还原"),
    ;

    private String value;

    private String name;

    ProduceOperationStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProduceOperationStatusEnum element : ProduceOperationStatusEnum.values()) {
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
        for (ProduceOperationStatusEnum element : ProduceOperationStatusEnum.values()) {
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
