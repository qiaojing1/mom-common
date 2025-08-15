package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 调拨单物料明细特征属性
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-05
 */
@Getter
@Setter
@TableName("psi_transfer_order_material_characteristic")
@ApiModel(value = "PsiTransferOrderMaterialCharacteristic对象", description = "调拨单物料明细特征属性")
public class PsiTransferOrderMaterialCharacteristic extends MaterialSpecific {

    @ApiModelProperty("调拨单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("调拨单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;
}
