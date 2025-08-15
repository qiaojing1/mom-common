package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 生产领料单
 * @author DING WEI
 * @since 2023-12-13
 */
@Getter
@Setter
@TableName("mes_produce_picking")
@ApiModel(value = "MesProducePicking对象", description = "生产领料单")
public class MesProducePicking extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;

    @TableField(exist = false)
    private String orderCategoryCode;

    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @TableField("business_name")
    private String businessName;

    @JsonFormat(pattern = "yyyy-MM-dd")
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
    @TableField("store_org_name")
    private String storeOrgName;

    @ApiModelProperty("仓库人员")
    @TableField("store_user_id")
    private String storeUserId;
    @TableField("store_user_name")
    private String storeUserName;

    @ApiModelProperty("是否成套领料(YN)")
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

    /**
     * ++++++++++++++++++++++++++++++++++++++明细字段++++++++++++++++++++++++++++++++++++++
     */

    @NotEmpty(message = "MaterialDetails.NotEmpty", groups = {Save.class, Update.class})
    @ApiModelProperty("物料明细")
    @TableField(exist = false)
    private List<MesProducePickingDetail> details;

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
    @ApiModelProperty("关联单据明细主键")
    @TableField(exist = false)
    private String sourceDetailId;
    @ApiModelProperty("关联单据id主键")
    @TableField(exist = false)
    private String sourceOrderId;
    @ApiModelProperty("源单据编码")
    @TableField(exist = false)
    private String sourceOrderCode;
    /**
     * @see com.lets.platform.model.psi.enums.StockSourceEnum
     */
    @ApiModelProperty("源单类型[203:生产用料清单,204:生产领料申请单]")
    @TableField(exist = false)
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产数量")
    @TableField(exist = false)
    private BigDecimal produceNumber;

    @ApiModelProperty("生产工单物料主键")
    @TableField(exist = false)
    private String produceMaterialId;
    @ApiModelProperty("生产工单物料编码")
    @TableField(exist = false)
    private String produceMaterialCode;
    @ApiModelProperty("生产工单物料名称")
    @TableField(exist = false)
    private String produceMaterialName;
    @ApiModelProperty("生产工单-物料规格")
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
    @TableField(exist = false)
    private String subMaterialSpecific;
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
    @TableField(exist = false)
    private LocalDateTime batchStockInDate;

    @ApiModelProperty("(库存)子项单位")
    @TableField(exist = false)
    private String storeUnitId;
    @ApiModelProperty("(库存)子项单位编码")
    @TableField(exist = false)
    private String storeUnitCode;
    @ApiModelProperty("(库存)子项单位名称")
    @TableField(exist = false)
    private String storeUnitName;
    @ApiModelProperty("(库存)子项单位精度")
    @TableField(exist = false)
    private Integer storeUnitAccuracy;
    @ApiModelProperty("(库存)子项单位舍入方式")
    @TableField(exist = false)
    private Integer storeUnitRoundOffType;

    @ApiModelProperty("领用套数")
    @TableField(exist = false)
    private BigDecimal useSetNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("领用数量")
    @TableField(exist = false)
    private BigDecimal useNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("领用基本数量")
    @TableField(exist = false)
    private BigDecimal useNumberBasic;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可领用数量")
    @TableField(exist = false)
    private BigDecimal canUseNumber;

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

    @ApiModelProperty("保质期到期日")
    @TableField(exist = false)
    private LocalDateTime periodDate;

    @ApiModelProperty("用量类型[1变动2固定]")
    @TableField(exist = false)
    private String dosageType;
    @ApiModelProperty("分子用量")
    @TableField(exist = false)
    private BigDecimal numeratorDosage;
    @ApiModelProperty("分母用量")
    @TableField(exist = false)
    private BigDecimal denominatorDosage;
    @ApiModelProperty("固定损耗")
    @TableField(exist = false)
    private BigDecimal fixedLoss;
    @ApiModelProperty("变动损耗率(%)")
    @TableField(exist = false)
    private BigDecimal changeLossRate;
    @ApiModelProperty("该明细关联的所有退料单数量")
    @TableField(exist = false)
    private BigDecimal returnRelationNumber;
    @ApiModelProperty("可退料数量(can_return_number + return_relation_number = use_number)")
    @TableField(exist = false)
    private BigDecimal canReturnNumber;
    @ApiModelProperty("是否允许人工录入")
    @TableField(exist = false)
    private String allowManInput;

    @ApiModelProperty("计划跟踪号")
    @TableField(exist = false)
    private String trackNo;
    @ApiModelProperty("源销售订单订货客户id")
    @TableField(exist = false)
    private String sourceOrderCustomerId;
    @ApiModelProperty("源销售订单订货客户名称")
    @TableField(exist = false)
    private String sourceOrderCustomerName;
    @ApiModelProperty("生产单元主键")
    @TableField(exist = false)
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String factoryModeName;
    @TableField(exist = false)
    private String isMateialDemand;
    /**
     * 提供给下发成生产退料单使用
     */
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private List<MesProducePicking> selfDetails;
    @TableField(exist = false)
    private String projectCode;
    @TableField(exist = false)
    private String contractCode;

    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("备注1")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("备注2")
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

    @TableField(exist = false)
    private Boolean reservationCheck;

    @ApiModelProperty("生产工单-供应商")
    @TableField("produce_supplier_id")
    private String produceSupplierId;
    @TableField("produce_supplier_name")
    private String produceSupplierName;

    public boolean isReservationCheck() {
        if (Objects.isNull(reservationCheck)) {
            reservationCheck = true;
        }
        return reservationCheck;
    }

    public BigDecimal useNumberNN() {
        if (Objects.isNull(useNumber)) {
            return BigDecimal.ZERO;
        } else {
            return useNumber;
        }
    }

    public BigDecimal returnRelationNumberNN() {
        if (Objects.isNull(returnRelationNumber)) {
            return BigDecimal.ZERO;
        } else {
            return returnRelationNumber;
        }
    }
}
