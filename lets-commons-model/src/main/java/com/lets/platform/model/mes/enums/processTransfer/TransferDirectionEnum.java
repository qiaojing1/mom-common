package com.lets.platform.model.mes.enums.processTransfer;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 工序转移单-转移方向 [1：转入 2：转出]
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum TransferDirectionEnum implements IEnum<Object> {

    TRANSFER_IN(1, "转入"),
    TRANSFER_OUT(2, "转出"),
    ;

    private Integer value;

    private String name;

    TransferDirectionEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TransferDirectionEnum element : TransferDirectionEnum.values()) {
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
        for (TransferDirectionEnum element : TransferDirectionEnum.values()) {
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
