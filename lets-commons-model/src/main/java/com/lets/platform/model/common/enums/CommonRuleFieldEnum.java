package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 排序字段 枚举
 *
 * @ClassName CodeRuleFieldEnum
 * @author: Qiaojing
 * @create: 2021/08/19 11:15
 * @Version 1.0
 **/
public enum CommonRuleFieldEnum implements IEnum<Object> {

    // common_code_rule 编码规则表
    CODE_RULE_DEFAULT("codeRuleDefault", "m.create_time"),
    CODE_RULE_STATUS("ruleStatus", "m.rule_status"),;


    // TODO 其他表字段

    private String value;

    private String field;

    CommonRuleFieldEnum(String value, String field) {
        this.value = value;
        this.field = field;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getOrderField(String value) {
        if (StringUtils.isEmpty(value)) {
            return CODE_RULE_DEFAULT.field;
        }
        for (CommonRuleFieldEnum element : CommonRuleFieldEnum.values()) {
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
