package com.lets.platform.model.collection.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 安环-特种作业证书-状态 枚举
 * @author DING WEI
 * @date 2023/2/1 10:10
 * @version 1.0
 */
public enum SeSpecialJobCertificateStatusEnum implements IEnum<Object> {

    NORMAL("1", "正常"),
    TO_BE_RECHECK("2", "待复审"),
    BE_OVERDUE_SOON("3", "临期"),
    BE_OVERDUE("4", "过期"),
    ;

    private String value;

    private String name;

    SeSpecialJobCertificateStatusEnum(String value, String name) {
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
        for (SeSpecialJobCertificateStatusEnum element : SeSpecialJobCertificateStatusEnum.values()) {
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
