package com.lets.platform.client.psi.fallback;

import com.lets.platform.client.psi.IssueClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.model.IssueInfo;
import com.lets.platform.common.pojo.model.IssueItem;
import com.lets.platform.common.pojo.model.IssueParam;
import com.lets.platform.common.pojo.model.IssueQueryItem;
import com.lets.platform.model.psi.entity.PsiBusinessConfig;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class IssueClientFallback extends BaseController implements IssueClient {
    @Override
    public RespMsgBean<IssueInfo> findIssueInfo(IssueParam issueParam) {
        return failure();
    }

    @Override
    public RespMsgBean<Set<IssueQueryItem>> findTargetOrderCategory(@RequestBody Set<IssueQueryItem> issueQueryItems) {
        return failure();
    }

    @Override
    public RespMsgBean<List<PsiBusinessConfig>> getBusinessConfig(String menuCode) {
        return success(new ArrayList<>());
    }

    @Override
    public RespMsgBean<Set<IssueQueryItem>> findTargetOrderCategoryWithOutBussConfig(Set<IssueQueryItem> issueQueryItems) {
        return success(new HashSet<>());
    }

    @Override
    public RespMsgBean<Set<String>> getSourceOrderCategoryIds(String targetOrderCategoryId) {
        return failure();
    }
}
