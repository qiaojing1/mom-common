package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 图表类型 枚举
 *
 * @ClassName RelationTypeEnum
 * @author: QIAO JING
 * @create: 2021/12/07 13:32
 * @Version 1.0
 **/
public enum ChartTypeEnum implements IEnum<Object> {

    PIE_CHART("1", "饼图"),
    BAR_CHART("2", "条形图"),
    STACKING_CHART("3", "堆叠条形图"),
    ;

    private String value;

    private String name;

    ChartTypeEnum(String value, String name) {
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
        for (ChartTypeEnum element : ChartTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
