package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 发运单
 * </p>
 *
 * @author csy
 * @since 2024-07-05
 */
@Getter
@Setter
@TableName("psi_ship_order")
@ApiModel(value = "PsiShipOrder对象", description = "发运单")
public class PsiShipOrder extends BaseEntity {

    @ApiModelProperty("箱条码")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据日期")
    @TableField("ship_date")
    private LocalDateTime shipDate;

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

    @ApiModelProperty("车牌号")
    @TableField("car_code")
    private String carCode;

    @ApiModelProperty("装车重量")
    @TableField("weight")
    private String weight;

    @ApiModelProperty("重量单位")
    @TableField("weight_unit")
    private String weightUnit;
    @TableField("weight_unit_name")
    private String weightUnitName;
    @TableField("weight_unit_round_off_type")
    private String weightUnitRoundOffType;
    @TableField("weight_unit_accuracy")
    private Integer weightUnitAccuracy;

    @ApiModelProperty("物流公司")
    @TableField("logistics_company")
    private String logisticsCompany;

    @ApiModelProperty("物流单号")
    @TableField("logistics_code")
    private String logisticsCode;

    @ApiModelProperty("司机")
    @TableField("driver")
    private String driver;

    @ApiModelProperty("联系方式")
    @TableField("driver_phone")
    private String driverPhone;

    @ApiModelProperty("关联单据类别")
    @TableField("source_order_category_name")
    private String sourceOrderCategoryName;


    @ApiModelProperty("单据主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("箱条码")
    @TableField(exist = false)
    private String containerBarcode;

    @ApiModelProperty("容器")
    @TableField(exist = false)
    private String containerCode;

    @ApiModelProperty("容器")
    @TableField(exist = false)
    private String containerName;

    @ApiModelProperty("容器")
    @TableField(exist = false)
    private String containerModel;

    @ApiModelProperty("装箱数量")
    @TableField(exist = false)
    private BigDecimal quantity;

    @ApiModelProperty("装箱时间")
    @TableField(exist = false)
    private LocalDateTime packageDate;

    @ApiModelProperty("装箱人员")
    @TableField(exist = false)
    private String packageUser;

    @ApiModelProperty("装箱人员")
    @TableField(exist = false)
    private String packageUserName;

    @ApiModelProperty("容器主键")
    @TableField(exist = false)
    private String containerId;


    @TableField(exist = false)
    private List<PsiShipOrderContainer> containerList;
    @TableField(exist = false)
    private List<PsiShipOrderMaterial> materialList;
}
