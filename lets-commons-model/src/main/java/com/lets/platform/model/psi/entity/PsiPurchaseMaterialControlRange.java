package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 采购-物料可采控制-可采购范围
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-04-22
 */
@Getter
@Setter
@TableName("psi_purchase_material_control_range")
@ApiModel(value = "PsiPurchaseMaterialControlRange对象", description = "采购-物料可采控制-可采购范围")
public class PsiPurchaseMaterialControlRange extends BaseEntity {

    @ApiModelProperty("表头id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("目标id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("可销范围 0:采购部门 1: 采购人员")
    @TableField("target_type")
    private String targetType;
    @ApiModelProperty("可销范围 0:采购部门 1: 采购人员")
    @TableField(exist = false)
    private String targetTypeName;

    @ApiModelProperty("目标名称")
    @TableField("target_name")
    private String targetName;

    @ApiModelProperty("目标编码")
    @TableField("target_code")
    private String targetCode;

    @ApiModelProperty("采购部门id")
    @TableField("target_org_id")
    private String targetOrgId;

    @ApiModelProperty("采购部门名称")
    @TableField("target_org_name")
    private String targetOrgName;

    @TableField(exist = false)
    private Integer rowIndex;
}
