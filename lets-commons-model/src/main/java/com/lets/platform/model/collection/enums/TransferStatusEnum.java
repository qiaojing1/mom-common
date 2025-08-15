package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 *
 * @ClassName ItemResultEnum
 * @create: 2022/11/23 13:32
 * @Version 1.0
 **/
public enum TransferStatusEnum implements IEnum<Object> {

    NOT_STARTED("0", "未开始"),
    STARTED("1", "进行中"),
    DONE("2", "已完成"),
    ;

    private String value;

    private String name;

    TransferStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TransferStatusEnum element : TransferStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (TransferStatusEnum element : TransferStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static String getValueByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TransferStatusEnum element : TransferStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
