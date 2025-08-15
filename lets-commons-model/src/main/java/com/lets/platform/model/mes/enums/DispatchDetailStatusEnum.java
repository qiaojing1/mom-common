package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 创建、计划、计划确认、下达、开工、完工、关闭
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum DispatchDetailStatusEnum implements IEnum<Object> {

    NOT_START(0, "未开工"),
    START(1, "开工"),
    STOP(2, "暂停"),
    COMPLETE(3, "完工"),
    CLOSE(4, "结案"),
    ;

    private Integer value;

    @Getter
    private String name;

    DispatchDetailStatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DispatchDetailStatusEnum element : DispatchDetailStatusEnum.values()) {
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
        for (DispatchDetailStatusEnum element : DispatchDetailStatusEnum.values()) {
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

    public boolean equals(Integer value) {
        return this.value.equals(value);
    }
}
