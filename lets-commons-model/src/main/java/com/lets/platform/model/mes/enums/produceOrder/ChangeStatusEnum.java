package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 变更状态
 * @author DING WEI
 * @date 2025/2/18 11:02
 * @version 1.0
 */
public enum ChangeStatusEnum implements IEnum<Object> {

    NORMAL("1", "正常"),
    CHANGE_ING("2", "变更中"),
    CHANGED("3", "已变更"),

    ;

    private final String value;

    @Getter
    private final String name;

    ChangeStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ChangeStatusEnum element : ChangeStatusEnum.values()) {
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
        for (ChangeStatusEnum element : ChangeStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(CHANGED.getName());
        allName.add(CHANGE_ING.getName());
        allName.add(NORMAL.getName());
        return allName;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

}
