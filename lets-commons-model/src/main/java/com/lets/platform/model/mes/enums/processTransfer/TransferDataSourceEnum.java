package com.lets.platform.model.mes.enums.processTransfer;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 工序转移单-数据来源[0：MES]
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum TransferDataSourceEnum implements IEnum<Object> {

    MES("1", "MES"),
    ;

    private String value;

    private String name;

    TransferDataSourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (TransferDataSourceEnum element : TransferDataSourceEnum.values()) {
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
        for (TransferDataSourceEnum element : TransferDataSourceEnum.values()) {
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
