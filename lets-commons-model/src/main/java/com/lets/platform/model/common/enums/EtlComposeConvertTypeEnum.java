package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * ETL转换组件类型 枚举
 *
 * @ClassName EtlComposeConvertTypeEnum
 * @author: DING WEI
 * @create: 2022/06/25 08:45
 * @Version 1.0
 **/
public enum EtlComposeConvertTypeEnum implements IEnum<Object> {

    GUID("1", "GUID"),
    COLLECTION("2", "集合"),
    JOIN("3", "连接"),
    ;

    private String value;

    private String source;

    EtlComposeConvertTypeEnum(String value, String source) {
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
        for (EtlComposeConvertTypeEnum element : EtlComposeConvertTypeEnum.values()) {
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
        for (EtlComposeConvertTypeEnum element : EtlComposeConvertTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
