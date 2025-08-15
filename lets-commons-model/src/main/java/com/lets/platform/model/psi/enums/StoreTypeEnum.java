package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 仓库类型 1普通仓库 2寄售仓库 3线边仓库
 * @author DING WEI
 * @date 2023/7/18 13:34
 * @version 1.0
 */
public enum StoreTypeEnum implements IEnum<Object> {

    ORDINARY("1", "普通仓库"),
    CUSTOM("2", "寄售仓库"),
    LINE_EDGE("3", "线边仓库"),
    OUTSOURCING("4", "委外仓库"),
    IN_TRANSIT("5", "在途仓库"),
    TO_BE_INSPECTED("6", "待检仓库"),
    SUPPLIER("7", "供应商仓库"),
    ;

    private String value;

    private String name;

    StoreTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (StoreTypeEnum element : values()) {
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
        for (StoreTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    public static List<String> getAllName() {
        List<String> all = new ArrayList<>();
        for (StoreTypeEnum element : values()) {
            all.add(element.getName());
        }
        return all;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
