package com.lets.platform.model.psi.entity;

import lombok.Data;

/**
 * 单据类别 引用次数
 * @author: DING WEI
 * @date: 2023/8/31 17:12
 */
@Data
public class CategoryQuoteCount {

    private String orderCategoryId;

    private Integer quoteTimes;

}
