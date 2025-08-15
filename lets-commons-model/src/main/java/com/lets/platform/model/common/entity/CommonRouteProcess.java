package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.CommonProcessTypeEnum;
import com.lets.platform.model.common.enums.InspectionTypeEnum;
import com.lets.platform.model.common.enums.ProcessTechniqueEnum;
import com.lets.platform.model.common.enums.ReportWayEnum;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

/**
 * 工艺路线-明细-工序信息
 *
 * @author DING WEI
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_route_process")
@ApiModel(value = "CommonRouteProcess对象", description = "工艺路线-明细-工序信息")
public class CommonRouteProcess extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer processNo;

    @ApiModelProperty("工艺路线主键")
    @TableField("order_id")
    private String orderId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String orderCode;

    @ApiModelProperty("工序组主键")
    @TableField("process_group_id")
    private String processGroupId;

    @TableField("process_group_name")
    private String processGroupName;

    @NotBlank(message = "CommonRouteProcess.processId", groups = {Save.class, Update.class})
    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @NotBlank(message = "CommonRouteProcess.processCode", groups = {Save.class, Update.class})
    @ApiModelProperty("工序编码")
    @TableField("process_code")
    private String processCode;

    @NotBlank(message = "CommonRouteProcess.processName", groups = {Save.class, Update.class})
    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    /**
     * @see com.lets.platform.model.common.enums.CommonProcessTypeEnum
     */
    @ValidatedEnum(enumClass = CommonProcessTypeEnum.class, message = "CommonRouteProcess.processType", required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("工序类型[1加工,2包装,3委外,4检验,5入库,6出库]")
    @TableField("process_type")
    private String processType;
    @TableField(exist = false)
    private String processTypeName;

    @ValidatedEnum(enumClass = ProcessTechniqueEnum.class, message = "[加工工艺] 非法", groups = {Save.class, Update.class})
    @ApiModelProperty("加工工艺[1“车床加工”、2“铣床加工”、3“钳工加工”、4“冲压加工”、5“注塑加工”、6“锻造加工”]")
    @TableField("process_technique")
    private Integer processTechnique;
    @ExcelProperty("加工工艺")
    @TableField(exist = false)
    private String processTechniqueName;

    /**
     * @see com.lets.platform.model.common.enums.InspectionTypeEnum
     */
    @ValidatedEnum(enumClass = InspectionTypeEnum.class, message = "CommonRouteProcess.inspectType", required = true, groups = {Save.class, Update.class})
    @ApiModelProperty("自制检验类型[1自检,2PQC]")
    @TableField("inspect_type")
    private String inspectType;
    @TableField(exist = false)
    private String inspectTypeName;

    @ApiModelProperty("委外工序检验[1是0否]")
    @TableField("outsourcing_inspect_type")
    private Integer outsourcingInspectType;

    @ApiModelProperty("质检标准")
    @TableField("inspect_standard")
    private String inspectStandard;

    @ValidatedEnum(enumClass = IsOrNotEnum.class, required = true, message = "CommonRouteProcess.isReport", groups = {Save.class, Update.class})
    @ApiModelProperty("是否报工工序[01]")
    @TableField("is_report")
    private Integer isReport;
    @TableField(exist = false)
    private String isReportName;

    /**
     * @see com.lets.platform.model.common.enums.ReportWayEnum
     */
    @ValidatedEnum(enumClass = ReportWayEnum.class, required = true, message = "CommonRouteProcess.reportWay", groups = {Save.class, Update.class})
    @ApiModelProperty("报工方式[1手动报工2自动报工]")
    @TableField("report_way")
    private String reportWay;
    @TableField(exist = false)
    private String reportWayName;

    @ExcelIgnore
    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ValidBigDecimal(message = "CommonRouteProcess.basicBatchSize", min = "0.001", max = "99999.999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("基本批量")
    @TableField("basic_batch_size")
    private BigDecimal basicBatchSize;

//    @ValidBigDecimal(message = "CommonRouteProcess.workPrice", max = "100000", includeMin = true, groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工价")
    @TableField("work_price")
    private BigDecimal workPrice;

    @ApiModelProperty("准备时长")
    @TableField("prepare_time")
    private Integer prepareTime;

    @ApiModelProperty("标准工时")
    @TableField("standard_time")
    private Integer standardTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("标准产能(只有物料类型的工艺路线有该属性，小数位取物料的生产单位精度)")
    @TableField("standard_capacity")
    private BigDecimal standardCapacity;
    /**
     * @see com.lets.platform.model.base.enums.StandardCapacityUnitEnum
     */
    @ApiModelProperty("标准产能单位")
    @TableField("standard_capacity_unit")
    private String standardCapacityUnit;
    @TableField(exist = false)
    private String standardCapacityUnitName;

//    @ValidBigDecimal(message = "CommonRouteProcess.convertRatio", min = "0.001", max = "99999.999", groups = {Save.class, Update.class})
    @ApiModelProperty("转换系数")
    @TableField("convert_ratio")
    private BigDecimal convertRatio;

    //    @NotBlank(message = "CommonRouteProcess.processUnitId", groups = {Save.class, Update.class})
    @ApiModelProperty("工序单位主键")
    @TableField("process_unit_id")
    private String processUnitId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String processUnitCode;
    //    @NotBlank(message = "CommonRouteProcess.processUnitName", groups = {Save.class, Update.class})
    @ApiModelProperty("工序单位名称")
    @TableField("process_unit_name")
    private String processUnitName;
    //    @NotNull(message = "CommonRouteProcess.processUnitAccuracy", groups = {Save.class, Update.class})
    @ApiModelProperty("工序单位精度")
    @TableField("process_unit_accuracy")
    private Integer processUnitAccuracy;
    //    @NotNull(message = "CommonRouteProcess.processUnitRoundOffType", groups = {Save.class, Update.class})
    @ApiModelProperty("工序单位舍入方式")
    @TableField("process_unit_round_off_type")
    private Integer processUnitRoundOffType;

    @ApiModelProperty("默认仓库")
    @TableField("default_store_id")
    private String defaultStoreId;
    @TableField(exist = false)
    private String defaultStoreName;

    @ApiModelProperty("默认库区")
    @TableField("default_area_id")
    private String defaultAreaId;
    @TableField(exist = false)
    private String defaultAreaName;

    @ApiModelProperty("默认库位")
    @TableField("default_position_id")
    private String defaultPositionId;
    @TableField(exist = false)
    private String defaultPositionName;

    @ApiModelProperty("默认供应商")
    @TableField("default_supplier_id")
    private String defaultSupplierId;

    @TableField("default_supplier_name")
    private String defaultSupplierName;

    @ApiModelProperty("WIP仓库")
    @TableField("wip_store_id")
    private String wipStoreId;

    @TableField("wip_store_name")
    private String wipStoreName;

    @ApiModelProperty("WIP物料")
    @TableField("wip_material_id")
    private String wipMaterialId;
    @TableField(exist = false)
    private String wipMaterialCode;
    @TableField("wip_material_name")
    private String wipMaterialName;

    @Length(max = 200, message = "CommonRouteProcess.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(value = "步骤,组排序", hidden = true)
    @TableField("process_step")
    private Integer processStep;
    @ApiModelProperty(value = "顺序,组内工序排序", hidden = true)
    @TableField("process_sort")
    private Integer processSort;

    @ApiModelProperty("周转时长(min)")
    @TableField("turnover_duration")
    private Long turnoverDuration;

    @ApiModelProperty("物料")
    @TableField(exist = false)
    private List<CommonRouteProcessMaterial> materialList;

    @ApiModelProperty("加工设备")
    @TableField(exist = false)
    private List<CommonRouteProcessDevice> deviceList;

    @ApiModelProperty("工艺参数")
    @TableField(exist = false)
    private List<CommonRouteProcessParameters> parametersList;

    @ApiModelProperty("工艺文件")
    @TableField(exist = false)
    private List<CommonRouteProcessFile> fileList;

    @ApiModelProperty("委外提前期(天)")
    @TableField("out_source_advance_day")
    @ExcelIgnore
    private Long outSourceAdvanceDay;

    @ApiModelProperty("准备活动基本量")
    @TableField("prepare_action_time")
    @ExcelIgnore
    private Long prepareActionTime;
    @ApiModelProperty("准备活动基本量单位")
    @TableField("prepare_action_time_unit")
    @ExcelIgnore
    private String prepareActionTimeUnit;

    @ApiModelProperty("加工活动基本量")
    @TableField("process_action_time")
    @ExcelIgnore
    private Long processActionTime;
    @ApiModelProperty("加工活动基本量单位")
    @TableField("process_action_time_unit")
    @ExcelIgnore
    private String processActionTimeUnit;

    @ApiModelProperty("拆卸活动基本量")
    @TableField("dismantle_action_time")
    @ExcelIgnore
    private Long dismantleActionTime;
    @ApiModelProperty("拆卸活动基本量单位")
    @TableField("dismantle_action_time_unit")
    @ExcelIgnore
    private String dismantleActionTimeUnit;

    @ApiModelProperty("标准排队时间")
    @TableField("queue_time")
    @ExcelIgnore
    private Long queueTime;
    @ApiModelProperty("标准排队时间单位")
    @TableField("queue_time_unit")
    @ExcelIgnore
    private String queueTimeUnit;

    @ApiModelProperty("标准等待时间")
    @TableField("wait_time")
    @ExcelIgnore
    private Long waitTime;
    @ApiModelProperty("标准等待时间单位")
    @TableField("wait_time_unit")
    @ExcelIgnore
    private String waitTimeUnit;

    @ApiModelProperty("标准移动时间")
    @TableField("move_time")
    @ExcelIgnore
    private Long moveTime;
    @ApiModelProperty("标准移动时间单位")
    @TableField("move_time_unit")
    @ExcelIgnore
    private String moveTimeUnit;

    @ApiModelProperty("拆卸同时等待")
    @TableField("wait_on_dismantle")
    @ExcelIgnore
    private Integer waitOnDismantle;

    @ApiModelProperty("工序迭代")
    @TableField("process_iterate")
    @ExcelIgnore
    private Integer processIterate;

    @ApiModelProperty("迭代最小时间")
    @TableField("iterate_min_time")
    @ExcelIgnore
    private Long iterateMinTime;

    @ApiModelProperty("迭代最小时间单位")
    @TableField("iterate_min_time_unit")
    @ExcelIgnore
    private String iterateMinTimeUnit;

    @ApiModelProperty("迭代批量")
    @TableField("iterate_batch_number")
    @ExcelIgnore
    private BigDecimal iterateBatchNumber;

    @ApiModelProperty("计件公式")
    @ExcelProperty("计件公式")
    @TableField("single_formula")
    private String singleFormula;

    @ApiModelProperty("委外单价")
    @ExcelIgnore
    @TableField("outsource_price")
    private BigDecimal outsourcePrice;
    @ExcelProperty("委外单价")
    @TableField(exist = false)
    private String outsourcePriceStr;

    @ApiModelProperty("是否连续委外[0：否，1：是]")
    @TableField("series")
    @ExcelIgnore
    private Integer series;

    @ExcelIgnore
    @ApiModelProperty("启用汇报顺序控制[0:否,1:是]")
    @TableField("report_orderly")
    private Integer reportOrderly;

    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工时单价")
    @TableField("hour_price")
    private BigDecimal hourPrice;
}
