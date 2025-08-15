package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.base.businessEntity.BaseSerialEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 销售出库关联序列号
 * </p>
 *
 * @author FZY
 * @since 2024-08-27
 */
@Getter
@Setter
@TableName("psi_sale_stock_out_serial")
@ApiModel(value = "PsiSaleStockOutSerial对象", description = "销售出库关联序列号")
public class PsiSaleStockOutSerial extends BaseSerialEntity {

    @ApiModelProperty("销售出库单id")
    @TableField("order_id")
    private String orderId;

    @TableField(exist = false)
    private boolean selectable;

    @ApiModelProperty("销售出库单明细id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("条码序列号id")
    @TableField("source_serial_id")
    private String sourceSerialId;

    @ApiModelProperty("序列号前缀")
    @TableField("prefix_serial")
    private String prefixSerial;

    @ApiModelProperty("序列号后缀流水")
    @TableField("suffix_serial")
    private String suffixSerial;

    @ApiModelProperty("完整序列号编码")
    @TableField("total_serial")
    private String totalSerial;
}
