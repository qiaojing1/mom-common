package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * ETL设计资源状态 枚举
 *
 * @ClassName EtlDesignStatusEnum
 * @author: DING WEI
 * @create: 2021/08/18 08:45
 * @Version 1.0
 **/
public enum EtlDesignStatusEnum implements IEnum<Object> {

    NOT_SAVE("-1", "未保存"),
    NOT_PUBLISH("0", "未发布"),
    PUBLISH_ED("1", "已发布"),
    ;

    private String value;

    private String source;

    EtlDesignStatusEnum(String value, String source) {
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
        for (EtlDesignStatusEnum element : EtlDesignStatusEnum.values()) {
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
        for (EtlDesignStatusEnum element : EtlDesignStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
