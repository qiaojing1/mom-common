package com.lets.platform.common.pojo.model;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.exception.LetsException;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
public class IssueQueryItem {
    String sourceOrderCategoryId;
    String targetMenuCode;
    @Setter
    String targetOrderCategoryId;

    public IssueQueryItem() {
    }

    public IssueQueryItem(String sourceOrderCategoryId, String targetMenuCode) {
        this.targetMenuCode = targetMenuCode;
        this.sourceOrderCategoryId = sourceOrderCategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        IssueQueryItem that = (IssueQueryItem) o;
        return Objects.equals(targetMenuCode, that.targetMenuCode) && Objects.equals(sourceOrderCategoryId, that.sourceOrderCategoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetMenuCode, sourceOrderCategoryId);
    }
}
