package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产状态
 * @author Qiao
 * @date 9/17/21 10:52
 * @version 1.0
 */
public enum DistributePlanStatus implements IEnum<Object> {

    DRAFT("0", "草稿"),
    EXAMINE("1", "待审核"),
    EXAMINED("2", "已审核"),
    CANCLE("3", "已取消"),
    SUSPEND("4", "已暂停"),
    FORCE_FINISH("5", "强制完成"),
    FINISH("6", "已完成"),
    ;

    private String value;

    private String name;

    DistributePlanStatus(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DistributePlanStatus element : DistributePlanStatus.values()) {
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
        for (DistributePlanStatus element : DistributePlanStatus.values()) {
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
