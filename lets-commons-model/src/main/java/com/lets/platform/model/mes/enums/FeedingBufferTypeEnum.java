package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 缓存区数据类型[buffer缓存区;wait_transport待转运区;transport转运区,storage储存区]
 * @author DING WEI
 * @date 2024/7/4 17:47
 * @version 1.0
 */
public enum FeedingBufferTypeEnum implements IEnum<Object> {

    BUFFER("buffer", "缓存区"),
    WAIT_TRANSPORT("wait_transport", "待转运区"),
    TRANSPORT("transport", "转运区"),
    STORAGE("storage", "储存区"),
    ;

    private String value;

    private String name;

    FeedingBufferTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (FeedingBufferTypeEnum element : FeedingBufferTypeEnum.values()) {
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
        for (FeedingBufferTypeEnum element : FeedingBufferTypeEnum.values()) {
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
