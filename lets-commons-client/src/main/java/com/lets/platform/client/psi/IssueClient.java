package com.lets.platform.client.psi;

import com.lets.platform.client.psi.fallback.IssueClientFallback;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.model.IssueInfo;
import com.lets.platform.common.pojo.model.IssueItem;
import com.lets.platform.common.pojo.model.IssueParam;
import com.lets.platform.common.pojo.model.IssueQueryItem;
import com.lets.platform.model.psi.entity.PsiBusinessConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

/**
 * 下发 Feign接口
 */
@FeignClient(value = "psi", qualifier = "issueClient", fallback = IssueClientFallback.class)
public interface IssueClient {

    @PostMapping("/issue/findIssueInfo")
    RespMsgBean<IssueInfo> findIssueInfo(@RequestBody IssueParam issueParam);

    @PostMapping("/issue/findTargetOrderCategory")
    RespMsgBean<Set<IssueQueryItem>> findTargetOrderCategory(@RequestBody Set<IssueQueryItem> issueQueryItems);

    @GetMapping("/issue/getBusinessConfig")
    RespMsgBean<List<PsiBusinessConfig>> getBusinessConfig(@RequestParam("menuCode") String menuCode);


    @PostMapping("/issue/findTargetOrderCategoryWithOutBussConfig")
    RespMsgBean<Set<IssueQueryItem>> findTargetOrderCategoryWithOutBussConfig(@RequestBody Set<IssueQueryItem> issueQueryItems);

    @GetMapping("/issue/getSourceOrderCategoryIds")
    RespMsgBean<Set<String>> getSourceOrderCategoryIds(@RequestParam(value = "targetOrderCategoryId") String targetOrderCategoryId);
}
