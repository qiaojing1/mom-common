package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 物理-虚拟点位 枚举
 *
 * @ClassName PhysicsVirtualEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum PhysicsVirtualEnum implements IEnum<Object> {

    PHYSICS_DATA_ITEM("1", "物理点位"),
    VIRTUAL_DATA_ITEM("2", "虚拟点位"),
    ;

    private String value;

    private String name;

    PhysicsVirtualEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (PhysicsVirtualEnum element : PhysicsVirtualEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (PhysicsVirtualEnum element : PhysicsVirtualEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (PhysicsVirtualEnum element : PhysicsVirtualEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (PhysicsVirtualEnum element : PhysicsVirtualEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
