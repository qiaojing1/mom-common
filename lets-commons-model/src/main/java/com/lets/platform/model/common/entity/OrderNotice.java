/*
 * csy
 */

package com.lets.platform.model.common.entity;

import lombok.Data;

@Data
public class OrderNotice {
    private String orderId;
    private String orderCode;
    private String menuCode;
    private String menuName;
    private Integer matchTimes;
    private String ruleId;
    private String isTodo;
    private String orderCategoryId;
    private String orderCategoryName;

    private String currParamId;

    private String extraContent;
    private String extraContentName;
}
