package com.lets.platform.model.mes.enums.processTransfer;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 工序转移单-源单类型[1：工序计划单]
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum TransferSourceOrderTypeEnum implements IEnum<Object> {

    PROCESS_PLAN("1", "工序计划单"),
    PROCESS_OUTSOURCING_IN("2", "工序委外发出单"),
    ;

    private String value;

    private String name;

    TransferSourceOrderTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TransferSourceOrderTypeEnum element : TransferSourceOrderTypeEnum.values()) {
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
        for (TransferSourceOrderTypeEnum element : TransferSourceOrderTypeEnum.values()) {
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
