package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.apache.commons.lang3.StringUtils;

/**
 * 派工批次 质检结果
 * @author DING WEI
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum CheckStatus4DispatchType implements IEnum<Object> {

    NOT_NEED("0", "无需质检"),
    NO_RESULT_YET("1", "暂无结果"),
    PASS("2", "质检通过"),
    NOT_PASS("3", "质检不通过"),
    ;

    private String value;

    private String name;

    CheckStatus4DispatchType(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CheckStatus4DispatchType element : CheckStatus4DispatchType.values()) {
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
        for (CheckStatus4DispatchType element : CheckStatus4DispatchType.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static Boolean canReport(String status) {
        if (StringUtils.isBlank(status)) {
            return Boolean.TRUE;
        } else {
            return NOT_NEED.getValue().equals(status) || PASS.getValue().equals(status);
        }
    }

    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

}
