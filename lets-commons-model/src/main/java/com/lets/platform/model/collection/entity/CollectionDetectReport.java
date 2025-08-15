package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.lets.platform.model.collection.dto.FlowDetail;
import com.lets.platform.model.collection.enums.ItemResultEnum;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 单件试验报告
 * </p>
 *
 * @author csy
 * @since 2024-01-27
 */
@Getter
@Setter
@TableName("collection_detect_report")
@ApiModel(value = "CollectionDetectReport对象", description = "单件试验报告")
public class CollectionDetectReport extends BaseEntity {

    @ApiModelProperty("报告编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("试验次数")
    @TableField("product_number")
    private Integer productNumber;

    @ApiModelProperty("开始时间")
    @TableField(value = "bgn_time")
    private LocalDateTime bgnTime;
    @TableField(value = "fake_bgn_time", updateStrategy = FieldStrategy.ALWAYS)
    private LocalDateTime fakeBgnTime;
    @TableField(exist = false)
    private Long bgnTimeLong;

    @ApiModelProperty("结束时间")
    @TableField(value = "end_time")
    private LocalDateTime endTime;
    @TableField(value = "fake_end_time", updateStrategy = FieldStrategy.ALWAYS)
    private LocalDateTime fakeEndTime;
    @TableField(exist = false)
    private Long endTimeLong;

    @TableField(value = "report_time", updateStrategy = FieldStrategy.ALWAYS)
    private LocalDateTime reportTime;

    @ApiModelProperty("产品编号")
    @TableField("product_code")
    private String productCode;

    @ApiModelProperty("试验类型")
    @TableField(value = "test_type")
    private String testType;
    @TableField(exist = false)
    private String testTypeName;

    @ApiModelProperty("标准")
    @TableField(value = "standard_name", updateStrategy = FieldStrategy.ALWAYS)
    private String standardName;

    @ApiModelProperty("执行标准")
    @TableField(value = "execute_standard", updateStrategy = FieldStrategy.ALWAYS)
    private String executeStandard;

    @ApiModelProperty("生产令号")
    @TableField("lrp_no")
    private String lrpNo;

    @ApiModelProperty("试验员id")
    @TableField(value = "operator_Id", updateStrategy = FieldStrategy.ALWAYS)
    private String operatorId;

    @ApiModelProperty("试验员名称")
    @TableField(value = "operator_name", updateStrategy = FieldStrategy.ALWAYS)
    private String operatorName;
    @TableField(exist = false)
    private String operatorSign;

    @ApiModelProperty("检验员")
    @TableField(value = "inspector_id")
    private String inspectorId;

    @ApiModelProperty("检验员")
    @TableField(value = "inspector_name")
    private String inspectorName;
    @TableField(exist = false)
    private String inspectorSign;

    @ApiModelProperty("审核员")
    @TableField(value = "auditor_id", updateStrategy = FieldStrategy.ALWAYS)
    private String auditorId;

    @ApiModelProperty("审核员")
    @TableField(value = "auditor_name", updateStrategy = FieldStrategy.ALWAYS)
    private String auditorName;
    @TableField(exist = false)
    private String auditorSign;

    @ApiModelProperty("产品名称")
    @TableField(value = "product_name", updateStrategy = FieldStrategy.ALWAYS)
    private String productName;

    @ApiModelProperty("型号")
    @TableField(value = "model", updateStrategy = FieldStrategy.ALWAYS)
    private String model;

    @ApiModelProperty("生产订单号")
    @TableField(value = "produce_order_code", updateStrategy = FieldStrategy.ALWAYS)
    private String produceOrderCode;

    @ApiModelProperty("工位机编号")
    @TableField(value = "station_id", updateStrategy = FieldStrategy.ALWAYS)
    private String stationId;

    @ApiModelProperty("动作试验 -1:未知 0:未开始 1:进行中 2:合格 3:不合格")
    @TableField(value = "movement_test_result", updateStrategy = FieldStrategy.ALWAYS)
    private String movementTestResult;
    @TableField(exist = false)
    private String movementTestResultName;


    @ApiModelProperty("试验结果 -1:未知 0:未开始 1:进行中 2:合格 3:不合格")
    @TableField(value = "test_result", updateStrategy = FieldStrategy.ALWAYS)
    private String testResult;
    @TableField(exist = false)
    private String testResultName;

    @TableField(value = "pressure_test_result", updateStrategy = FieldStrategy.ALWAYS)
    private String pressureTestResult;
    @TableField(exist = false)
    private String pressureTestResultName;

    @ApiModelProperty("项目耗时（s）")
    @TableField(value = "time_consuming", updateStrategy = FieldStrategy.ALWAYS)
    private BigDecimal timeConsuming;

    @ApiModelProperty("特殊要求")
    @TableField(value = "special_demand")
    private String specialDemand;

    @ApiModelProperty("介质温度")
    @TableField(value = "media_temp", updateStrategy = FieldStrategy.ALWAYS)
    private String mediaTemp;

    @ApiModelProperty("环境温度")
    @TableField(value = "env_temp", updateStrategy = FieldStrategy.ALWAYS)
    private String envTemp;

    @ApiModelProperty("冷媒温度")
    @TableField(value = "ref_temp", updateStrategy = FieldStrategy.ALWAYS)
    private String refTemp;

    @ApiModelProperty("阀内温度")
    @TableField(value = "valve_inn_temp", updateStrategy = FieldStrategy.ALWAYS)
    private String valveInnTemp;

    @ApiModelProperty("阀体温度")
    @TableField(value = "valve_body_temp", updateStrategy = FieldStrategy.ALWAYS)
    private String valveBodyTemp;


    @ApiModelProperty("阀盖温度")
    @TableField(value = "valve_cover_temp", updateStrategy = FieldStrategy.ALWAYS)
    private String valveCoverTemp;


    @ApiModelProperty("阀杆温度")
    @TableField(value = "valve_stem_temp", updateStrategy = FieldStrategy.ALWAYS)
    private String valveStemTemp;

    @ApiModelProperty("填料温度")
    @TableField(value = "pack_temp", updateStrategy = FieldStrategy.ALWAYS)
    private String packTemp;

    @ApiModelProperty("电装扭矩")
    @TableField(value = "electric_torque", updateStrategy = FieldStrategy.ALWAYS)
    private String electricTorque;

    @ApiModelProperty("不合格处理单")
    @TableField(value = "unqualified_handle_order", updateStrategy = FieldStrategy.ALWAYS)
    private String unqualifiedHandleOrder;

    @ApiModelProperty("公称通径")
    @TableField(value = "caliber")
    private String caliber;

    @ApiModelProperty("公称通径")
    @TableField(value = "pressure")
    private String pressure;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("阀门类型")
    @TableField("valve_type")
    private String valveType;

    @ApiModelProperty("泄露等级")
    @TableField("leakage_level")
    private String leakageLevel;

    @ApiModelProperty("不合格原因")
    @TableField("defect_cause")
    private String defectCause;

    @ApiModelProperty("抽压试压")
    @TableField("detect_type")
    private String detectType;

    @ApiModelProperty("是否在单件试验报告中展示")
    @TableField("show_in_report")
    private String showInReport;

    @TableField("order_status")
    private String orderStatus;
    @TableField(exist = false)
    private String orderStatusName;
    @TableField(value = "audit_time", updateStrategy = FieldStrategy.ALWAYS)
    private LocalDateTime auditTime;

    @ApiModelProperty("数量")
    @TableField(value = "number", updateStrategy = FieldStrategy.ALWAYS)
    private String number;
    @ApiModelProperty("项目名称")
    @TableField(value = "project_name", updateStrategy = FieldStrategy.ALWAYS)
    private String projectName;
    @ApiModelProperty("cv或kv")
    @TableField(value = "cv_or_kv", updateStrategy = FieldStrategy.ALWAYS)
    private String cvOrKv;
    @ApiModelProperty("试验方法")
    @TableField(value = "method", updateStrategy = FieldStrategy.ALWAYS)
    private String method;
    @ApiModelProperty("炉号")
    @TableField(value = "heat_no", updateStrategy = FieldStrategy.ALWAYS)
    private String heatNo;
    @ApiModelProperty("结论")
    @TableField(value = "summary", updateStrategy = FieldStrategy.ALWAYS)
    private String summary;
    @ApiModelProperty("压力表号和量程")
    @TableField(value = "meter_no", updateStrategy = FieldStrategy.ALWAYS)
    private String meterNo;

    @ApiModelProperty("阀门名称")
    @TableField("valve_name")
    private String valveName;

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

    @ApiModelProperty("流量系数")
    @TableField("cv")
    private String cv;

    @ApiModelProperty("初始口径")
    @TableField("initial_caliber")
    private String initialCaliber;

    @ApiModelProperty("初始压力")
    @TableField("initial_pressure")
    private String initialPressure;

    @TableField("report_file_code")
    @ApiModelProperty("报告文件编号")
    private String reportFileCode;

    @TableField(exist = false)
    @ApiModelProperty("试验项目")
    private List<CollectionDetectReportDetail> detailList;

    @TableField(exist = false)
    @ApiModelProperty("流阻试验项目")
    private List<FlowDetail> flowDetailList;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Map<String, CollectionDetectReportDetail> detailMap;
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private List<String> detailTableHeader;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private List<Map<String, Object>> chartMap;
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private List<String> xAxisData;


    @TableField(exist = false)
    @ApiModelProperty("在线查询入参 页大小")
    private Integer size;
    @TableField(exist = false)
    @ApiModelProperty("在线查询入参 当前页")
    private Integer page;
    @ApiModelProperty("在线查询入参 时间区间")
    @TableField(exist = false)
    private List<String> timeRange;

    @TableField(exist = false)
    private List<DetectReportChart> itemList;

    @TableField("detect_order_code")
    private String detectOrderCode;
    @TableField("detect_order_id")
    private String detectOrderId;

    @ApiModelProperty("压力表")
    @TableField("pressure_meter_code")
    private String pressureMeterCode;
    @ApiModelProperty("图标仪")
    @TableField("icon_code")
    private String iconCode;
    @ApiModelProperty("传感器")
    @TableField("sensor_code")
    private String sensorCode;
    @ApiModelProperty("测温仪")
    @TableField("thermometer_code")
    private String thermometerCode;

    @ApiModelProperty("工序名称")
    @TableField(value = "process_name", updateStrategy = FieldStrategy.ALWAYS)
    private String processName;

    @ApiModelProperty("客户名称")
    @TableField(value = "customer_name", updateStrategy = FieldStrategy.ALWAYS)
    private String customerName;

    @ApiModelProperty("清单号")
    @TableField(value = "list_no", updateStrategy = FieldStrategy.ALWAYS)
    private String listNo;

    @ApiModelProperty("图号")
    @TableField(value = "draw_no", updateStrategy = FieldStrategy.ALWAYS)
    private String drawNo;

    @ApiModelProperty("材质")
    @TableField(value = "valve_material_name", updateStrategy = FieldStrategy.ALWAYS)
    private String valveMaterialName;


    @ApiModelProperty("报告状态：0:未开始，1:进行中，2:已完成")
    @TableField("status")
    private String status;


    @ApiModelProperty("报告状态：0:未开始，1:进行中，2:已完成")
    @TableField("transfer_status")
    private String transferStatus;
    @TableField(exist = false)
    private String transferStatusName;

    @ApiModelProperty("报告状态：0:未开始，1:进行中，2:已完成")
    @TableField("merge_status")
    private String mergeStatus;
    @TableField(exist = false)
    private String mergeStatusName;

    @ApiModelProperty("计划跟踪号")
    @TableField("track_no")
    private String trackNo;

    @ApiModelProperty("主阀体炉号")
    @TableField(value="main_heat_number", updateStrategy = FieldStrategy.ALWAYS)
    private String mainHeatNumber;

    @ApiModelProperty("阀盖炉号")
    @TableField(value="auxiliary_heat_number", updateStrategy = FieldStrategy.ALWAYS)
    private String auxiliaryHeatNumber;

    @ApiModelProperty("副阀体炉号")
    @TableField(value="bonnet_heat_number",updateStrategy = FieldStrategy.ALWAYS)
    private String bonnetHeatNumber;

    @ApiModelProperty("阀杆炉号")
    @TableField(value="stem_heat_number", updateStrategy = FieldStrategy.ALWAYS)
    private String stemHeatNumber;

    @ApiModelProperty("板/蝶/球炉号")
    @TableField(value="other_heat_number", updateStrategy = FieldStrategy.ALWAYS)
    private String otherHeatNumber;
    @TableField(exist = false)
    private String barCode;
    @TableField(exist = false)
    private Integer current;
    @TableField(exist = false)
    private Boolean needMovement = false;


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
    private List<CommonFile> enclosureFiles;
}
