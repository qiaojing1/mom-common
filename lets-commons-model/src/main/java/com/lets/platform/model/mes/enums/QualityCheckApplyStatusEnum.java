package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 质检申请状态 枚举
 * @author Qiao
 * @date 8/31/21 18:52
 * @version 1.0
 */
public enum QualityCheckApplyStatusEnum implements IEnum<Object> {

    DRAFT("0", "草稿"),
    EXAMINE("1", "待审核"),
    EXAMINED("2", "已审核"),
    CHECKED("3", "已质检"),
    ;

    private String value;

    private String name;

    QualityCheckApplyStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (QualityCheckApplyStatusEnum element : QualityCheckApplyStatusEnum.values()) {
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
        for (QualityCheckApplyStatusEnum element : QualityCheckApplyStatusEnum.values()) {
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
