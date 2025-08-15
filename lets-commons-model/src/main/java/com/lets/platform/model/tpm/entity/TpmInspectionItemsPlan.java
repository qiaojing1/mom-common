package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.tpm.enums.PlanExecutionMethodEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 点检计划管理
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-11
 */
@Getter
@Setter
@TableName("tpm_inspection_items_plan")
@ApiModel(value = "TpmInspectionItemsPlan对象", description = "点检计划管理")
public class TpmInspectionItemsPlan extends BaseEntity {

    @ApiModelProperty("计划名称")
    @TableField("name")
    private String name;

    /**
     * @see com.lets.platform.model.tpm.enums.ConfigCycle
     */
    @ApiModelProperty("点检周期 (1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年)")
    @TableField("inspection_cycle")
    private String inspectionCycle;
    @ApiModelProperty("点检周期 (1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年)")
    @TableField(exist = false)
    private String inspectionCycleName;

    /**
     * @see PlanExecutionMethodEnum
     */
    @ApiModelProperty("计划执行方式 (1:每周期内执行一次 2:每周期内重复执行)")
    @TableField("plan_execution_method")
    private String planExecutionMethod;
    @TableField(exist = false)
    private String planExecutionMethodName;

    @ApiModelProperty("单次执行时间 (仅执行方式为1时有值)")
    @TableField("single_execution_time")
    private String singleExecutionTime;

    @ApiModelProperty("重复执行间隔 (h)(仅执行方式为2时有值)")
    @TableField("cycle_execution_interval")
    private Integer cycleExecutionInterval;

    @ApiModelProperty("重复执行开始时间(仅执行方式为2时有值)")
    @TableField("cycle_start_time")
    private String cycleStartTime;

    @ApiModelProperty("重复执行结束时间(仅执行方式为2时有值)")
    @TableField("cycle_end_time")
    private String cycleEndTime;

    @ApiModelProperty("执行日期(周 仅点检周期为每周时有值)")
    @TableField("week")
    private String week;

    @ApiModelProperty("执行日期(月 仅点检周期为每月或每年时有值)")
    @TableField("month")
    private String month;

    @ApiModelProperty("执行日期(日 仅点检周期为每月或每年时有值)")
    @TableField("day")
    private String day;

    @ApiModelProperty("生成的定时任务表达式")
    @TableField("cron")
    private String cron;

    @ApiModelProperty("最近一次执行时间")
    @TableField("last_execution_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastExecutionTime;

    @ApiModelProperty("下次执行时间")
    @TableField("next_execution_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime nextExecutionTime;

    @ApiModelProperty("启用状态 0:停用 1:启用")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("执行设备数量")
    @TableField(exist = false)
    private Integer deviceNum;

    @ApiModelProperty("班次id")
    @TableField("shift_id")
    private String shiftId;

    @ApiModelProperty("班次名称")
    @TableField("shift_name")
    private String shiftName;

    @ApiModelProperty("生产单元id")
    @TableField("factory_mode_id")
    private String factoryModeId;

    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @TableField(exist = false)
    @ApiModelProperty("设备明细列表")
    private List<TpmInspectionItemsPlanDevices> devicesList;
}
