package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.apache.commons.lang3.StringUtils;

/**
 * 报检状态
 * @author DING WEI
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum ReportCheckStatusEnum implements IEnum<Object> {

    REPORT_CHECK_ED("0", "未报检"),
    NOT_REPORT_CHECK("1", "已报检"),
    ;

    private String value;

    private String name;

    ReportCheckStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ReportCheckStatusEnum element : ReportCheckStatusEnum.values()) {
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
        for (ReportCheckStatusEnum element : ReportCheckStatusEnum.values()) {
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
