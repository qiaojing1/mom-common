package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 供货资料上传状态[0：未上传,1：部分上传,2：已上传]
 * @author DING WEI
 * @date 2025/4/7 11:04
 * @version 1.0
 */
public enum SupplyEnclosureStatusEnum implements IEnum<Object> {

    UN_UPLOAD("0", "未上传"),
    PART_UPLOAD("1", "部分上传"),
    UPLOADED("2", "已上传"),
    ;

    private final String value;

    private final String name;

    SupplyEnclosureStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SupplyEnclosureStatusEnum element : values()) {
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
        for (SupplyEnclosureStatusEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllValues() {
        List<String> values = new ArrayList<>();
        for (SupplyEnclosureStatusEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }
    public static List<String> getAllName() {
        List<String> values = new ArrayList<>();
        for (SupplyEnclosureStatusEnum element : values()) {
            values.add(element.getName());
        }
        return values;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SupplyEnclosureStatusEnum element : SupplyEnclosureStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (SupplyEnclosureStatusEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
