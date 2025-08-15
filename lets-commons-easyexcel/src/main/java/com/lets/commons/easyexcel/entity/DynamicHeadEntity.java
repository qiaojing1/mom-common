package com.lets.commons.easyexcel.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 动态表头信息
 * @author: DING WEI
 * @date: 2023/2/7 15:58
 */
@Data
@Builder
public class DynamicHeadEntity implements Comparable<DynamicHeadEntity> {

    /**
     * 列头名
     */
    private List<String> headTitle;
    /**
     * 字段名
     */
    private String key;
    /**
     * 主排序 @ExcelProperty的index值
     */
    private int index;
    /**
     * 次排序 @ExcelProperty的order值
     */
    private int order;

    @Override
    public int compareTo(DynamicHeadEntity o) {
        if (this.index == o.getIndex()) {
            return this.order - o.getOrder();
        }
        return this.index - o.getIndex();
    }

}
