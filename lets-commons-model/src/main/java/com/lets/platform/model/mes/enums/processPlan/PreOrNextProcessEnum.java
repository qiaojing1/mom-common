package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 上一、当前、下一 工序
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum PreOrNextProcessEnum implements IEnum<Object> {

    PRE("pre", "上一工序"),
    CURRENT("current", "当前工序"),
    NEXT("next", "下一工序"),
    ;

    private String value;

    private String name;

    PreOrNextProcessEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PreOrNextProcessEnum element : PreOrNextProcessEnum.values()) {
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
        for (PreOrNextProcessEnum element : PreOrNextProcessEnum.values()) {
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
