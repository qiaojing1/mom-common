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
 * 采购-物料可采控制-可采购对象
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-04-22
 */
@Getter
@Setter
@TableName("psi_purchase_material_control_object")
@ApiModel(value = "PsiPurchaseMaterialControlObject对象", description = "采购-物料可采控制-可采购对象")
public class PsiPurchaseMaterialControlObject extends BaseEntity {

    @ApiModelProperty("表头id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("目标id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("可销范围 0:物料 1: 物料分组")
    @TableField("target_type")
    private String targetType;
    @ApiModelProperty("可销范围 0:物料 1: 物料分组")
    @TableField(exist = false)
    private String targetTypeName;

    @ApiModelProperty("目标名称")
    @TableField("target_name")
    private String targetName;

    @ApiModelProperty("物料编号")
    @TableField("target_code")
    private String targetCode;

    @ApiModelProperty("物料分组id")
    @TableField("target_group_id")
    private String targetGroupId;

    @ApiModelProperty("物料分组名称")
    @TableField("target_group_name")
    private String targetGroupName;

    @TableField(exist = false)
    private Integer rowIndex;
}
