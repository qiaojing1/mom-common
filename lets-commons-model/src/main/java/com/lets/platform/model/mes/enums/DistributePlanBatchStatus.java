package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产状态
 * @author Qiao
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum DistributePlanBatchStatus implements IEnum<Object> {

    NOT("0", "未发料"),
    FINISH("1", "已发料"),
    ;

    private String value;

    private String name;

    DistributePlanBatchStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DistributePlanBatchStatus element : DistributePlanBatchStatus.values()) {
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
        for (DistributePlanBatchStatus element : DistributePlanBatchStatus.values()) {
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
