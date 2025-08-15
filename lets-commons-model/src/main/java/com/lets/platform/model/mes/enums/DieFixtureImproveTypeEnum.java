package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 模治具改善类型 枚举
 * @author DING WEI
 * @date 2022/7/20 16:53
 * @version 1.0
 */
public enum DieFixtureImproveTypeEnum implements IEnum<Object> {

    MODEL_IMPROVE("1", "模具改善"),
    DESIGN_CHANGE("2", "设计变更"),
    ;

    private String value;

    private String name;

    DieFixtureImproveTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DieFixtureImproveTypeEnum element : DieFixtureImproveTypeEnum.values()) {
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
        for (DieFixtureImproveTypeEnum element : DieFixtureImproveTypeEnum.values()) {
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
