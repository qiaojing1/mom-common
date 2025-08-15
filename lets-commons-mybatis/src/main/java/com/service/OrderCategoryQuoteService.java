package com.service;

import com.alibaba.fastjson.JSONObject;
import com.lets.platform.model.psi.dto.OrderCategoryQuoteDto;

/**
 * 单据类别引用次数
 * @author: DING WEI
 * @date: 2024/4/19 16:24
 */
public interface OrderCategoryQuoteService {

    JSONObject findOrderCategoryQuote(OrderCategoryQuoteDto quoteDto);

}
