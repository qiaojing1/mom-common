package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 报修工单状态[1:待确认、2:待响应、3:待处理、4:处理中、5:已委外、6:已暂停、7:待审核、8:已完成、9:已取消]
 * @author DING WEI
 * @date 2024/11/18 15:36
 * @version 1.0
 */
public enum CallRepairOrderStatusEnum implements IEnum<Object> {

    WAIT_CONFIRM(1, "待确认"),
    WAIT_RESPONSE(2, "待响应"),
    WAIT_HANDLE(3, "待处理"),
    HANDLE_ING(4, "处理中"),
    OUTSOURCING_ED(5, "已委外"),
    PAUSED(6, "已暂停"),
    WAIT_EXAMINE(7, "待审核"),
    COMPLETE(8, "已完成"),
    CANCELLED(9, "已取消"),
    ACCEPTANCE_NOT_PASSED(10, "验收不通过"),
    ;

    private Integer value;

    private String name;

    CallRepairOrderStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CallRepairOrderStatusEnum element : CallRepairOrderStatusEnum.values()) {
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
        for (CallRepairOrderStatusEnum element : CallRepairOrderStatusEnum.values()) {
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
