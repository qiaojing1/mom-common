package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 维修工单状态[1：待响应、2：待处理、3：处理中、4：已委外、5：已暂停、6：待审核、7：已完成]
 * @author DING WEI
 * @date 2024/11/18 15:36
 * @version 1.0
 */
public enum RepairOrderStatusEnum implements IEnum<Object> {

    WAIT_RESPONSE(1, "待响应"),
    WAIT_HANDLE(2, "待处理"),
    HANDLE_ING(3, "处理中"),
    OUTSOURCING_ED(4, "已委外"),
    PAUSED(5, "已暂停"),
    WAIT_EXAMINE(6, "待审核"),
    WAIT_ACCEPTANCE(8, "待验收"),
    COMPLETE(7, "已完成"),
    ACCEPTANCE_NOT_PASSED(9, "验收不通过"),
    ;

    private Integer value;

    private String name;

    RepairOrderStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (RepairOrderStatusEnum element : RepairOrderStatusEnum.values()) {
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
        for (RepairOrderStatusEnum element : RepairOrderStatusEnum.values()) {
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
