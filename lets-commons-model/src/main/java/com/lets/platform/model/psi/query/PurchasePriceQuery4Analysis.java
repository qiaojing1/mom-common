package com.lets.platform.model.psi.query;

import com.lets.platform.model.tpm.enums.SparePriceStatisticsSourceEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.Collection;

/**
 * 查询单价
 * @author DING WEI
 * @date 2024/12/18 17:31
 * @version 1.0
 */
@Data
@ApiModel("查询单价")
public class PurchasePriceQuery4Analysis {

    private SparePriceStatisticsSourceEnum sourceEnum;

    @ApiModelProperty("开始日期")
    private LocalDate startDate;

    @ApiModelProperty("结束日期")
    private LocalDate endDate;

    @ApiModelProperty("物料")
    private Collection<String> materialIds;
}
