package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 法定节假日 枚举
 *
 * @ClassName LegalHolidayEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum LegalHolidayEnum implements IEnum<Object> {

    NEW_YEAR_DAY("1", "元旦"),
    SPRING_FESTIVAL("2", "春节"),
    TOMB_SWEEPING_DAY("3", "清明节"),
    MAY_DAY("4", "劳动节"),
    DRAGON_BOAT_FESTIVAL("5", "端午节"),
    MID_AUTUMN_FESTIVAL("6", "中秋节"),
    NATIONAL_HOLIDAY("7", "国庆节"),;

    private String value;

    private String describe;

    LegalHolidayEnum(String value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getTenancyTypeName(String value) {
        if (StringUtils.isEmpty(value)) {
            return value;
        }
        for (LegalHolidayEnum element : LegalHolidayEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getDescribe();
            }
        }
        return null;
    }

    public static String getValueByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return name;
        }
        for (LegalHolidayEnum element : LegalHolidayEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return element.getValue();
            }
        }
        return null;
    }

    public String getDescribe() {
        return describe;
    }

    public static boolean containsName(String name) {
        if (StringUtils.isEmpty(name)) {
            return false;
        }
        for (LegalHolidayEnum element : LegalHolidayEnum.values()) {
            if (name.equals(element.getDescribe())) {
                return true;
            }
        }
        return false;
    }

}
