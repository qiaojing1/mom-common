package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 创建、计划、计划确认、下达、开工、完工、关闭
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/12/26 15:36
 */
public enum PlanDetailStatusEnum implements IEnum<Object> {

    CREATION(1, "创建"),
    PLAN(2, "计划"),
    CONFIRM(3, "计划确认"),
    RELEASE(4, "下达"),
    START(5, "开工"),
    COMPLETE(6, "完工"),
    CLOSE(7, "关闭"),
    ;

    private Integer value;

    @Getter
    private String name;

    PlanDetailStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PlanDetailStatusEnum element : PlanDetailStatusEnum.values()) {
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
        for (PlanDetailStatusEnum element : PlanDetailStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }

    @Override
    public Integer getValue() {
        return value;
    }

}
