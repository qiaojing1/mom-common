package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 盘亏出库单
 * @author DINGWEI
 * @since 2023-10-16
 */
@Getter
@Setter
@TableName("psi_inventory_stock_out_order")
@ApiModel(value = "PsiInventoryStockOutOrder对象", description = "盘亏出库单")
public class PsiInventoryStockOutOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;
    @TableField(exist = false)
    private String orderCategoryCode;
    @TableField(exist = false)
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @TableField(exist = false)
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("过账日期")
    @TableField("posting_time")
    private LocalDateTime postingTime;

    @ApiModelProperty("盘点单主键")
    @TableField("inventory_check_order_id")
    private String inventoryCheckOrderId;

    @ApiModelProperty("盘点单编码")
    @TableField("inventory_check_order_code")
    private String inventoryCheckOrderCode;

    @ApiModelProperty("盘点方案主键")
    @TableField("inventory_check_scheme_id")
    private String inventoryCheckSchemeId;

    @ApiModelProperty("盘点方案编码")
    @TableField("inventory_check_scheme_code")
    private String inventoryCheckSchemeCode;

    @ApiModelProperty("出库部门")
    @TableField("stock_out_org_id")
    private String stockOutOrgId;
    @TableField(exist = false)
    private String stockOutOrgCode;
    @TableField(exist = false)
    private String stockOutOrgName;

    @ApiModelProperty("出库人员")
    @TableField("stock_out_user_id")
    private String stockOutUserId;
    @TableField(exist = false)
    private String stockOutUserName;

    @ApiModelProperty("单据状态[0:创建,1:暂存,2:审核中,3:已审核,4:已过账]")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("真实过账时间")
    @TableField("real_posting_time")
    private LocalDateTime realPostingTime;

    @ApiModelProperty("过账人")
    @TableField("real_posting_user")
    private String realPostingUser;

    @ApiModelProperty("过账人名称")
    @TableField("real_posting_user_name")
    private String realPostingUserName;

    @ApiModelProperty("乐观锁版本号")
    @TableField("version")
    private Integer version;

    @TableField(exist = false)
    private List<PsiInventoryStockOutOrderDetail> details;

    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("盘亏出库单据主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("物料主键")
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;
    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialSpecific;

    @ApiModelProperty("库存单位")
    @TableField(exist = false)
    private String storeUnitId;
    @ApiModelProperty("库存单位编码")
    @TableField(exist = false)
    private String storeUnitCode;
    @ApiModelProperty("库存单位名称")
    @TableField(exist = false)
    private String storeUnitName;
    @ApiModelProperty("库存单位精度")
    @TableField(exist = false)
    private Integer storeUnitAccuracy;
    @ApiModelProperty("库存单位舍入类型")
    @TableField(exist = false)
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("盘点前数量")
    @TableField(exist = false)
    private BigDecimal beforeNumber;

    @ApiModelProperty("盘点数量")
    @TableField(exist = false)
    private BigDecimal number;

    @ApiModelProperty("盘亏数量")
    @TableField(exist = false)
    private BigDecimal stockOutNumber;

    @ApiModelProperty("批号")
    @TableField(exist = false)
    private String batchNumber;

    @ApiModelProperty("仓库")
    @TableField(exist = false)
    private String storeId;
    @TableField(exist = false)
    private String storeName;
    @ApiModelProperty("库区")
    @TableField(exist = false)
    private String areaId;
    @TableField(exist = false)
    private String areaName;
    @ApiModelProperty("库位")
    @TableField(exist = false)
    private String positionId;
    @TableField(exist = false)
    private String positionName;

    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String detailRemark;

    @ApiModelProperty("行状态[0:关闭;1:正常]")
    @TableField(exist = false)
    private Integer detailEnable;
    @TableField(exist = false)
    private String detailEnableName;
}
