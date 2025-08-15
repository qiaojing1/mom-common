package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 集群部署消息类型 枚举
 *
 * @ClassName Common4ClusterTypeEnum
 * @author: DING WEI
 * @create: 2021/08/18 08:45
 * @Version 1.0
 **/
public enum MeterTypeEnum implements IEnum<Object> {

    SENSOR("1", "传感器"),
    ICON("2", "图标仪"),
    PRESSURE("3", "压力表"),
    TEMPERATURE("4", "测温仪"),
    ;

    private String value;

    private String name;

    MeterTypeEnum(String value, String source) {
        this.value = value;
        this.name = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static Boolean isContainsName(String name){
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (MeterTypeEnum element : MeterTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MeterTypeEnum element : MeterTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (MeterTypeEnum element : MeterTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
