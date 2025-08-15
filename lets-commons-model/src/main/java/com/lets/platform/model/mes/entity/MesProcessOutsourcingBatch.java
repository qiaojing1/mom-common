package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.mes.enums.processTransfer.TransferDirectionEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 工序委外单(集中)
 * @author DING WEI
 * @since 2025-02-10
 */
@Getter
@Setter
@TableName("mes_process_outsourcing_batch")
@ApiModel(value = "MesProcessOutsourcingBatch对象", description = "工序委外单(集中)")
public class MesProcessOutsourcingBatch extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型编码")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("委外供应商主键")
    @TableField("supplier_id")
    private String supplierId;
    @ApiModelProperty("委外供应商名称")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty("委外仓库主键")
    @TableField("outsourcing_store_id")
    private String outsourcingStoreId;
    @ApiModelProperty("委外仓库名称")
    @TableField("outsourcing_store_name")
    private String outsourcingStoreName;

    @ValidatedEnum(enumClass = TransferDirectionEnum.class, message = "ProcessSourcing.transferDirection.error", required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("转移方向[1：转入 2：转出]")
    @TableField("transfer_direction")
    private Integer transferDirection;
    @TableField(exist = false)
    private String transferDirectionName;

    @ApiModelProperty("采购部门主键")
    @TableField("purchase_org_id")
    private String purchaseOrgId;
    @ApiModelProperty("采购部门名称")
    @TableField("purchase_org_name")
    private String purchaseOrgName;
    @ApiModelProperty("采购人员主键")
    @TableField("purchase_user_id")
    private String purchaseUserId;
    @ApiModelProperty("采购人员名称")
    @TableField("purchase_user_name")
    private String purchaseUserName;

    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private List<MesProcessOutsourcingBatchDetail> details;

    @ApiModelProperty("单据主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;

    @ApiModelProperty("生产工单-主键")
    @TableField(exist = false)
    private String produceOrderId;
    @ApiModelProperty("生产工单-单号")
    @TableField(exist = false)
    private String produceOrderCode;
    @ApiModelProperty("生产工单-行号")
    @TableField(exist = false)
    private Long produceLineNumber;
    @ApiModelProperty("生产工单-明细主键")
    @TableField(exist = false)
    private String produceOrderDetailId;
    @ApiModelProperty("生产工单-生产单元主键")
    @TableField(exist = false)
    private String produceFactoryModeId;
    @ApiModelProperty("生产工单-生产单元名称")
    @TableField(exist = false)
    private String produceFactoryModeName;

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
    @ApiModelProperty("物料类型")
    @TableField(exist = false)
    private String materialType;
    @TableField(exist = false)
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    @TableField(exist = false)
    private String materialSpecific;

    @ApiModelProperty("源单类型[1：工序计划单]")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @ApiModelProperty("转出-源单主键(工序计划单主键)")
    @TableField(exist = false)
    private String outSourceOrderId;
    @ApiModelProperty("转出-源单编码(工序计划单编码)")
    @TableField(exist = false)
    private String outSourceOrderCode;
    @ApiModelProperty("转出-源单明细主键(工序计划单明细主键)")
    @TableField(exist = false)
    private String outSourceOrderDetailId;
    @ApiModelProperty("转出-源单行号(工序计划工序号)")
    @TableField(exist = false)
    private String outSourceLineNumber;
    @ApiModelProperty("转出-工序号")
    @TableField(exist = false)
    private String outProcessNo;
    @ApiModelProperty("转出-工序主键")
    @TableField(exist = false)
    private String outProcessId;
    @ApiModelProperty("转出-工序编码")
    @TableField(exist = false)
    private String outProcessCode;
    @ApiModelProperty("转出-工序名称")
    @TableField(exist = false)
    private String outProcessName;
    @ApiModelProperty("转出-工序类型")
    @TableField(exist = false)
    private String outProcessType;
    @TableField(exist = false)
    private String outProcessTypeName;
    @ApiModelProperty("转出-工序组主键")
    @TableField(exist = false)
    private String outProcessGroupId;
    @ApiModelProperty("转入-工序组名称")
    @TableField(exist = false)
    private String outProcessGroupName;
    @TableField(exist = false)
    private String turnoverBoxId;
    @TableField(exist = false)
    private String turnoverBoxCode;
    @TableField(exist = false)
    private Integer turnoverBoxNumber;
    @TableField(exist = false)
    private String turnoverBoxStoreId;
    @TableField(exist = false)
    private String turnoverBoxStoreName;

    @ApiModelProperty("转入源单-源单主键(工序计划单主键)")
    @TableField(exist = false)
    private String inSourceOrderId;
    @ApiModelProperty("转入源单-源单编码(工序计划单编码)")
    @TableField(exist = false)
    private String inSourceOrderCode;
    @ApiModelProperty("转入源单-源单明细主键(工序计划单明细主键)")
    @TableField(exist = false)
    private String inSourceOrderDetailId;
    @ApiModelProperty("转入源单-源单行号(工序计划工序号)")
    @TableField(exist = false)
    private String inSourceLineNumber;
    @ApiModelProperty("转入源单-工序号")
    @TableField(exist = false)
    private String inProcessNo;
    @ApiModelProperty("转入源单-工序主键")
    @TableField(exist = false)
    private String inProcessId;
    @ApiModelProperty("转入源单-工序编码")
    @TableField(exist = false)
    private String inProcessCode;
    @ApiModelProperty("转入源单-工序名称")
    @TableField(exist = false)
    private String inProcessName;
    @ApiModelProperty("转入源单-工序类型")
    @TableField(exist = false)
    private String inProcessType;
    @TableField(exist = false)
    private String inProcessTypeName;
    @ApiModelProperty("转入源单-工序组主键")
    @TableField(exist = false)
    private String inProcessGroupId;
    @ApiModelProperty("转入源单-工序组名称")
    @TableField(exist = false)
    private String inProcessGroupName;

    @ApiModelProperty("工序单位主键")
    @TableField(exist = false)
    private String processUnitId;
    @ApiModelProperty("工序单位")
    @TableField(exist = false)
    private String processUnitCode;
    @ApiModelProperty("工序单位名称")
    @TableField(exist = false)
    private String processUnitName;
    @ApiModelProperty("工序单位精度")
    @TableField(exist = false)
    private Integer processUnitAccuracy;
    @ApiModelProperty("工序单位舍入方式")
    @TableField(exist = false)
    private Integer processUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转移数量")
    @TableField(exist = false)
    private BigDecimal transferNumber;

    @ApiModelProperty("采购计价单位主键")
    @TableField(exist = false)
    private String purchasePricingUnitId;
    @ApiModelProperty("采购计价单位编码")
    @TableField(exist = false)
    private String purchasePricingUnitCode;
    @ApiModelProperty("采购计价单位名称")
    @TableField(exist = false)
    private String purchasePricingUnitName;
    @ApiModelProperty("采购计价单位精度")
    @TableField(exist = false)
    private Integer purchasePricingUnitAccuracy;
    @ApiModelProperty("采购计价单位舍入方式")
    @TableField(exist = false)
    private Integer purchasePricingUnitRoundOffType;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("转移计价数量")
    @TableField(exist = false)
    private BigDecimal transferPricingNumber;

    @ApiModelProperty("是否连续委外[0：否，1：是]")
    @TableField(exist = false)
    private Integer series;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;
    @ApiModelProperty("源销售订单单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @ApiModelProperty("分组标识")
    @TableField(exist = false)
    private String groupSign;
    @ApiModelProperty("是否需要变红[YN]")
    @TableField(exist = false)
    private String firstRedProcess;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("委外单价")
    @TableField(exist = false)
    private BigDecimal outsourcePrice;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    @TableField(exist = false)
    private BigDecimal richNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格计价数量")
    @TableField(exist = false)
    private BigDecimal richPricingNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工废数量")
    @TableField(exist = false)
    private BigDecimal processScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("料废数量")
    @TableField(exist = false)
    private BigDecimal materialScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步接收数量")
    @TableField(exist = false)
    private BigDecimal giveInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    @TableField(exist = false)
    private BigDecimal repairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    @TableField(exist = false)
    private BigDecimal poorNumber;
    @ApiModelProperty("委外检验类型[1是0否]")
    @TableField(exist = false)
    private Integer outsourcingInspectType;

    @ApiModelProperty("委外发出单主键")
    @TableField(exist = false)
    private String outsourcingOutId;
    @ApiModelProperty("委外发出单编码")
    @TableField(exist = false)
    private String outsourcingOutCode;
    @ApiModelProperty("委外发出单编码")
    @TableField(exist = false)
    private String outsourcingOutSourceDetailId;
    @ApiModelProperty("委外发出单源单类型")
    @TableField(exist = false)
    private String outsourcingOutTypeName;
    @ApiModelProperty("委外发出单源单行号")
    @TableField(exist = false)
    private String outsourcingOutLineNumber;

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

    @ApiModelProperty("合同编号")
    @TableField(exist = false)
    private String contractCode;
}
