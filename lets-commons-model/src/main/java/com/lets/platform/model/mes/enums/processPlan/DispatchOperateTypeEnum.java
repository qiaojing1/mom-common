package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 派工单操作类型
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum DispatchOperateTypeEnum implements IEnum<Object> {

    RECEIVE("1", "接收"),
    REPORT("2", "报工"),
    ;

    private String value;

    private String name;

    DispatchOperateTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DispatchOperateTypeEnum element : DispatchOperateTypeEnum.values()) {
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
        for (DispatchOperateTypeEnum element : DispatchOperateTypeEnum.values()) {
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
