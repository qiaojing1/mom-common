package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.lets.platform.model.uc.entity.SysUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 试压工单
 * </p>
 *
 * @author csy
 * @since 2024-02-20
 */
@Getter
@Setter
@TableName("collection_detect_order")
@ApiModel(value = "CollectionDetectOrder对象", description = "试压工单")
public class CollectionDetectOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @TableField(exist = false)
    private String oldCode;

    @ApiModelProperty("单据类别id")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别id")
    @TableField("order_category_name")
    private String orderCategoryName;
    @TableField(exist = false)
    private String orderCategoryCode;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("工单类型 抽压 试压")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("执行标准")
    @TableField("execute_standard")
    private String executeStandard;
    @TableField(exist = false)
    private String executeStandardName;

    @ApiModelProperty("生产令号")
    @TableField("lrp_no")
    private String lrpNo;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

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

    @ApiModelProperty("工装")
    @TableField("fixture_id")
    private String fixtureId;
    @TableField(exist = false)
    private String fixtureCode;

    @ApiModelProperty("客户名称")
    @TableField("customer_name")
    private String customerName;

    @ApiModelProperty("是否生成报告")
    @TableField("is_generate_report")
    private String isGenerateReport;
    @TableField(exist = false)
    private String isGenerateReportName;

    @ApiModelProperty("工序")
    @TableField("process")
    private String process;

    @ApiModelProperty("工序")
    @TableField("process_name")
    private String processName;

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
    private String caliberFractionValue;

    @TableField(exist = false)
    private String dnName;

    @TableField(exist = false)
    private String caliber;

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

    @ApiModelProperty("有载扭矩")
    @TableField("loaded_torque")
    private BigDecimal loadedTorque;

    @ApiModelProperty("设计扭矩")
    @TableField("unloaded_torque")
    private BigDecimal unloadedTorque;

    @ApiModelProperty("电装力矩")
    @TableField("electric_torque")
    private BigDecimal electricTorque;

    @ApiModelProperty("最大压差")
    @TableField("max_pressure_diff")
    private BigDecimal maxPressureDiff;

    @ApiModelProperty("设计温度")
    @TableField("design_temperature")
    private String designTemperature;

    @ApiModelProperty("流量系数")
    @TableField("cv")
    private String cv;

    @ApiModelProperty("初始口径")
    @TableField("initial_caliber")
    private String initialCaliber;

    @ApiModelProperty("初始压力")
    @TableField("initial_pressure")
    private String initialPressure;

    @ApiModelProperty("审核状态")
    @TableField("status")
    private String status;
    @TableField(exist = false)
    private String statusName;


    @ApiModelProperty("关闭状态")
    @TableField("enable")
    private String enable;
    @TableField(exist = false)
    private String enableName;


    @ApiModelProperty("试验状态")
    @TableField("test_status")
    private String testStatus;
    @TableField(exist = false)
    private String testStatusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人")
    @TableField("audit_user_name")
    private String auditUserName;


    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人")
    @TableField("disable_user_name")
    private String disableUserName;

    @TableField("spot_check")
    @ApiModelProperty("是否是由工单创建的抽压工单")
    private String spotCheck;

    @TableField("list_no")
    @ApiModelProperty("清单号")
    private String listNo;

    @TableField("report_file_code")
    @ApiModelProperty("报告文件编号")
    private String reportFileCode;

    @TableField("remark")
    @ApiModelProperty("备注")
    private String remark;

    @TableField("batch_report_style")
    @ApiModelProperty("批次试验报告详情样式")
    private String batchReportStyle;

    @TableField("source_order_detail_id")
    private String sourceOrderDetailId;
    @TableField("source_order_id")
    private String sourceOrderId;
    @TableField("source_order_code")
    private String sourceOrderCode;
    @TableField("source_order_line_number")
    private Long sourceOrderLineNumber;
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;


    @TableField("shift_id")
    private String shiftId;
    @TableField("team_id")
    private String teamId;
    @TableField("device_id")
    private String deviceId;
    @TableField("operator_id")
    private String operatorId;

    @TableField("fixed_code")
    private String fixedCode;

    @ApiModelProperty("阀门名称")
    @TableField("product_name")
    private String productName;

    @TableField(value = "start_serial_num", updateStrategy = FieldStrategy.IGNORED)
    private String startSerialNum;

    @TableField(value = "approve_part_id", updateStrategy = FieldStrategy.IGNORED)
    private String approvePartId;
    @TableField(value = "approve_part_Name", updateStrategy = FieldStrategy.IGNORED)
    private String approvePartName;
    @TableField(value = "approve_user_id", updateStrategy = FieldStrategy.IGNORED)
    private String approveUserId;
    @TableField(exist = false)
    private List<String> approveUserIds;
    @TableField(value = "approve_user_name", updateStrategy = FieldStrategy.IGNORED)
    private String approveUserName;
    @TableField(exist = false)
    private List<String> approveUserNames;


    @TableField("create_org_id")
    private String createOrgId;
    @TableField("create_org_name")
    private String createOrgName;
    @TableField("customer_model")
    private String customerModel;
    @TableField("stem_material")
    private String stemMaterial;
    @TableField("spool_material")
    private String spoolMaterial;
    @TableField("seat_material")
    private String seatMaterial;
    @TableField("link_standard")
    private String linkStandard;

    @TableField(exist = false)
    private String serials;

    @TableField(exist = false)
    private Boolean fromMes;

    //水压强度
    @TableField(exist = false)
    private String zsy;
    //水压密封
    @TableField(exist = false)
    private String zsymf;

    @TableField(exist = false)
    @ApiModelProperty("产品列表")
    private List<CollectionDetectOrderProductList> productList;

    @TableField(exist = false)
    @ApiModelProperty("项目列表")
    private List<CollectionDetectOrderProject> projectList;

    @ApiModelProperty("试验大纲")
    @TableField(exist = false)
    private List<CollectionTestSynopsis> synopses;

    @ApiModelProperty("试验大纲")
    @TableField(exist = false)
    private List<CollectionDetectOrderFixture> fixtureList;

    @ApiModelProperty("试验设备")
    @TableField(exist = false)
    private List<CollectionDetectOrderDevice> deviceList;


    @TableField(exist = false)
    @ApiModelProperty("进行中的报告")
    private CollectionDetectReport ingReport;

    @ApiModelProperty("工装")
    @TableField(exist = false)
    private CollectionFixture fixture;

    @TableField(exist = false)
    private String productCode;

    @TableField(exist = false)
    private Boolean onlyFiles;

    @TableField(exist = false)
    private String fromChooseOrder;

    @TableField(exist = false)
    private SysUser user;

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
