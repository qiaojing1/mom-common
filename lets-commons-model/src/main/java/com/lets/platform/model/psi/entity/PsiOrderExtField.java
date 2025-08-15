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
 * 订单扩展用户字段
 * </p>
 *
 * @author csy
 * @since 2025-07-02
 */
@Getter
@Setter
@TableName("psi_order_ext_field")
@ApiModel(value = "PsiOrderExtField对象", description = "订单扩展用户字段")
public class PsiOrderExtField extends BaseEntity {

    @ApiModelProperty("当前单据ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("当前单据业务类型ID")
    @TableField("order_business_id")
    private String orderBusinessId;

    @ApiModelProperty("当前单据明细id")
    @TableField("order_detail_id")
    private String orderDetailId;

    @ApiModelProperty("源单据ID")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单据业务类型ID")
    @TableField("source_order_business_id")
    private String sourceOrderBusinessId;

    @ApiModelProperty("源单据明细id")
    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;

    @ApiModelProperty("合同编号")
    @TableField("contract_code")
    private String contractCode;

    @ApiModelProperty("扩展字段1")
    @TableField("ext_field1")
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField("ext_field2")
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField("ext_field3")
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField("ext_field4")
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField("ext_field5")
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField("ext_field6")
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField("ext_field7")
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField("ext_field8")
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField("ext_field9")
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField("ext_field10")
    private String extField10;
}
