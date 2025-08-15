package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 排序字段 枚举
 *
 * @ClassName MesFieldEnum
 * @author: Qiao
 * @create: 2021/09/13 16:53
 * @Version 1.0
 **/
public enum MesFieldEnum implements IEnum<Object> {

    DEFAULT("createTime", "m.create_time"),
    ID("id", "m.id"),
    CODE("code", "m.code"),
    STATUS("status", "m.status"),

    TYPE("type", "m.type"),

    ISSUE_TIME("issueTime", "m.issue_time"),

    // 绩效统计
    PRODUCE_NUMBER("produceNumber", "produce_number"),
    PQUALIFIED_NUMBER("qualifiedNumber", "pqualified_number"),
    UNQUALIFIED_NUMBER("unqualifiedNumber", "unqualified_number"),
    PRODUCE_HOUR("produceHour", "produce_hour"),

    // 生产 是否紧急
    IS_URGENT("is_urgent", "m.is_urgent"),
    DEVICE_ID("deviceId", "m.device_id"),

    STEP("step", "m.step"),
    SORT("sort", "m.sort"),
    USER_ID("userId", "m.user_id"),
    MATERIAL_CODE("materialCode", "m.material_code"),

    LINE_NUMBER("lineNumber", "m.line_number"),
    ;
    // TODO 其他表字段

    private String value;

    private String field;

    MesFieldEnum(String value, String field) {
        this.value = value;
        this.field = field;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getOrderField(String value) {
        if (StringUtils.isEmpty(value)) {
            return DEFAULT.field;
        }
        for (MesFieldEnum element : MesFieldEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getField();
            }
        }
        return null;
    }

    public String getField() {
        return field;
    }
}
