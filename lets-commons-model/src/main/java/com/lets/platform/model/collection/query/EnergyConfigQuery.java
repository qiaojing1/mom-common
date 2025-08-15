package com.lets.platform.model.collection.query;

import lombok.Data;

/**
 * 水电气查询条件
 * @author: DING WEI
 * @date: 2022/12/2 11:50
 */
@Data
public class EnergyConfigQuery {

    private Integer year;
    private Integer month;

    private String tenancyId;

}
