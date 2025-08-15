package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 类型[1:部门,2:员工,3:产品]
 */
public enum SaleTargetDetailTypeEnum implements IEnum<Object> {

    DEPT(1, "部门"),
    USER(2, "员工"),
    PRODUCT(3, "产品"),
    ;

    private Integer value;

    @Getter
    private String name;

    SaleTargetDetailTypeEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SaleTargetDetailTypeEnum element : values()) {
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
        for (SaleTargetDetailTypeEnum element : values()) {
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

}
