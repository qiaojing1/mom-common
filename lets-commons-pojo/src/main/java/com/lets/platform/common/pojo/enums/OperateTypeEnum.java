package com.lets.platform.common.pojo.enums;

import lombok.Getter;

/**
 * 提交、审核、过账、反审、撤销
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/9/9 11:31
 */
public enum OperateTypeEnum implements IEnum<Object> {

    REJECT("reject", "否决", "5"),
    SUBMIT("submit", "提交", "2"),
    REVOKE("revoke", "撤销", "1"),
    AUDIT("audit", "审核", "3"),
    REVERSE("reverse", "反审", "1"),
    POSTING("posting", "过账", "4"),
    VOIDED("voided", "作废", "6"),
    ;

    private final String value;
    @Getter
    private final String source;
    @Getter
    private final String orderStatus;

    OperateTypeEnum(String value, String source, String orderStatus) {
        this.value = value;
        this.source = source;
        this.orderStatus = orderStatus;
    }

    @Override
    public String getValue() {
        return value;
    }
}
