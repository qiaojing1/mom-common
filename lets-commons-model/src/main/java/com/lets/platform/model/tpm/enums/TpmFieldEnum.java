package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;
import com.lets.platform.model.tpm.enums.*;
/**
 * 排序字段 枚举
 *
 * @ClassName PsiFieldEnum
 * @author: Qiao
 * @create: 2021/08/27 08:49
 * @Version 1.0
 **/
public enum TpmFieldEnum implements IEnum<Object> {


    STATUS("status", "m.status"),

    DEFAULT("createTime", "m.create_time"),
    DEFAULT_1("createTime", "c.create_time"),
    CODE("code", "m.code"),

    // TPM
    SPOT_TIME("spotTime", "m.spot_time"),
    SPOT_START_TIME("startTime", "m.start_time"),
    SPOT_STATUS("spotStatus", "m.spot_status"),
    INSPECTION_TIME("inspectionTime", "m.inspection_time"),
    INSPECTION_START_TIME("startTime", "m.start_time"),
    INSPECTION_END_TIME("endTime", "m.end_time"),
    INSPECTION_STATUS("inspectionStatus", "m.inspection_status"),
    UPDATE_TIME("updateTime", "m.update_time"),
    PLAN_STATUS("planStatus", "m.plan_status"),
    END_TIME("endTime", "m.end_time"),
    MAINTAIN_TIME("maintainTime", "m.maintain_time"),
    KNOWLEDGE_CODE("createTime", "temp.create_time"),
    REPORT_TIME("reportTime","report_time"),
    ;
    // TODO 其他表字段

    private String value;

    private String field;

    TpmFieldEnum(String value, String field) {
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
        for (TpmFieldEnum element : TpmFieldEnum.values()) {
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
