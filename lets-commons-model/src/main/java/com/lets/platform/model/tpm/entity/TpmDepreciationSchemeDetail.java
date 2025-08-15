package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;

import com.lets.platform.model.psi.enums.MaterialAssetTypeEnum;
import com.lets.platform.model.tpm.enums.DepreciationMethodEnum;
import com.lets.platform.model.tpm.enums.ResidualTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 折旧方案明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-01-21
 */
@Getter
@Setter
@TableName("tpm_depreciation_scheme_detail")
@ApiModel(value = "TpmDepreciationSchemeDetail对象", description = "折旧方案明细")
public class TpmDepreciationSchemeDetail extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("parent_id")
    private String parentId;

    /**
     * @see MaterialAssetTypeEnum
     */
    @ApiModelProperty("资产类型 1:机器设备 2:仪器 3:容器 4:运输工具 5:固定资产")
    @TableField("asset_type")
    private String assetType;
    @ApiModelProperty("资产类型 1:机器设备 2:仪器 3:容器 4:运输工具 5:固定资产")
    @TableField(exist = false)
    private String assetTypeName;

    @ApiModelProperty("折旧年限（年）")
    @TableField("depreciation_life")
    private Integer depreciationLife;

    /**
     * @see ResidualTypeEnum
     */
    @ApiModelProperty("残值类型 1:百分比 2:金额")
    @TableField("residual_type")
    private String residualType;
    @ApiModelProperty("残值类型 1:百分比 2:金额")
    @TableField(exist = false)
    private String residualTypeName;

    @ApiModelProperty("残值率 当残值类型为百分比时必填")
    @TableField("residual_rate")
    private Integer residualRate;

    @ApiModelProperty("残值额 当残值类型为金额时必填")
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

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
}
