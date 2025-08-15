package com.lets.platform.model.common.vo;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 大屏封装
 */
@Data
public class DynMapVo {
    /**
     * 查询条件集合
     */
    List<Map<String, String>> list1;

    /**
     * 查询的字段集合
     */
    List<Map<String, String>> list2;

    /**
     * 排序字段
     */
    Map<String, String> map3;

}
