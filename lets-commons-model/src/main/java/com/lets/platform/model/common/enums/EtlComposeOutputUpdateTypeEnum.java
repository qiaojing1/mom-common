package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * ETL输出表-更新类型 枚举
 * 更新方式[1数据附加，2数据覆盖]
 * @ClassName EtlComposeOutputUpdateTypeEnum
 * @author: DING WEI
 * @create: 2022/06/25 08:45
 * @Version 1.0
 **/
public enum EtlComposeOutputUpdateTypeEnum implements IEnum<Object> {

    APPEND("1", "数据附加"),
    COVER("2", "数据覆盖"),
    ;

    private String value;

    private String source;

    EtlComposeOutputUpdateTypeEnum(String value, String source) {
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
        for (EtlComposeOutputUpdateTypeEnum element : EtlComposeOutputUpdateTypeEnum.values()) {
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
        for (EtlComposeOutputUpdateTypeEnum element : EtlComposeOutputUpdateTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
