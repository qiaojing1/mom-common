package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 质检结果 枚举
 * @author Qiao
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum QualityCheckOrderResultEnum implements IEnum<Object> {

    QUALITY("1", "合格"),
    UN_QUALITY("2", "不合格"),
    GIVE_WAY_RECEIVE("3", "让步处理"),
    ;

    private String value;

    private String name;

    QualityCheckOrderResultEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (QualityCheckOrderResultEnum element : QualityCheckOrderResultEnum.values()) {
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
        for (QualityCheckOrderResultEnum element : QualityCheckOrderResultEnum.values()) {
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
