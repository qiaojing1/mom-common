package com.lets.platform.model.device.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 资产状态 枚举
 * 1使用中、2封存中、3调拨中、4委外中、5场外调拨、6已报废、7已处置
 * @version 1.0
 * @ClassName AssetsStatusEnum
 * @author: DING WEI
 * @create: 2021/05/13 16:09
 **/
@Deprecated
public enum AssetsStatusEnum implements IEnum<Object> {

    USER_ING("1", "使用中"),
    SEAL_UP_ING("2", "封存中"),
    ALLOCATION_ING("3", "调拨中"),
    OUTSOURCING_ING("4", "委外中"),
    OFF_SITE_ALLOCATION_ING("5", "厂外调拨"),
    SCRAP_ED("6", "已报废"),
    HANDLE_ED("7", "已处置"),
    BREAKDOWN("8", "故障"),
    ;

    private String value;
    private String name;

    AssetsStatusEnum(String value, String name) {
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
        for (AssetsStatusEnum element : AssetsStatusEnum.values()) {
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
        for (AssetsStatusEnum element : AssetsStatusEnum.values()) {
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
        for (AssetsStatusEnum element : AssetsStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getAllName() {
        List<String> allName = new ArrayList<>();
        for (AssetsStatusEnum element : AssetsStatusEnum.values()) {
            allName.add(element.getName());
        }
        return allName;
    }

    public static List<String> getNegativeStatus() {
        List<String> negativeStatus = new ArrayList<>();
        negativeStatus.add(SCRAP_ED.getValue());
        negativeStatus.add(OFF_SITE_ALLOCATION_ING.getValue());
        negativeStatus.add(SEAL_UP_ING.getValue());
        negativeStatus.add(ALLOCATION_ING.getValue());
        negativeStatus.add(OUTSOURCING_ING.getValue());
        negativeStatus.add(HANDLE_ED.getValue());
        negativeStatus.add(BREAKDOWN.getValue());
        return negativeStatus;
    }
}
