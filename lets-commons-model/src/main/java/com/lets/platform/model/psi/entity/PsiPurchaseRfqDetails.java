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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 采购询价单明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-03-18
 */
@Getter
@Setter
@TableName("psi_purchase_rfq_details")
@ApiModel(value = "PsiPurchaseRfqDetails对象", description = "采购询价单明细")
public class PsiPurchaseRfqDetails extends BaseEntity {

    @ApiModelProperty("采购询价单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("采购单位ID")
    @TableField("purchase_unit")
    private String purchaseUnit;

    @ApiModelProperty("采购单位code")
    @TableField("purchase_unit_code")
    private String purchaseUnitCode;

    @ApiModelProperty("采购单位名称")
    @TableField("purchase_unit_name")
    private String purchaseUnitName;

    @ApiModelProperty("采购单位精度")
    @TableField("purchase_unit_accuracy")
    private Integer purchaseUnitAccuracy;

    @ApiModelProperty("采购单位舍入类型")
    @TableField("purchase_unit_round_off_type")
    private String purchaseUnitRoundOffType;

    @ApiModelProperty("询价数量")
    @TableField("number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal number;

    @ApiModelProperty("需求日期")
    @TableField("demand_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate demandDate;

    @ApiModelProperty("已报价供应商数")
    @TableField("quoted_suppliers_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal quotedSuppliersNumber;

    @ApiModelProperty("报价供应商占用数")
    @TableField("occupy_quoted_suppliers_number")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal occupyQuotedSuppliersNumber;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("源单id")
    @TableField("source_order_id")
    private String sourceOrderId;

    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @ApiModelProperty("源单类型")
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单明细id")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单明细行号")
    @TableField("source_detail_line_number")
    private Long sourceDetailLineNumber;

    @ApiModelProperty("关闭状态[0关闭1正常]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("关闭状态[0关闭1正常]")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭用户")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭用户名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("转采购占用数量")
    @TableField("occupy_number")
    private BigDecimal occupyNumber;
    @TableField(exist = false)
    private BigDecimal oldOccupyNumber;
    @ApiModelProperty("已转采购")
    @TableField("already_issue_number")
    private BigDecimal alreadyIssueNumber;
    @TableField(exist = false)
    private BigDecimal oldAlreadyIssueNumber;

    @ApiModelProperty("是否有技术要求 Y是 N否")
    @TableField("is_material_demand")
    private String isMaterialDemand;

    @ApiModelProperty("是否有技术要求 Y是 N否")
    @TableField("is_purchase_material_demand")
    private String isPurchaseMaterialDemand;

    @ApiModelProperty("项目编号")
    @TableField(exist = false)
    private String projectCode;
    @ApiModelProperty("合同编号")
    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("源单客户")
    @TableField(exist = false)
    private String sourceOrderCustomerId;

    @ApiModelProperty("源单客户")
    @TableField(exist = false)
    private String sourceOrderCustomerName;

    @ApiModelProperty("已转采购数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal purchasedNumber;

    @ApiModelProperty("未转采购数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal notPurchasedNumber;

    @ApiModelProperty("未报价供应商占用数")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal notQuotedSuppliersNumber;

    @ApiModelProperty("物料报价状态")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private String quotedStatusName;

    @ApiModelProperty("物料报价状态")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private String quotedStatus;

    @TableField(exist = false)
    @ApiModelProperty("特征属性")
    private List<PsiPurchaseRfqMaterialCharacteristic> materialCharacteristicList;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private PsiPurchaseRfqDetailDemand purchaseMaterialDemand;

    @TableField(exist = false)
    private BigDecimal canIssueNumber;

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

    public BigDecimal getQuotedSuppliersNumberNotNull() {
        return Objects.nonNull(this.getQuotedSuppliersNumber()) ? this.getQuotedSuppliersNumber() : BigDecimal.ZERO;
    }

    public BigDecimal getQuotedOccupySuppliersNumberNotNull() {
        return Objects.nonNull(this.getOccupyQuotedSuppliersNumber()) ? this.getOccupyQuotedSuppliersNumber() : BigDecimal.ZERO;
    }

    public BigDecimal getAlreadyIssueNumberNotNull() {
        return Objects.nonNull(this.getAlreadyIssueNumber()) ? this.getAlreadyIssueNumber() : BigDecimal.ZERO;
    }

    public BigDecimal getOccupyNumberNotNull() {
        return Objects.nonNull(this.getOccupyNumber()) ? this.getOccupyNumber() : BigDecimal.ZERO;
    }
}
