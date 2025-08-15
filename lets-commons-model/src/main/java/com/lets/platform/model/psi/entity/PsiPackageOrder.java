package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 装箱单
 * </p>
 *
 * @author csy
 * @since 2024-07-01
 */
@Getter
@Setter
@TableName("psi_package_order")
@ApiModel(value = "PsiPackageOrder对象", description = "装箱单")
public class PsiPackageOrder extends BaseEntity {

    @ApiModelProperty("箱条码")
    @TableField("code")
    private String code;
    @ApiModelProperty("箱条码")
    @TableField(exist = false)
    private String containerBarcode;

    @ApiModelProperty("包装箱编码")
    @TableField("container_id")
    private String containerId;

    @ApiModelProperty("包装箱编码")
    @TableField("container_code")
    private String containerCode;

    @ApiModelProperty("包装箱名称")
    @TableField("container_name")
    private String containerName;

    @ApiModelProperty("包装箱规格")
    @TableField("container_model")
    private String containerModel;

    @ApiModelProperty("单据日期")
    @TableField("package_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime packageDate;

    @ApiModelProperty("关联单据")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("关联单据")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("关联单据")
    @TableField("source_order_category_code")
    private String sourceOrderCategoryCode;

    @ApiModelProperty("关联单据")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;

    @ApiModelProperty("关联单据")
    @TableField("source_order_category_id")
    private String sourceOrderCategoryId;

    @ApiModelProperty("订货客户")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("订货客户")
    @TableField("order_customer_code")
    private String orderCustomerCode;

    @ApiModelProperty("订货客户")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("装箱数量（忽略单位）")
    @TableField(exist = false)
    private String quantity;

    @ApiModelProperty("发运状态YN")
    @TableField("ship_status")
    private String shipStatus;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<PsiPackageOrderDetail> detailList;
}
