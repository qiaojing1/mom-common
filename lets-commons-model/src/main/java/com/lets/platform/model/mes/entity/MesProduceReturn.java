package com.lets.platform.model.mes.entity;

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
 * 生产退料单
 * @author DING WEI
 * @since 2023-12-25
 */
@Getter
@Setter
@TableName("mes_produce_return")
@ApiModel(value = "MesProduceReturn对象", description = "生产退料单")
public class MesProduceReturn extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;

    @ApiModelProperty("过账日期")
    @TableField("posting_time")
    private LocalDateTime postingTime;

    @ApiModelProperty("仓库部门")
    @TableField("store_org_id")
    private String storeOrgId;
    @ApiModelProperty("仓库部门名称")
    @TableField("store_org_name")
    private String storeOrgName;
    @ApiModelProperty("仓库人员")
    @TableField("store_user_id")
    private String storeUserId;
    @ApiModelProperty("仓库人员名称")
    @TableField("store_user_name")
    private String storeUserName;

    @ApiModelProperty("是否成套退料[YN]")
    @TableField("is_set")
    private String isSet;
    @TableField(exist = false)
    private String isSetName;

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

    @TableField(exist = false)
    private List<MesProduceReturnDetail> details;

    @ApiModelProperty("明细主键")
    @TableField(exist = false)
    private String detailId;
    @ApiModelProperty("单据主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("生产工单主键")
    @TableField(exist = false)
    private String produceOrderId;
    @ApiModelProperty("生产工单单号")
    @TableField(exist = false)
    private String produceOrderCode;
    @ApiModelProperty("生产工单行号")
    @TableField(exist = false)
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-明细主键")
    @TableField(exist = false)
    private String produceDetailId;

    @ApiModelProperty("关联单据主键")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("关联单据编码")
    @TableField(exist = false)
    private String sourceOrderCode;
    @ApiModelProperty("关联单据明细主键")
    @TableField(exist = false)
    private String sourceDetailId;
    @ApiModelProperty("关联单据行号")
    @TableField(exist = false)
    private Long sourceLineNumber;

    @ApiModelProperty("生产工单物料主键")
    @TableField(exist = false)
    private String produceMaterialId;
    @ApiModelProperty("生产工单物料编码")
    @TableField(exist = false)
    private String produceMaterialCode;
    @ApiModelProperty("生产工单物料名称")
    @TableField(exist = false)
    private String produceMaterialName;
    @ApiModelProperty("生产工单-物料规格型号")
    @TableField(exist = false)
    private String produceMaterialSpecs;
    @ApiModelProperty("生产工单-物料特征属性")
    @TableField(exist = false)
    private String produceMaterialSpecific;
    @ApiModelProperty("生产工单-生产单位主键")
    @TableField(exist = false)
    private String produceProduceUnitId;
    @ApiModelProperty("生产工单-生产单位名称")
    @TableField(exist = false)
    private String produceProduceUnitName;
    @ApiModelProperty("生产工单-生产单位精度")
    @TableField(exist = false)
    private Integer produceProduceUnitAccuracy;
    @ApiModelProperty("生产工单-生产单位舍入方式")
    @TableField(exist = false)
    private Integer produceProduceUnitRoundOffType;

    @ApiModelProperty("子项物料主键")
    @TableField(exist = false)
    private String subMaterialId;
    @ApiModelProperty("子项物料编码")
    @TableField(exist = false)
    private String subMaterialCode;
    @ApiModelProperty("子项物料名称")
    @TableField(exist = false)
    private String subMaterialName;
    @ApiModelProperty("子项物料规格型号")
    @TableField(exist = false)
    private String subMaterialSpecs;
    @ApiModelProperty("子项物料特征属性")
    @TableField(exist = false)
    private String subMaterialSpecific;
    @ApiModelProperty("子项物料特征属性名称")
    @TableField(exist = false)
    private String subMaterialSpecificName;

    @ApiModelProperty("仓库主键")
    @TableField(exist = false)
    private String storeId;
    @ApiModelProperty("仓库名称")
    @TableField(exist = false)
    private String storeName;
    @ApiModelProperty("库区主键")
    @TableField(exist = false)
    private String areaId;
    @ApiModelProperty("库区名称")
    @TableField(exist = false)
    private String areaName;
    @ApiModelProperty("库位主键")
    @TableField(exist = false)
    private String positionId;
    @ApiModelProperty("库位名称")
    @TableField(exist = false)
    private String positionName;

    @ApiModelProperty("批号")
    @TableField(exist = false)
    private String batchNumber;
    @ApiModelProperty("批号入库日期")
    @TableField(exist = false)
    private LocalDateTime batchStockInDate;

    @ApiModelProperty("(库存)子项单位")
    @TableField(exist = false)
    private String storeUnitId;
    @ApiModelProperty("(库存)子项单位名称")
    @TableField(exist = false)
    private String storeUnitName;
    @ApiModelProperty("(库存)子项单位精度")
    @TableField(exist = false)
    private Integer storeUnitAccuracy;
    @ApiModelProperty("(库存)子项单位舍入方式")
    @TableField(exist = false)
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("退料套数")
    @TableField(exist = false)
    private BigDecimal returnSetNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("退料数量")
    @TableField(exist = false)
    private BigDecimal returnNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可退货数量")
    @TableField(exist = false)
    private BigDecimal canReturnNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("退料基本数量")
    @TableField(exist = false)
    private BigDecimal returnNumberBasic;
    @ApiModelProperty("基本单位")
    @TableField(exist = false)
    private String basicUnitId;
    @ApiModelProperty("基本单位编码")
    @TableField(exist = false)
    private String basicUnitCode;
    @ApiModelProperty("基本单位名称")
    @TableField(exist = false)
    private String basicUnitName;
    @ApiModelProperty("基本单位精度")
    @TableField(exist = false)
    private Integer basicUnitAccuracy;
    @ApiModelProperty("基本单位舍入方式")
    @TableField(exist = false)
    private Integer basicUnitRoundOffType;

    @ApiModelProperty("生产日期")
    @TableField(exist = false)
    private LocalDateTime productDate;
    @TableField(exist = false)
    private String productDateFormat;

    @ApiModelProperty("保质期到期日")
    @TableField(exist = false)
    private LocalDateTime periodDate;
    @TableField(exist = false)
    private String periodDateFormat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产数量")
    @TableField(exist = false)
    private BigDecimal produceNumber;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;
    @TableField(exist = false)
    private String isMateialDemand;

    @ApiModelProperty("生产工单-供应商")
    @TableField("produce_supplier_id")
    private String produceSupplierId;
    @TableField("produce_supplier_name")
    private String produceSupplierName;
    @ApiModelProperty("扩展字段1")
    @TableField(exist = false)
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField(exist = false)
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField(exist = false)
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField(exist = false)
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField(exist = false)
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField(exist = false)
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField(exist = false)
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField(exist = false)
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField(exist = false)
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField(exist = false)
    private String extField10;

}
