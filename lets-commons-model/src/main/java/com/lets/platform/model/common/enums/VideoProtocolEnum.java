package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 业务实现类型 枚举
 * @author DING WEI
 * @date 2022/10/26 9:31
 * @version 1.0
 */
public enum VideoProtocolEnum implements IEnum<Object> {

    HIK("1", "海康威视"),
    ;

    private String value;

    private String name;

    VideoProtocolEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (VideoProtocolEnum element : VideoProtocolEnum.values()) {
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
        for (VideoProtocolEnum element : VideoProtocolEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (VideoProtocolEnum element : values()) {
            allName.add(element.getName());
        }
        return allName;
    }
}
