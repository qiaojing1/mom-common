package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备解锁扫码-类型
 * @author DING WEI
 * @date 2024/2/22 17:07
 * @version 1.0
 */
public enum MesUnlockCodeTypeEnum implements IEnum<String> {

    USER("1", "人员账号"),
    PROCESS_MATERIAL("2", "工序物料号"),
    BATCH_NUMBER("3", "产品批号"),
    STORAGE_BIND_DEVICE("4", "存储区绑定设备"),

    ;

    private final String value;

    @Getter
    private final String name;

    MesUnlockCodeTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MesUnlockCodeTypeEnum element : MesUnlockCodeTypeEnum.values()) {
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
        for (MesUnlockCodeTypeEnum element : MesUnlockCodeTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllNames() {
        List<String> names = new ArrayList<>();
        for (MesUnlockCodeTypeEnum element : MesUnlockCodeTypeEnum.values()) {
            names.add(element.name);
        }
        return names;
    }

    @Override
    public String getValue() {
        return value;
    }


    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
