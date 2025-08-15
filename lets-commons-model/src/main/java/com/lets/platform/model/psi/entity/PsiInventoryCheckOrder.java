package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 盘点单
 * </p>
 *
 * @author FZY
 * @since 2023-10-09
 */
@Getter
@Setter
@TableName("psi_inventory_check_order")
@ApiModel(value = "PsiInventoryCheckOrder对象", description = "盘点单")
public class PsiInventoryCheckOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("账存日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("盘点方案ID")
    @TableField("scheme_id")
    private String schemeId;

    @ApiModelProperty("盘点类型[0:全盘;1:动盘]")
    @TableField("scheme_type")
    private Integer schemeType;

    @ApiModelProperty("盘点类型名称")
    @TableField(exist = false)
    private String schemeTypeName;

    @ApiModelProperty("盘点方案编码")
    @TableField("scheme_code")
    private String schemeCode;

    @ApiModelProperty("盘点方案名称")
    @TableField("scheme_name")
    private String schemeName;

    @ApiModelProperty("实盘数默认值[0:0;1:账面库存数量]")
    @TableField("default_quantity_type")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer defaultQuantityType;

    @ApiModelProperty("不考虑有特征属性物料[0:否;1:是]")
    @TableField("none_specific_material")
    private Integer noneSpecificMaterial;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态名称")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("盘点状态[0:未开始;1:盘点中;2:已结束]")
    @TableField("check_status")
    private Integer checkStatus;

    @ApiModelProperty("盘点状态名称")
    @TableField(exist = false)
    private String checkStatusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("物料明细")
    @TableField(exist = false)
    private List<PsiInventoryCheckOrderMaterial> inventoryCheckOrderMaterialList;
}
