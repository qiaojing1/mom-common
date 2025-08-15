package com.lets.platform.model.psi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 计划订单-物料信息
 * @author DING WEI
 * @date 2023/12/19 13:59
 * @version 1.0
 */
@Data
public class PsiMaterial4Plan {

    @ApiModelProperty("物料主键")
    private String materialId;

    private String groupId;
    private String groupCode;
    private String basicUnitId;
    private String basicUnitCode;
    private String basicUnitName;
    private Integer basicUnitAccuracy;
    private Integer basicUnitRoundOffType;

    private Integer storable;

    @ApiModelProperty("批号控制方式")
    private String lotNoControlType;
    @ApiModelProperty("批号应用范围")
    private String lotNoScope;

    private String serialNumberControlType;
    private String serialNumberScope;

    @ApiModelProperty("默认仓库")
    private String inventoryStoreId;
    private String inventoryStoreName;
    @ApiModelProperty("默认库区")
    private String inventoryAreaId;
    private String inventoryAreaName;
    @ApiModelProperty("默认库位")
    private String inventoryPositionId;
    private String inventoryPositionName;

    @ApiModelProperty("日产量")
    private BigDecimal productionDailyOutput;
}
