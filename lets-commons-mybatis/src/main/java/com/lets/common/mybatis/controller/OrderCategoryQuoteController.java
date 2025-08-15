package com.lets.common.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.psi.dto.OrderCategoryQuoteDto;
import com.service.OrderCategoryQuoteService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 单据类别引用次数 控制器
 * @author DING WEI
 * @since 2023-07-04
 */
@RestController
@Api(tags = "单据类别引用次数 控制器", value = "OrderCategoryQuoteController")
public class OrderCategoryQuoteController extends BaseController {

    @Resource
    private OrderCategoryQuoteService orderCategoryQuoteService;

    @PostMapping("/findOrderCategoryQuote")
    public RespMsgBean<JSONObject> findOrderCategoryQuote(@RequestBody OrderCategoryQuoteDto quoteDto) {
        return success(I18nUtils.getKey(ExceptionEnums.FIND_SUCCESS), orderCategoryQuoteService.findOrderCategoryQuote(quoteDto));
    }

}
