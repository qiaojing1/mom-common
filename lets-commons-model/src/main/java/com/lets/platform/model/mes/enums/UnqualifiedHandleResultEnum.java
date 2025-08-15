package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * 质检工单不合格品处理结果 枚举
 *
 * @author Qiao
 * @version 1.0
 * @date 12/27/21 18:52
 */
public enum UnqualifiedHandleResultEnum implements IEnum<String> {

    SCRAP("1", "报废"),
    DEFECT("2", "不良"),
    REWORK("3", "返工"),
    REPAIR("4", "返修"),
    GIVE_IN_RECEIVE("5", "让步接收"),
    PROCESS_SCRAP("6", "工废"),
    MATERIAL_SCRAP("7", "料废"),
    UNDETERMINED("8", "待定"),
    ;

    private final String value;

    @Getter
    private final String name;

    UnqualifiedHandleResultEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (UnqualifiedHandleResultEnum element : UnqualifiedHandleResultEnum.values()) {
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
        for (UnqualifiedHandleResultEnum element : UnqualifiedHandleResultEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }

    @Override
    public String getValue() {
        return value;
    }

}
