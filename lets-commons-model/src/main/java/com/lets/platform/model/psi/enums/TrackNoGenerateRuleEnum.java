package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zhangweiyan
 * @ClassName TrackNoGenerateRuleEnum
 * @Description 计划跟踪号生成规则
 * @Date 2024/4/18 15:17
 **/
public enum TrackNoGenerateRuleEnum implements IEnum<Object> {
    ORDER_CODE("1", "订单号"),
    ORDER_CODE_PLUS_LINE_NUMBER("2", "订单号+行号"),
    ORDER_CODE_PLUS_Line_LINE_NUMBER("5", "订单号+'-'+行号"),
    PROJECT_NO("3", "项目号"),
    CONTRACT_NO("4", "合同号"),
    MAIN_PLAN_WRITE_BACK("6", "主计划回写"),
    AUTO_CODE("7", "编码规则"),
    ;

    private final String value;

    @Getter
    private final String name;

    TrackNoGenerateRuleEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static TrackNoGenerateRuleEnum getSelfByValue(String value) {
        if (StringUtils.isBlank(value)) {
            return null;
        }
        for (TrackNoGenerateRuleEnum anEnum : TrackNoGenerateRuleEnum.values()) {
            if (value.equals(anEnum.getValue())) {
                return anEnum;
            }
        }

        return null;
    }

    @Override
    public String getValue() {
        return value;
    }
}
