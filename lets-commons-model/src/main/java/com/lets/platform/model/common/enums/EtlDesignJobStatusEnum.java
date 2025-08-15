package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * ETL任务状态 枚举
 *
 * @ClassName EtlDesignJobStatusEnum
 * @author: DING WEI
 * @create: 2022/06/25 08:45
 * @Version 1.0
 **/
public enum EtlDesignJobStatusEnum implements IEnum<Object> {

    STOP("0", "停止"),
    RUNNING("1", "运行"),
    ;

    private String value;

    private String source;

    EtlDesignJobStatusEnum(String value, String source) {
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
        for (EtlDesignJobStatusEnum element : EtlDesignJobStatusEnum.values()) {
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
        for (EtlDesignJobStatusEnum element : EtlDesignJobStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
