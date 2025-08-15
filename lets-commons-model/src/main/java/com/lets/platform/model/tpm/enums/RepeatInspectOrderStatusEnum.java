package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 复检工单状态[1:待处理、2:处理中、3:待审核、4:已完成]
 * @author DING WEI
 * @date 2024/11/18 15:36
 * @version 1.0
 */
public enum RepeatInspectOrderStatusEnum implements IEnum<Object> {

    WAIT_RESPONSE(1, "待响应"),
    HANDLE_ING(2, "复检中"),
    WAIT_EXAMINE(3, "待审核"),
    COMPLETE(4, "已完成"),
    WAIT_DISTRIBUTE(5, "待下发"),
    ;

    private Integer value;

    private String name;

    RepeatInspectOrderStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RepeatInspectOrderStatusEnum element : RepeatInspectOrderStatusEnum.values()) {
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
        for (RepeatInspectOrderStatusEnum element : RepeatInspectOrderStatusEnum.values()) {
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
