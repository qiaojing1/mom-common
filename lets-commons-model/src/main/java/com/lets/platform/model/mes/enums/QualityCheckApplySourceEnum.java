package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 质检申请创建来源 枚举
 * @author Qiao
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum QualityCheckApplySourceEnum implements IEnum<Object> {

    NORMAL("1", "正常创建"),
    RECEIVE_JUMP("2", "收货发起跳转"),
    STOCK_OUT_JUMP("3", "出库发起跳转"),
    ;

    private String value;

    private String name;

    QualityCheckApplySourceEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (QualityCheckApplySourceEnum element : QualityCheckApplySourceEnum.values()) {
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
        for (QualityCheckApplySourceEnum element : QualityCheckApplySourceEnum.values()) {
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
