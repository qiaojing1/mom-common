package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 委外维修工单状态[1:待接收、2:已接收、3:待审核、4:已完成]
 * @author DING WEI
 * @date 2024/12/4 10:58
 * @version 1.0
 */
public enum OutsourcingOrderStatusEnum implements IEnum<Object> {

    WAIT_RECEIVE(1, "待接收"),
    RECEIVED(2, "已接收"),
    WAIT_EXAMINE(3, "待审核"),
    COMPLETE(4, "已完成"),
    ;

    private Integer value;

    private String name;

    OutsourcingOrderStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (OutsourcingOrderStatusEnum element : OutsourcingOrderStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (OutsourcingOrderStatusEnum element : OutsourcingOrderStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
