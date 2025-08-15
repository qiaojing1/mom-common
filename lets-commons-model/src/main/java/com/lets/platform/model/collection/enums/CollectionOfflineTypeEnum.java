package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 采集器异常掉线类型 枚举
 *
 * @ClassName CollectionOfflineTypeEnum
 * @author: DING WEI
 * @create: 2021/04/27 13:32
 * @Version 1.0
 **/
public enum CollectionOfflineTypeEnum implements IEnum<Object> {

    COLLECTION_ERROR("3", "采集器异常"),
    SERVER_ERROR("4", "服务异常"),
    SYS_ERROR("5", "系统异常"),
    ;

    private String value;

    private String name;

    CollectionOfflineTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CollectionOfflineTypeEnum element : CollectionOfflineTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
