package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.OrderCategoryFieldClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.model.psi.entity.PsiOrderCategoryDetailField;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 单据类别字段默认值
 * @author DING WEI
 * @date 2023/11/17 14:26
 * @version 1.0
 */
@FeignClient(value = "psi",fallback = OrderCategoryFieldClientFallback.class)
public interface OrderCategoryFieldClient {

    @GetMapping("/psiOrderCategoryDetailField/findByCategoryCode")
    RespMsgBean<List<PsiOrderCategoryDetailField>> findByCategoryCode(@RequestParam("code") String code);
    @GetMapping("/psiOrderCategoryDetailField/findByCategoryId")
    RespMsgBean<List<PsiOrderCategoryDetailField>> findByCategoryId(@RequestParam("id") String id);

    @PostMapping("/psiOrderCategoryDetailField/findByCategoryIds4Map")
    RespMsgBean<Map<String, Map<String, PsiOrderCategoryDetailField>>> findByCategoryIds4Map(@RequestBody Collection<String> ids);

}
