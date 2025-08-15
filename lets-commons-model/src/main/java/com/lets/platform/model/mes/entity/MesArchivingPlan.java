package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 产品档案配置
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-09-20
 */
@Getter
@Setter
@TableName("mes_archiving_plan")
@ApiModel(value = "MesArchivingPlan对象", description = "产品档案配置")
public class MesArchivingPlan extends BaseEntity {

    @ApiModelProperty("方案编码（允许自动编码）")
    @TableField("code")
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("适用物料范围 0:通用 1:物料 2:物料分组")
    @TableField("suit_material_range")
    private String suitMaterialRange;
    @ApiModelProperty("适用物料范围 0:通用 1:物料 2:物料分组")
    @TableField(exist = false)
    private String suitMaterialRangeName;

    @ApiModelProperty("适用客户范围 0:通用 1:客户 2:客户分组")
    @TableField("suit_customer_range")
    private String suitCustomerRange;
    @ApiModelProperty("适用客户范围 0:通用 1:客户 2:客户分组")
    @TableField(exist = false)
    private String suitCustomerRangeName;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private String enable;
    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("适用物料范围数组")
    @TableField(exist = false)
    private List<MesArchivingPlanMaterial> suitableMaterialList;

    @ApiModelProperty("适用客户范围数组")
    @TableField(exist = false)
    private List<MesArchivingPlanCustomer> suitableCustomerList;

    @ApiModelProperty("目录数组")
    @TableField(exist = false)
    private List<MesArchivingPlanCatalogue> catalogueList;
}
