package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 远程监造
 * </p>
 *
 * @author csy
 * @since 2024-10-21
 */
@Getter
@Setter
@TableName("collection_remote_supervision")
@ApiModel(value = "CollectionRemoteSupervision对象", description = "远程监造")
public class CollectionRemoteSupervision extends BaseEntity {

    @ApiModelProperty("码的id")
    @TableField("qr_id")
    private String qrId;

    @ApiModelProperty("工单")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("工单")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("产品编码")
    @TableField("product_id")
    private String productId;

    @ApiModelProperty("产品编码")
    @TableField("product_code")
    private String productCode;

    @ApiModelProperty("有效期")
    @TableField("expiration")
    private LocalDateTime expiration;

    @ApiModelProperty("开启状态")
    @TableField("status")
    private String status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("是否长期有效")
    @TableField("long_term")
    private String longTerm;

    @ApiModelProperty("是否限制手机号")
    @TableField("user_limitation")
    private String userLimitation;

    @ApiModelProperty("手机号")
    @TableField("users")
    private String users;

    @TableField(exist = false)
    private String name;

    @TableField("valve_type_id")
    private String valveTypeId;
    @TableField("valve_type_name")
    private String valveTypeName;
    @TableField("lrp_no")
    private String lrpNo;
    @TableField("sale_order_code")
    private String saleOrderCode;
    @TableField("line_number")
    private String  lineNumber;
    @TableField("list_no")
    private String listNo;
    @TableField("draw_no")
    private String drawNo;
    @TableField("caliber")
    private String caliber;
    @TableField("pressure")
    private String pressure;
    @TableField("valve_material")
    private String valveMaterial;
    @TableField("model")
    private String model;
}
