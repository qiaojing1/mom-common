package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 检验申请单物料明细
 * </p>
 *
 * @author FZY
 * @since 2024-01-18
 */
@Getter
@Setter
@TableName("mes_inspection_application_order_detail")
@ApiModel(value = "MesInspectionApplicationOrderDetail对象", description = "检验申请单物料明细")
public class MesInspectionApplicationOrderDetail extends BaseEntity {

    @ApiModelProperty("检验申请单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Long lineNumber;

    @ApiModelProperty("物料ID")
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

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    private String materialCharacteristicNames;

    @ApiModelProperty("单位ID")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区ID")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("库区名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位ID")
    @TableField("position_id")
    private String positionId;

    @ApiModelProperty("库位名称")
    @TableField("position_name")
    private String positionName;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("关联单据数量")
    @TableField("relation_quantity")
    private BigDecimal relationQuantity;

    @ApiModelProperty("检验数量")
    @TableField("inspection_quantity")
    private BigDecimal inspectionQuantity;

    @ApiModelProperty("合格数量")
    @TableField("qualified_quantity")
    private BigDecimal qualifiedQuantity;

    @ApiModelProperty("不合格数量")
    @TableField("unqualified_quantity")
    private BigDecimal unqualifiedQuantity;

    @ApiModelProperty("报废数量")
    @TableField("scrap_quantity")
    private BigDecimal scrapQuantity;

    @ApiModelProperty("返工数量")
    @TableField("rework_quantity")
    private BigDecimal reworkQuantity;

    @ApiModelProperty("不良数量")
    @TableField("defect_quantity")
    private BigDecimal defectQuantity;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("源单类型")
    @TableField("source_order_type")
    private String sourceOrderType;

    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单ID")
    @TableField("source_id")
    private String sourceId;

    @ApiModelProperty("源单单号")
    @TableField("source_code")
    private String sourceCode;

    @ApiModelProperty("源单明细ID")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("源单行号")
    @TableField("source_line_number")
    private Long sourceLineNumber;

    @ApiModelProperty("备注")
    @TableField("detail_remark")
    private String detailRemark;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @TableField(exist = false)
    private String contractCode;

    @ApiModelProperty("源销售订单订货客户id")
    @TableField("source_order_customer_id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    @TableField("source_order_customer_name")
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String isMateialDemand;

    @ApiModelProperty("处理状态")
    @TableField("handle_status")
    private String handleStatus;

    @TableField(exist = false)
    private String handleStatusName;

    @ApiModelProperty("检验结果")
    @TableField("result")
    private String result;

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
