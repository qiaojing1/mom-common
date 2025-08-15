package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.MaterialAssetTypeEnum;
import com.lets.platform.model.tpm.enums.DepreciationMethodEnum;
import com.lets.platform.model.tpm.enums.ResidualTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@TableName("common_device_assets")
@ApiModel(value = "CommonDeviceAssets对象", description = "设备-资产信息管理")
public class CommonDeviceAssets extends BaseEntity {

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("折旧方案id")
    @TableField("depreciation_scheme_id")
    private String depreciationSchemeId;

    @ApiModelProperty("折旧方案名称")
    @TableField("depreciation_scheme_name")
    private String depreciationSchemeName;

    @ApiModelProperty("购置金额")
    @TableField("acquisition_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal acquisitionAmount;

    @ApiModelProperty("开始使用日期")
    @TableField("start_using_date")
    private LocalDate startUsingDate;

    /**
     * @see MaterialAssetTypeEnum
     */
    @ApiModelProperty("资产类型 1:机器设备 2:仪器 3:容器 4:运输工具 5:固定资产")
    @TableField("asset_type")
    private String assetType;
    @ApiModelProperty("资产类型 1:机器设备 2:仪器 3:容器 4:运输工具 5:固定资产")
    @TableField(exist = false)
    private String assetTypeName;

    /**
     * @see ResidualTypeEnum
     */
    @ApiModelProperty("残值类型 1:百分比 2:金额")
    @TableField("residual_type")
    private String residualType;
    @ApiModelProperty("残值类型 1:百分比 2:金额")
    @TableField(exist = false)
    private String residualTypeName;

    @ApiModelProperty("残值率")
    @TableField("residual_rate")
    private Integer residualRate;

    @ApiModelProperty("残值额")
    @TableField("residual_amount")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal residualAmount;

    /**
     * @see DepreciationMethodEnum
     */
    @ApiModelProperty("折旧方法 1:年限平均法 2:双倍余额递减法 3:年数总和法")
    @TableField("depreciation_method")
    private String depreciationMethod;
    @ApiModelProperty("折旧方法 1:年限平均法 2:双倍余额递减法 3:年数总和法")
    @TableField(exist = false)
    private String depreciationMethodName;

    @ApiModelProperty("预计折旧年限（年）")
    @TableField("estimated_depreciable_life")
    private Integer estimatedDepreciableLife;

    @ApiModelProperty("累计使用年限（月）")
    @TableField("accumulated_using_life")
    private Integer accumulatedUsingLife;

    @ApiModelProperty("累计折旧年限（月）")
    @TableField("accumulated_depreciable_life")
    private Integer accumulatedDepreciableLife;

    @ApiModelProperty("累计折旧额")
    @TableField("accumulated_depreciation")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal accumulatedDepreciation;

    @ApiModelProperty("资产净值")
    @TableField("net_asset_value")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal netAssetValue;

    @ApiModelProperty("是否被定时任务计算过的折旧额")
    @TableField("is_calculated")
    private Integer isCalculated;
}
