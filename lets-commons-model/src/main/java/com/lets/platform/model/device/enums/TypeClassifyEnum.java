package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 设备类型 枚举
 *
 * @version 1.0
 * @ClassName AssetsStatusEnum
 * @author: DING WEI
 * @create: 2021/05/13 16:09
 **/
public enum TypeClassifyEnum implements IEnum<Object> {

    POWER("1", "电表"),
    GAS("2", "天然气表"),
    WATER("3", "水表"),
    COMPRESS_GAS("4", "压缩空气表"),
    COMPRESSOR("5", "空压机"),
    LIGHTING("6", "照明设备"),
    OTHER("7", "其他设备"),
    PRODUCTION("8", "生产设备"),
    INSPECT("9", "检验设备"),
    DETECT("10", "试压设备"),
    AUTO_PRODUCTION_LINE("11", "自动产线"),
    METER("12", "计量仪器"),
    ;

    private String value;
    private String name;

    TypeClassifyEnum(String value, String name) {
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
        for (TypeClassifyEnum element : TypeClassifyEnum.values()) {
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
        for (TypeClassifyEnum element : TypeClassifyEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (TypeClassifyEnum element : TypeClassifyEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (TypeClassifyEnum element : TypeClassifyEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }


    public static List<String> getAllName4Device() {
        List<String> allName = new ArrayList<>();
        for (TypeClassifyEnum element : TypeClassifyEnum.values()) {
            if (element.equals(TypeClassifyEnum.OTHER)
                    || element.equals(TypeClassifyEnum.PRODUCTION)
                    || element.equals(TypeClassifyEnum.INSPECT)
                    || element.equals(TypeClassifyEnum.DETECT)
                    || element.equals(TypeClassifyEnum.AUTO_PRODUCTION_LINE)) {
                allName.add(element.getName());
            }
        }
        return allName;
    }


    public static TypeClassifyEnum getObject(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (TypeClassifyEnum element : TypeClassifyEnum.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

}
