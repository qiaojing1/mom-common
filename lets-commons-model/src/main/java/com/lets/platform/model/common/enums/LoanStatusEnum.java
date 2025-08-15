/*
 * csy
 */

package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;


/**
 * 借用 枚举
 * @author DING WEI
 * @date 2023/10/20 11:02
 * @version 1.0
 */
public enum LoanStatusEnum implements IEnum<Object> {

    NOT_BORROW("1", "未借用"),
    BORROW("2", "借用中"),
    SEND_BACK("3", "已归还"),
    ;

    private String value;

    private String source;

    LoanStatusEnum(String value, String source) {
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
        for (LoanStatusEnum element : LoanStatusEnum.values()) {
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
        for (LoanStatusEnum element : LoanStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
