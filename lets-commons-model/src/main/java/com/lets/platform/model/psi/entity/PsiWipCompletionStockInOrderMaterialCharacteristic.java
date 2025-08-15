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
 * 完工入库单物料明细特征属性
 * </p>
 *
 * @author csy
 * @since 2023-10-12
 */
@Getter
@Setter
@TableName("psi_wip_completion_stock_in_order_material_characteristic")
@ApiModel(value = "PsiWipCompletionStockInOrderMaterialCharacteristic对象", description = "完工入库单物料明细特征属性")
public class PsiWipCompletionStockInOrderMaterialCharacteristic extends MaterialSpecific {

    @ApiModelProperty("完工入库单物料明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("完工入库单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;
}
