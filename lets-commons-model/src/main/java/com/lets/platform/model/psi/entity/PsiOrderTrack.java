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
 * 订单跟踪号流水表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-04-18
 */
@Getter
@Setter
@TableName("psi_order_track")
@ApiModel(value = "PsiOrderTrack对象", description = "订单跟踪号流水表")
public class PsiOrderTrack extends BaseEntity {

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("销售订单相关信息，方便后续单据快速找到源销售订单")
    @TableField("sale_order_no")
    private String saleOrderNo;

    @ApiModelProperty("最上级单据编码(当前单据无上级追溯记录时，当前单据即为最上级单据)")
    @TableField("root_order_code")
    private String rootOrderCode;

    @ApiModelProperty("最上级单据id")
    @TableField("root_order_id")
    private String rootOrderId;

    @ApiModelProperty("最上级单据明细id")
    @TableField("root_order_detail_id")
    private String rootOrderDetailId;

    @ApiModelProperty("最上级单据类别编码")
    @TableField("root_order_category_code")
    private String rootOrderCategoryCode;

    @ApiModelProperty("最上级单据类别名称")
    @TableField("root_order_category_name")
    private String rootOrderCategoryName;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("当前单据ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private String orderTime;

    @ApiModelProperty("单据状态")
    @TableField("order_status")
    private String orderStatus;

    @ApiModelProperty("当前单据编号")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("当前单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("当前单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;

    @ApiModelProperty("当前单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("当前单据业务类型ID")
    @TableField("order_business_id")
    private String orderBusinessId;

    @ApiModelProperty("当前单据业务类型名称")
    @TableField("order_business_name")
    private String orderBusinessName;

    @ApiModelProperty("当前单据订货客户ID")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("当前单据订货客户名称")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("当前单据明细id")
    @TableField("order_detail_id")
    private String orderDetailId;

    @ApiModelProperty("当前单据物料id")
    @TableField("order_material_id")
    private String orderMaterialId;

    @ApiModelProperty("当前单据明细行号")
    @TableField("order_detail_line_number")
    private Long orderDetailLineNumber;

    @ApiModelProperty("源单据ID")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单据编号")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单据类别ID")
    @TableField("source_order_category_id")
    private String sourceOrderCategoryId;

    @ApiModelProperty("源单据类别编码")
    @TableField("source_order_category_code")
    private String sourceOrderCategoryCode;

    @ApiModelProperty("源单据类别名称")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;

    @ApiModelProperty("源单据业务类型ID")
    @TableField("source_order_business_id")
    private String sourceOrderBusinessId;

    @ApiModelProperty("源单据业务类型名称")
    @TableField("source_order_business_name")
    private String sourceOrderBusinessName;

    @ApiModelProperty("源单据订货客户ID")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源单据订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;

    @ApiModelProperty("源单据明细id")
    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;

    @ApiModelProperty("源单据明细行号")
    @TableField("source_order_detail_line_number")
    private Long sourceOrderDetailLineNumber;

    @ApiModelProperty("生成方式")
    @TableField(exist = false)
    private String trackWay;


}
