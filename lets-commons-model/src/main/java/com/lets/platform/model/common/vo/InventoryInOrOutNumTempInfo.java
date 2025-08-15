package com.lets.platform.model.common.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 盘点出入库数量 临时信息
 * @author: DING WEI
 * @date: 2023/1/9 16:35
 */
@Data
public class InventoryInOrOutNumTempInfo {

    private String storeType;

    private Map<String, BigDecimal> inOrOutNumMap;

}
