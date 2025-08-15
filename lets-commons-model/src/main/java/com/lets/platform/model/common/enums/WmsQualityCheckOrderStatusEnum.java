package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * WMS质检工单状态 枚举
 *
 * @ClassName WmsQualityCheckOrderStatusEnum
 * @author: DING WEI
 * @create: 2022/06/25 08:45
 * @Version 1.0
 **/
public enum WmsQualityCheckOrderStatusEnum implements IEnum<Object> {

    WAIT_HANDLE("0", "待处理"),
    HANDLED("1", "已处理"),
    PART_HANDLED("2", "部分处理"),
    ;

    private String value;

    private String name;

    WmsQualityCheckOrderStatusEnum(String value, String name) {
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
        for (WmsQualityCheckOrderStatusEnum element : WmsQualityCheckOrderStatusEnum.values()) {
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
        for (WmsQualityCheckOrderStatusEnum element : WmsQualityCheckOrderStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
