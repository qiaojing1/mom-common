package com.lets.platform.common.pojo.model;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.exception.LetsException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IssueQueryWrapper {

    private Set<IssueQueryItem> issueQueryItems;

    public IssueQueryWrapper clean() {
        this.issueQueryItems = null;
        return this;
    }

    public IssueQueryWrapper addQueryParam(String sourceOrderCategoryId, String targetMenuCode) {
        if (this.issueQueryItems == null) {
            issueQueryItems = new HashSet<>();
        }
        this.issueQueryItems.add(new IssueQueryItem(sourceOrderCategoryId, targetMenuCode));
        return this;
    }

    public String getTargetOrderCategoryId() {
        if (CollUtil.isEmpty(this.issueQueryItems)) {
            return null;
        }
        if (this.issueQueryItems.size() == 1 || this.issueQueryItems.stream().map(IssueQueryItem::getTargetOrderCategoryId).collect(Collectors.toSet()).size() == 1) {
            return new ArrayList<>(this.issueQueryItems).get(0).getTargetOrderCategoryId();
        }
        throw new LetsException(0, "无法确定明确的目标单据类别");
    }

    public String getTargetOrderCategoryId(String sourceOrderCategoryId, String targetMenuCode) {
        if (CollUtil.isEmpty(this.issueQueryItems)) {
            return null;
        }
        for (IssueQueryItem issueQueryItem : this.issueQueryItems) {
            if (issueQueryItem.getSourceOrderCategoryId().equals(sourceOrderCategoryId) && issueQueryItem.getTargetMenuCode().equals(targetMenuCode)) {
                return issueQueryItem.getTargetOrderCategoryId();
            }
        }
        return null;
    }

    public Set<String> getTargetOrderCategoryIds() {
        return this.issueQueryItems.stream().map(IssueQueryItem::getTargetOrderCategoryId).collect(Collectors.toSet());
    }

    public IssueQueryWrapper query() {
        try {
            Object issueService = SpringUtil.getBean("issueService");
            issueService.getClass().getMethod("findTargetOrderCategory", Set.class).invoke(issueService, this.issueQueryItems);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            Object issueClient = SpringUtil.getBean("issueClient");
            if (issueClient != null) {
                try {
                    @SuppressWarnings("unchecked")
                    RespMsgBean<Set<IssueQueryItem>> result = (RespMsgBean<Set<IssueQueryItem>>) issueClient.getClass().getMethod("findTargetOrderCategory", Set.class)
                                                                                                            .invoke(issueClient, this.issueQueryItems);
                    this.issueQueryItems = result.handler();
                } catch (NoSuchBeanDefinitionException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
                    throw new LetsException(0, "bean实例获取失败");
                }
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new LetsException(0, "bean实例获取失败");
        }
        return this;
    }
}
