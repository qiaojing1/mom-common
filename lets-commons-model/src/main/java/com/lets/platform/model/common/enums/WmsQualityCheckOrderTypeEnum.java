package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * WMS质检工单类型 枚举
 *
 * @ClassName WmsQualityCheckOrderTypeEnum
 * @author: DING WEI
 * @create: 2022/06/25 08:45
 * @Version 1.0
 **/
public enum WmsQualityCheckOrderTypeEnum implements IEnum<Object> {

    STORE_CHECK("1", "库存检验"),
    ;

    private String value;

    private String name;

    WmsQualityCheckOrderTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (WmsQualityCheckOrderTypeEnum element : WmsQualityCheckOrderTypeEnum.values()) {
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
        for (WmsQualityCheckOrderTypeEnum element : WmsQualityCheckOrderTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
