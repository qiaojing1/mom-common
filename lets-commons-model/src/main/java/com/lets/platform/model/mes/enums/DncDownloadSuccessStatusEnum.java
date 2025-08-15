package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * DNC程序下载状态
 * @author DING WEI
 * @date 2023/3/13 11:19
 * @version 1.0
 */
public enum DncDownloadSuccessStatusEnum implements IEnum<Object> {

    FAILURE("0", "失败"),
    SUCCESS("1", "成功"),

    ;

    private String value;

    private String name;

    DncDownloadSuccessStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DncDownloadSuccessStatusEnum element : DncDownloadSuccessStatusEnum.values()) {
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
        for (DncDownloadSuccessStatusEnum element : DncDownloadSuccessStatusEnum.values()) {
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
