package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * ETL转换-集合类型 枚举
 *
 * @ClassName EtlComposeCollectionTypeEnum
 * @author: DING WEI
 * @create: 2022/06/25 08:45
 * @Version 1.0
 **/
public enum EtlComposeCollectionTypeEnum implements IEnum<Object> {

    UNION_DISTINCT("1", "并集去重"),
    UNION_NOT_DISTINCT("2", "并集不去重"),
    JOIN("3", "交集"),
    DIFFERENCE("4", "差集"),
    ;

    private String value;

    private String source;

    EtlComposeCollectionTypeEnum(String value, String source) {
        this.value = value;
        this.source = source;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return source;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (EtlComposeCollectionTypeEnum element : EtlComposeCollectionTypeEnum.values()) {
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
        for (EtlComposeCollectionTypeEnum element : EtlComposeCollectionTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
