package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 物料字段 枚举
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/11/21 11:31
 */
public enum MaterialFieldEnum implements IEnum<Object> {

    TYPE("materialType", "物料属性"),
    extFlCode1("extFlCode1", "分类一编码"),
    extFlCode2("extFlCode2", "分类二编码"),
    extFlCode3("extFlCode3", "分类三编码"),
    extFlCode4("extFlCode4", "分类四编码"),
    extFlCode5("extFlCode5", "分类五编码"),
    extFlCode6("extFlCode6", "分类六编码"),
    extFlCode7("extFlCode7", "分类七编码"),
    extFlCode8("extFlCode8", "分类八编码"),
    extFlCode9("extFlCode9", "分类九编码"),
    extFlCode10("extFlCode10", "分类十编码"),
    extFlCode11("extFlCode11", "分类十一编码"),
    extFlCode12("extFlCode12", "分类十二编码"),
    extFlCode13("extFlCode13", "分类十三编码"),
    extFlCode14("extFlCode14", "分类十四编码"),
    extFlCode15("extFlCode15", "分类十五编码"),
    extFlCode16("extFlCode16", "分类十六编码"),
    extFlCode17("extFlCode17", "分类十七编码"),
    extFlCode18("extFlCode18", "分类十八编码"),
    extFlCode19("extFlCode19", "分类十九编码"),
    extFlCode20("extFlCode20", "分类二十编码"),
    extFlCode21("extFlCode21", "分类二十一编码"),
    extFlCode22("extFlCode22", "分类二十二编码"),
    extFlCode23("extFlCode23", "分类二十三编码"),
    extFlCode24("extFlCode24", "分类二十四编码"),
    extFlCode25("extFlCode25", "分类二十五编码"),
    extFlCode26("extFlCode26", "分类二十六编码"),
    extFlCode27("extFlCode27", "分类二十七编码"),
    extFlCode28("extFlCode28", "分类二十八编码"),
    extFlCode29("extFlCode29", "分类二十九编码"),
    extFlCode30("extFlCode30", "分类三十编码"),
    extFlCode31("extFlCode31", "分类三十一编码"),
    extFlCode32("extFlCode32", "分类三十二编码"),
    CODE("materialCode", "物料编码"),
    GROUP_CODE("materialGroupCode", "物料分组编码"),
    ;

    private final String value;

    private final String name;

    MaterialFieldEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (MaterialFieldEnum element : MaterialFieldEnum.values()) {
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
        for (MaterialFieldEnum element : MaterialFieldEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
