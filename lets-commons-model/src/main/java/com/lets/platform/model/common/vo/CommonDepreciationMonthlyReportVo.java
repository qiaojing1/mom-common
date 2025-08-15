package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.MaterialAssetTypeEnum;
import com.lets.platform.model.tpm.enums.DepreciationMethodEnum;
import com.lets.platform.model.tpm.enums.ResidualTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 设备-资产信息管理
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-01-21
 */
@Getter
@Setter
@ApiModel(value = "CommonDepreciationMonthlyReportVo", description = "设备折旧月度报表实体类")
public class CommonDepreciationMonthlyReportVo extends BaseEntity {

    @ApiModelProperty("设备id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备编码")
    private String deviceName;

    @ApiModelProperty("资产编码")
    private String assetsCode;

    @ApiModelProperty("统计期间")
    @JsonFormat(pattern = "yyyy/MM")
    private LocalDateTime currentMonth;

    @ApiModelProperty("购置金额 （期末资产原值）")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal acquisitionAmount;

    @ApiModelProperty("购置金额 （期初资产原值 ）")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal lastAcquisitionAmount;

    @ApiModelProperty("开始使用时间")
    private LocalDate startUsingDate;

    @ApiModelProperty("残值额")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal residualAmount;

    @ApiModelProperty("使用寿命 (预计折旧年限*12)")
    private Integer estimatedDepreciableLife;

    @ApiModelProperty("已使用寿命 (当前时间 - 开始使用时间 单位:月)")
    private Integer usedDepreciableLife;

    @ApiModelProperty("期初累计折旧额")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal lastAccumulatedDepreciation;

    @ApiModelProperty("期初资产净值")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal lastNetAssetValue;

    @ApiModelProperty("本期折旧额 (本月折旧了多少)")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal accumulatedDepreciation;

    @ApiModelProperty("本年折旧额 该设备1月至今的折旧额")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal thisYearAccumulatedDepreciation;

    @ApiModelProperty("期末累计折旧额 (截止当前一共折旧了多少)")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal endOfPeriodAccumulatedDepreciation;

    @ApiModelProperty("期末资产净值")
    @TableField("net_asset_value")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal netAssetValue;

    @ApiModelProperty("设备类型")
    private String typeId;
    private String typeName;

    @ApiModelProperty("设备型号")
    private String modelId;
    private String modelName;

    @ApiModelProperty("生产单元")
    private String factoryModeId;
    private String factoryModeCode;
    private String factoryModeName;

    @ApiModelProperty("使用部门")
    private String useOrgId;
    private String useOrgName;
}
