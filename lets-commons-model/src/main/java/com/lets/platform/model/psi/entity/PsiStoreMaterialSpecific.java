package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 库存物料-特征属性
 * @author DING WEI
 * @since 2023-09-08
 */
@Getter
@Setter
@TableName("psi_store_material_specific")
@ApiModel(value = "PsiStoreMaterialSpecific对象", description = "库存物料-特征属性")
public class PsiStoreMaterialSpecific extends MaterialSpecific {

    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("库存主键")
    @TableField("order_id")
    private String orderId;
}
