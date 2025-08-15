package com.lets.platform.model.mes.enums.processTransfer;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 业务状态[1:正常转移、2:回冲]
 * @author DING WEI
 * @date 2024/4/28 14:47
 * @version 1.0
 */
public enum ProcessOutsourcingBusinessStatusEnum implements IEnum<Object> {

    NORMAL_TRANSFER(1, "正常转移"),
    RECOIL(2, "回冲"),
    ;

    private Integer value;

    private String name;

    ProcessOutsourcingBusinessStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProcessOutsourcingBusinessStatusEnum element : ProcessOutsourcingBusinessStatusEnum.values()) {
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
        for (ProcessOutsourcingBusinessStatusEnum element : ProcessOutsourcingBusinessStatusEnum.values()) {
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
