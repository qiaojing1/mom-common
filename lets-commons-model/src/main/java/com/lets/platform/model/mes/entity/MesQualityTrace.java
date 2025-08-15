package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 质量追溯方案配置
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-05-30
 */
@Getter
@Setter
@TableName("mes_quality_trace")
@ApiModel(value = "MesQualityTrace对象", description = "质量追溯方案配置")
public class MesQualityTrace extends BaseEntity implements Serializable {

    @ApiModelProperty("方案编码（允许自动编码）")
    @TableField("code")
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("适用物料范围 0:通用 1:物料 2:物料分组")
    @TableField("suit_material_range")
    private String suitMaterialRange;
    @TableField(exist = false)
    private String suitMaterialRangeName;

    @ApiModelProperty("适用客户范围 0:通用 1:客户 2:客户分组")
    @TableField("suit_customer_range")
    private String suitCustomerRange;
    @TableField(exist = false)
    private String suitCustomerRangeName;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private String enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<MesQualityTraceDetail> details;

    @ApiModelProperty("适用客户")
    @TableField(exist = false)
    private List<MesQualityTraceCustomer> customers;

    @ApiModelProperty("适用物料")
    @TableField(exist = false)
    private List<MesQualityTraceMaterial> materials;


}
