/*
 * csy
 */

package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 质量证明书
 * </p>
 *
 * @author csy
 * @since 2024-11-26
 */
@Getter
@Setter
@TableName("collection_quality_certification")
@ApiModel(value = "CollectionQualityCertification对象", description = "质量证明书")
public class CollectionQualityCertification extends BaseEntity {

    @ApiModelProperty("证书编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别id")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("证书日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("工单")
    @TableField("detect_order_id")
    private String detectOrderId;

    @ApiModelProperty("工单")
    @TableField("detect_order_code")
    private String detectOrderCode;

    @ApiModelProperty("产品编号")
    @TableField("product_code")
    private String productCode;

    @ApiModelProperty("序列号")
    @TableField("product_code_range")
    private String productCodeRange;

    @ApiModelProperty("生产令号")
    @TableField("lrp_no")
    private String lrpNo;

    @ApiModelProperty("数量")
    @TableField("number")
    private Integer number;

    @ApiModelProperty("订单编号")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private String lineNumber;

    @ApiModelProperty("图号")
    @TableField("draw_no")
    private String drawNo;

    @ApiModelProperty("阀门类型")
    @TableField("valve_type_id")
    private String valveTypeId;
    @TableField(exist = false)
    private String valveTypeName;

    @ApiModelProperty("型号")
    @TableField("model")
    private String model;

    @ApiModelProperty("口径单位")
    @TableField("caliber_unit")
    private String caliberUnit;

    @ApiModelProperty("口径id")
    @TableField("caliber_id")
    private String caliberId;

    @ApiModelProperty("口径值")
    @TableField("caliber_value")
    private String caliberValue;
    @TableField(exist = false)
    private String caliber;
    @TableField(exist = false)
    private String caliberFractionValue;

    @ApiModelProperty("压力单位")
    @TableField("pressure_unit")
    private String pressureUnit;
    @TableField(exist = false)
    private String pressureUnitId;

    @ApiModelProperty("压力id")
    @TableField("pressure_id")
    private String pressureId;

    @ApiModelProperty("压力值")
    @TableField("pressure_value")
    private String pressureValue;
    @TableField(exist = false)
    private String pressure;

    @ApiModelProperty("阀门材质")
    @TableField("valve_material")
    private String valveMaterial;
    @TableField(exist = false)
    private String valveMaterialName;

    @ApiModelProperty("工况")
    @TableField("work_condition")
    private String workCondition;
    @TableField(exist = false)
    private String workConditionName;

    @ApiModelProperty("压力标准")
    @TableField("pressure_standard")
    private String pressureStandard;
    @TableField(exist = false)
    private String pressureStandardName;

    @ApiModelProperty("试验类型")
    @TableField("test_type")
    private String testType;
    @TableField(exist = false)
    private String testTypeName;

    @ApiModelProperty("试验标准")
    @TableField("test_standard")
    private String testStandard;
    @TableField(exist = false)
    private String testStandardName;

    @ApiModelProperty("常规/低温/洁净 泄漏等级")
    @TableField("routine_leakage_level")
    private String routineLeakageLevel;
    @TableField(exist = false)
    private String routineLeakageLevelName;

    @ApiModelProperty("是否包含逸散性泄漏试验")
    @TableField("is_escape")
    private String isEscape;

    @ApiModelProperty("逸散性泄漏试验试验标准")
    @TableField("escape_test_standard")
    private String escapeTestStandard;
    @TableField(exist = false)
    private String escapeTestStandardName;

    @ApiModelProperty("逸散性密封试验密封方式")
    @TableField("escape_seal_type")
    private String escapeSealType;
    @TableField(exist = false)
    private String escapeSealTypeName;

    @ApiModelProperty("逸散性密封试验泄漏等级")
    @TableField("escape_leakage_level")
    private String escapeLeakageLevel;
    @TableField(exist = false)
    private String escapeLeakageLevelName;

    @ApiModelProperty("是否包含动作试验")
    @TableField("is_movement")
    private String isMovement;

    @ApiModelProperty("动作试验试验标准")
    @TableField("movement_test_standard")
    private String movementTestStandard;
    @TableField(exist = false)
    private String movementTestStandardName;

    @ApiModelProperty("密封方式")
    @TableField("seal_method")
    private String sealMethod;
    @TableField(exist = false)
    private String sealMethodName;

    @ApiModelProperty("阀杆直径")
    @TableField("stem_diameter")
    private BigDecimal stemDiameter;

    @ApiModelProperty("垫片外径")
    @TableField("gasket_outer_diam")
    private BigDecimal gasketOuterDiam;

    @ApiModelProperty("额定容量")
    @TableField("nameplate_capacity")
    private BigDecimal nameplateCapacity;

    @ApiModelProperty("设计扭矩")
    @TableField("torque")
    private BigDecimal torque;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("清单号")
    @TableField("list_no")
    private String listNo;

    @ApiModelProperty("执行标准")
    @TableField("execute_standard")
    private String executeStandard;
    @TableField(exist = false)
    private String executeStandardName;

    @ApiModelProperty("有载扭矩")
    @TableField("loaded_torque")
    private BigDecimal loadedTorque;

    @ApiModelProperty("空载扭矩")
    @TableField("unloaded_torque")
    private BigDecimal unloadedTorque;

    @ApiModelProperty("最大压差")
    @TableField("max_pressure_diff")
    private BigDecimal maxPressureDiff;

    @ApiModelProperty("客户名称")
    @TableField("customer_name")
    private String customerName;

    @ApiModelProperty("工序id")
    @TableField("process")
    private String process;

    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("设计温度")
    @TableField("design_temperature")
    private String designTemperature;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @TableField("report_id")
    private String reportId;
    @TableField("report_code")
    private String reportCode;

    @ApiModelProperty("阀门名称")
    @TableField("valve_name")
    private String valveName;
    @TableField(exist = false)
    private String productName;

    @ApiModelProperty("客户类型")
    @TableField("customer_model")
    private String customerModel;

    @ApiModelProperty("阀杆材质")
    @TableField("stem_material")
    private String stemMaterial;

    @ApiModelProperty("阀芯材质")
    @TableField("spool_material")
    private String spoolMaterial;

    @ApiModelProperty("阀座材质")
    @TableField("seat_material")
    private String seatMaterial;

    @ApiModelProperty("连接标准")
    @TableField("link_standard")
    private String linkStandard;

    @ApiModelProperty("检验单id")
    @TableField("inspection_order_id")
    private String inspectionOrderId;

    @ApiModelProperty("检验单明细id")
    @TableField("inspection_order_detail_id")
    private String inspectionOrderDetailId;

    @TableField(exist = false)
    private List<CollectionQualityCertificationProject> projectList;
    @TableField(exist = false)
    private List<CollectionQualityCertificationPart> partList;
    @TableField(exist = false)
    private List<CollectionQualityCertificationProduct> productList;
    @TableField(exist = false)
    private Map<String,Object> saleInfo;
}
