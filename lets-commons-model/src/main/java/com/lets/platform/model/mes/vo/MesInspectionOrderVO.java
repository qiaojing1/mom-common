package com.lets.platform.model.mes.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 销售订单
 * </p>
 *
 * @author FZY
 * @since 2023-08-09
 */
@Getter
@Setter
@ApiModel(value = "MesInspectionApplicationOrder分页查询对象", description = "检验申请单分页查询对象")
public class MesInspectionOrderVO {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("明细ID")
    private String detailId;

    @ApiModelProperty("明细编码")
    private String detailCode;

    @ApiModelProperty("订单ID")
    private String orderId;

    @ApiModelProperty("单据编号")
    private String code;

    @ApiModelProperty("单据类别ID")
    private String orderCategoryId;

    @ApiModelProperty("单据类别名称")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    private String businessCode;

    @ApiModelProperty("业务类型名称")
    private String businessName;

    @ApiModelProperty("申请日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("检验部门id")
    private String inspectionOrgId;

    @ApiModelProperty("检验部门名称")
    private String inspectionOrgName;

    @ApiModelProperty("检验员id")
    private String inspectionUserId;

    @ApiModelProperty("检验员名称")
    private String inspectionUserName;

    @ApiModelProperty("优先级")
    private String inspectPriority;

    @ApiModelProperty("优先级名称")
    private String inspectPriorityName;

    @ApiModelProperty("数据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    private Integer status;

    private String statusName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("审核时间")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人员")
    private String auditUser;

    @ApiModelProperty("审核人员名称")
    private String auditUserName;

    @ApiModelProperty("行号")
    private Long lineNumber;

    @ApiModelProperty("物料编码ID")
    private String materialId;

    @ApiModelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料编码名称")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    private String materialCharacteristicNames;

    @ApiModelProperty("单位ID")
    private String unitId;

    @ApiModelProperty("单位编码")
    private String unitCode;

    @ApiModelProperty("单位精度")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    private String unitRoundOffType;

    @ApiModelProperty("单位名称")
    private String unitName;

    @ApiModelProperty("检验数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal inspectionQuantity;

    @ApiModelProperty("合格数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal qualifiedQuantity;

    @ApiModelProperty("不合格数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal unqualifiedQuantity;

    @ApiModelProperty("样本不合格数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal samplesUnqualifiedQuantity;

    @ApiModelProperty("仓库ID")
    private String storeId;

    @ApiModelProperty("仓库名称")
    private String storeName;

    @ApiModelProperty("库区ID")
    private String areaId;

    @ApiModelProperty("库区名称")
    private String areaName;

    @ApiModelProperty("库位ID")
    private String positionId;

    @ApiModelProperty("库位名称")
    private String positionName;

    @ApiModelProperty("批号")
    private String batchNumber;

    @ApiModelProperty("检验结果")
    private String result;

    @ApiModelProperty("检验结果")
    private String resultName;

    @ApiModelProperty("抽样方案ID")
    private String samplingPlanId;

    @ApiModelProperty("抽样方案名称")
    private String samplingPlanName;

    @ApiModelProperty("供应商ID")
    private String supplySupplierId;

    @ApiModelProperty("供应商名称")
    private String supplySupplierName;

    @ApiModelProperty("生产单元ID")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    private String factoryModeName;

    @ApiModelProperty("工序ID")
    private String processId;

    @ApiModelProperty("工序编码")
    private String processCode;

    @ApiModelProperty("工序名称")
    private String processName;

    // 按照【processCode】processName拼起来
    @ApiModelProperty("工序(供pda使用)")
    private String process;

    @ApiModelProperty("是否首检")
    private String firstInspection;

    @ApiModelProperty("源单类型")
    private String sourceOrderType;

    @ApiModelProperty("源单类型名称")
    private String sourceOrderTypeName;

    @ApiModelProperty("源单据类别ID")
    private String sourceOrderCategoryId;

    @ApiModelProperty("源单据类别名称")
    private String sourceOrderCategoryName;

    @ApiModelProperty("源单ID")
    private String sourceId;

    @ApiModelProperty("源单单号")
    private String sourceCode;

    @ApiModelProperty("源单明细ID")
    private String sourceDetailId;

    @ApiModelProperty("源单行号")
    private Long sourceLineNumber;

    @ApiModelProperty("物料明细备注")
    private String detailRemark;

    @ApiModelProperty("租户id")
    private String tenancyId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("创建人姓名")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人")
    private String updateUser;

    @ApiModelProperty("更新人姓名")
    private String updateUserName;

    @ApiModelProperty("检验状态")
    private Integer inspectionStatus;

    @ApiModelProperty("检验状态")
    private String inspectionStatusName;
    /**
     * 以下为质量报表需要使用的字段
     */
    @ApiModelProperty("合格率")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal qualificationRate;

    @ApiModelProperty("接收数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal receiveQuantity;

    @ApiModelProperty("判退数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal rejectedQuantity;

    @ApiModelProperty("让步接收数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal concessionAcceptanceQuantity;

    @ApiModelProperty("报废数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal scrapQuantity;

    @ApiModelProperty("样本破坏数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal samplesDestroyedQuantity;

    @ApiModelProperty("返工数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal reworkQuantity;

    @ApiModelProperty("返修数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal repairQuantity;

    @ApiModelProperty("不良数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal defectQuantity;

    @ApiModelProperty("客户id")
    private String customerId;

    @ApiModelProperty("客户名称")
    private String customerName;

    @ApiModelProperty("客户编码")
    private String customerCode;

    @ApiModelProperty("供应商编码")
    private String supplySupplierCode;

    @ApiModelProperty("计划跟踪号")
    private String trackNo;

    @ApiModelProperty("客户编码")
    private String sourceOrderCustomerId;

    @ApiModelProperty("客户名称")
    private String sourceOrderCustomerName;

    private String projectCode;
    private String contractCode;

    @ApiModelProperty("仓库库区库位拼接起来的仓库名称")
    private String storeLinkedName;

    // 分组后拼接起来的表体id
    @ApiModelProperty(hidden = true)
    private String detailIdList;
    @ApiModelProperty("是否有技术要求")
    @TableField(exist = false)
    private String isMateialDemand;
    @TableField(exist = false)
    private String sourceOrderMaterialCode;
    @ApiModelProperty("采购订单")
    @TableField(exist = false)
    private String purchaseOrderId;

    @ApiModelProperty("采购订单")
    @TableField(exist = false)
    private String purchaseOrderCode;

    @ApiModelProperty("采购订单行号")
    @TableField(exist = false)
    private Long purchaseOrderLineNumber;

    @ApiModelProperty("生产工单 编码-行号")
    @TableField(exist = false)
    private String productOrderCodeAndLineNumber;

    @ApiModelProperty("是否存在采购要求")
    private String isPurchaseMaterialDemand;

    /**
     * 物料扩展属性
     */
    @TableField(exist = false)
    @ApiModelProperty("扩展规格备注一")
    private String remark1;
    @ApiModelProperty("扩展规格备注二")
    @TableField(exist = false)
    private String remark2;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFl32;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlName12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlName13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlName14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlName15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlName16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlName17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlName18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlName19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlName20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlName21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlName22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlName23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlName24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlName25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlName26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlName27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlName28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlName29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlName30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlName31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlName32;

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
