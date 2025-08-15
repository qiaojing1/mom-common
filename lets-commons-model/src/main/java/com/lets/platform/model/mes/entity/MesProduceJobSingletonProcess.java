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
import java.util.Objects;

/**
 * 单件工序任务清单
 * @author DING WEI
 * @since 2024-02-22
 */
@Getter
@Setter
@TableName("mes_produce_job_singleton_process")
@ApiModel(value = "MesProduceJobSingletonProcess对象", description = "单件工序任务清单")
public class MesProduceJobSingletonProcess extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("作业单主键")
    @TableField("job_order_id")
    private String jobOrderId;
    @ApiModelProperty("作业单号")
    @TableField("job_order_code")
    private String jobOrderCode;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("作业单日期")
    @TableField("job_order_time")
    private LocalDateTime jobOrderTime;
    @ApiModelProperty("生产作业单明细主键")
    @TableField("job_order_detail_id")
    private String jobOrderDetailId;

    @ApiModelProperty("批号")
    @TableField("batch_number")
    private String batchNumber;

    @ApiModelProperty("物料主键")
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

    @ApiModelProperty("图号")
    @TableField("drawing_no")
    private String drawingNo;
    @ApiModelProperty("图纸版本")
    @TableField("drawing_version")
    private String drawingVersion;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("工艺路线主键")
    @TableField("route_id")
    private String routeId;
    @ApiModelProperty("工艺路线名称")
    @TableField("route_name")
    private String routeName;
    @ApiModelProperty("工艺路线-工序主键")
    @TableField("route_process_id")
    private String routeProcessId;
    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;
    @ApiModelProperty("工序编码")
    @TableField("process_code")
    private String processCode;
    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    /**
     * @see com.lets.platform.model.common.enums.CommonProcessTypeEnum
     */
    @ApiModelProperty("工序类型[1加工,2包装,3委外,4检验,5入库,6出库]")
    @TableField("process_type")
    private String processType;
    @TableField(exist = false)
    private String processTypeName;

    /**
     * @see com.lets.platform.model.common.enums.InspectionTypeEnum
     */
    @ApiModelProperty("检验类型[1自检,2PQC]")
    @TableField("inspect_type")
    private String inspectType;
    @TableField(exist = false)
    private String inspectTypeName;

    /**
     * @see com.lets.platform.model.common.enums.ReportWayEnum
     */
    @ApiModelProperty("报工方式[1手动报工2自动报工]")
    @TableField("report_way")
    private String reportWay;
    @TableField(exist = false)
    private String reportWayName;

    @ApiModelProperty("步骤,组排序")
    @TableField("process_step")
    private Integer processStep;
    @ApiModelProperty("顺序,组内工序排序")
    @TableField("process_sort")
    private Integer processSort;

    /**
     * @see com.lets.platform.model.mes.enums.ProcessSignEnum
     */
    @ApiModelProperty("工序标识[0:首道工序,1:末道工序,2:只有一道工序(既是首道也是末道)]")
    @TableField("process_sign")
    private String processSign;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;

    @ApiModelProperty("工序开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;
    @ApiModelProperty("工序完成时间")
    @TableField("end_time")
    private LocalDateTime endTime;
    @ApiModelProperty("加工开始时间(设备状态从其他变成运行的时间)")
    @TableField("work_start_time")
    private LocalDateTime workStartTime;

    @ApiModelProperty("生产开始时间")
    @TableField(exist = false)
    private LocalDateTime productStartTime;
    @ApiModelProperty("生产结束时间")
    @TableField(exist = false)
    private LocalDateTime productEndTime;

    /**
     * @see com.lets.platform.model.base.enums.SingleProcessStatusEnum
     */
    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("报工时间")
    @TableField("report_time")
    private LocalDateTime reportTime;
    @ApiModelProperty("报工人员")
    @TableField("report_user")
    private String reportUser;
    @ApiModelProperty("报工人员名称")
    @TableField("report_user_name")
    private String reportUserName;
    @TableField(exist = false)
    private Boolean emptyReportInfo;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer statusCount;

    @ApiModelProperty("操作人员")
    @TableField(exist = false)
    private List<String> operatorUserName;
    @ApiModelProperty("采集器主键")
    @TableField("collector_id")
    private String collectorId;
    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("工序时长")
    @TableField("process_duration")
    private Long processDuration;
    @ApiModelProperty("上料时长")
    @TableField("feeding_duration")
    private Long feedingDuration;
    @ApiModelProperty("下料时长")
    @TableField("blanking_duration")
    private Long blankingDuration;
    @ApiModelProperty("加工时长")
    @TableField("produce_duration")
    private Long produceDuration;
    /**
     * @see com.lets.platform.model.base.enums.ProduceJobUnlockProductTypeEnum
     */
    @ApiModelProperty("产品类型[1当日首件2换型第一件3其他]")
    @TableField("product_type")
    private Integer productType;

    @ApiModelProperty("工序物料")
    @TableField(exist = false)
    private MesProduceJobSingletonProcessMaterial processMaterial;

    @ApiModelProperty("标准工时")
    @TableField("standard_time")
    private Integer standardTime;
    @ApiModelProperty("周转时长(min)")
    @TableField("turnover_duration")
    private Long turnoverDuration;
    @ApiModelProperty("实际周转时长")
    @TableField("real_turnover_duration")
    private Long realTurnoverDuration;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("标准产能(pcs/h)")
    @TableField(exist = false)
    private BigDecimal standardCapacity;
    @ApiModelProperty("实际工时")
    @TableField(exist = false)
    private Long realityTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际产能(pcs/h)")
    @TableField(exist = false)
    private BigDecimal realityCapacity;
    @ApiModelProperty("工时差值")
    @TableField(exist = false)
    private Integer diffTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("设备利用率(%)")
    @TableField(exist = false)
    private BigDecimal deviceUtilizationRate;

    /**
     * @see com.lets.platform.model.base.enums.ProduceJobUnlockOpSourceEnum
     */
    @ApiModelProperty("开工来源[1web2扫码]")
    @TableField("start_source")
    private Integer startSource;

    public Long processDurationNotNull() {
        if (Objects.isNull(processDuration)) {
            return 0L;
        } else {
            return processDuration;
        }
    }

    public Long feedingDurationNotNull() {
        if (Objects.isNull(feedingDuration)) {
            return 0L;
        } else {
            return feedingDuration;
        }
    }
}
