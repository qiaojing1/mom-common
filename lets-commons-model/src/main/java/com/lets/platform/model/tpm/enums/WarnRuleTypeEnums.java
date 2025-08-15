package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;
/**
 * 预警规则类型 枚举
 * @ClassName WarnRuleTypeEnums
 * @author: DING WEI
 * @create: 2021/01/14 18:01
 * @Version 1.0
 **/
public enum WarnRuleTypeEnums implements IEnum<Object> {

    WARN_RULE_MAINTAIN("1", "保养预警"),
    WARN_RULE_SPOT("2", "点检预警"),
    WARN_RULE_REPAIR("3", "维修预警"),
    WARN_RULE_STORAGE_STOCK("4", "安全库存预警"),
    WARN_DIE_FIXTURE_LIFE("5", "寿命预警"),
    WARN_RULE_INSPECTION("6", "巡检预警"),

    DIE_FIXTURE_PICKING_APPLY("7", "领用申请单预警"),
    DIE_FIXTURE_PICKING_ORDER("8", "领用单预警"),
    DIE_FIXTURE_RETURN_APPLY("9", "退库申请单预警"),
    DIE_FIXTURE_RETURN_ORDER("10", "退库单预警"),
    DIE_FIXTURE_ASSEMBLE_ORDER("11", "组装工单预警"),
    DIE_FIXTURE_DISMANTLE_ORDER("12", "拆卸工单预警"),
    DIE_FIXTURE_UPPER_DIE_ORDER("13", "上模工单预警"),
    DIE_FIXTURE_LOWER_DIE_ORDER("14", "下模工单预警"),
    DIE_FIXTURE_LIFE_DEDUCTION_ORDER("15", "寿命扣减单预警"),
    DIE_FIXTURE_SCRAP_ORDER("16", "报废单预警"),
    DIE_FIXTURE_UNUSUAL_ORDER("17", "异常报修单预警"),
    DIE_FIXTURE_REPAIR_ORDER("18", "维修工单预警"),
    DIE_FIXTURE_MAINTAIN_ORDER("19", "保养工单预警"),

    SE_DEVICE("20", "特种设备管理预警"),
    SE_JOB_CERTIFICATE("21", "特种证书管理预警"),
    SE_FLAME("22", "明火报警"),
    SE_NOT_WEAR_SAFETY_HAT("23", "未戴安全帽报警"),

    ;

    private String value;

    private String name;

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    WarnRuleTypeEnums(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WarnRuleTypeEnums element : WarnRuleTypeEnums.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static WarnRuleTypeEnums getElement(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WarnRuleTypeEnums element : WarnRuleTypeEnums.values()) {
            if (value.equals(element.getValue())) {
                return element;
            }
        }
        return null;
    }

}
