/*
 * csy
 */

package com.lets.platform.model.mes.dto;

import cn.hutool.core.bean.BeanUtil;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName OrderExtFieldDTO
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2025/7/5
 */
@Data
public class OrderExtFieldDTO {

    private List<Map<String, Object>> records;
    private String key;
    private String funcKey;



}
