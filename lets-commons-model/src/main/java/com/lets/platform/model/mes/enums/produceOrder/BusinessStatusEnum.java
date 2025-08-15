package com.lets.platform.model.mes.enums.produceOrder;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务状态
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/7 17:16
 */
public enum BusinessStatusEnum implements IEnum<Object> {

    CLOSED("0", "已关闭"),
    PAUSED("1", "暂停中"),
    NORMAL("2", "正常"),

    ;

    private final String value;

    @Getter
    private final String name;

    BusinessStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (BusinessStatusEnum element : BusinessStatusEnum.values()) {
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
        for (BusinessStatusEnum element : BusinessStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        allName.add(CLOSED.getName());
        allName.add(PAUSED.getName());
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
