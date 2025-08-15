package com.lets.platform.model.psi.query;

import cn.hutool.core.date.DateTime;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 库存月度报表
 * </p>
 *
 * @author zhangweoyan
 * @since 2024-09-11
 */
@Getter
@Setter
@ApiModel(value = "PsiMonthStockReportQuery", description = "库存月度报表")
public class PsiMonthStockReportQuery extends BaseEntity {

    @ApiModelProperty("仓库")
    private String storeId;

    @ApiModelProperty("库区")
    private String areaId;

    @ApiModelProperty("库位")
    private String positionId;

    @ApiModelProperty("物料库存单位")
    private String storeUnitId;

    @ApiModelProperty("物料")
    private String materialId;

    @ApiModelProperty("批号")
    private String batchNumber;

    @ApiModelProperty("统计的月份，格式20240911")
    private String dateTime;

    private DateTime startOfMonth;
    private DateTime endOfMonth;

    private int lastMonth;
}
