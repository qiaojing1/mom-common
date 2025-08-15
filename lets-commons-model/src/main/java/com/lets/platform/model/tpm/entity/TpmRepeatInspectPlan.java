package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.RandomReInspectCycleEnum;
import com.lets.platform.model.common.enums.ReInspectExecuteMethodEnum;
import com.lets.platform.model.common.enums.ReInspectStrategyEnum;
import com.lets.platform.model.common.enums.ReInspectTypeEnum;
import com.lets.platform.model.tpm.enums.ReInspectMethodEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 复检计划
 * @author DING WEI
 * @since 2025-07-14
 */
@Getter
@Setter
@TableName("tpm_repeat_inspect_plan")
@ApiModel(value = "TpmRepeatInspectPlan对象", description = "复检计划")
public class TpmRepeatInspectPlan extends BaseEntity {

    @ApiModelProperty("计划编号")
    @TableField("code")
    private String code;

    @NotBlank(message = "[计划名称]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("计划名称")
    @TableField("name")
    private String name;

    /**
     * @see com.lets.platform.model.tpm.enums.PlanStopRelationEleEnum
     */
    @NotBlank(message = "[复检范围]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("复检范围[1:保养工单,2:点检工单]")
    @TableField("inspect_scope")
    private String inspectScope;
    @TableField(exist = false)
    private String inspectScopeName;

    /**
     * @see com.lets.platform.model.common.enums.ReInspectTypeEnum
     */
    @ValidatedEnum(enumClass = ReInspectTypeEnum.class, required = true, message = "[复检类型]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("复检类型[1:按设备,2:按生产单元]")
    @TableField("inspect_type")
    private String inspectType;
    @TableField(exist = false)
    private String inspectTypeName;

    /**
     * @see com.lets.platform.model.tpm.enums.ReInspectMethodEnum
     */
    @ValidatedEnum(enumClass = ReInspectMethodEnum.class, required = true, message = "[复检方式]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("复检方式[1:全部复检,2:按周期随机复检]")
    @TableField("inspect_method")
    private String inspectMethod;
    @TableField(exist = false)
    private String inspectMethodName;

    /**
     * @see com.lets.platform.model.common.enums.RandomReInspectCycleEnum
     */
    @ValidatedEnum(enumClass = RandomReInspectCycleEnum.class, required = true, message = "[复检周期]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("复检周期[1:每周,2:每月,2:每年]")
    @TableField("inspect_cycle")
    private String inspectCycle;
    @TableField(exist = false)
    private String inspectCycleName;

    /**
     * @see com.lets.platform.model.common.enums.ReInspectExecuteMethodEnum
     */
    @ValidatedEnum(enumClass = ReInspectExecuteMethodEnum.class, message = "[计划执行方式]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("计划执行方式[1:按复检次数,2:按指定日期]")
    @TableField("execute_method")
    private String executeMethod;
    @TableField(exist = false)
    private String executeMethodName;

    @ApiModelProperty("复检次数")
    @TableField("inspect_times")
    private Integer inspectTimes;

    /**
     * @see com.lets.platform.model.common.enums.ReInspectStrategyEnum
     */
    @ValidatedEnum(enumClass = ReInspectStrategyEnum.class, message = "[复检策略]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("复检策略[1:依次执行,2:交替执行]")
    @TableField("inspect_strategy")
    private String inspectStrategy;
    @TableField(exist = false)
    private String inspectStrategyName;

    @NotBlank(message = "[复检人员]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("复检人员主键")
    @TableField("inspect_user_id")
    private String inspectUserId;
    @NotBlank(message = "[复检人员]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("复检人员名称")
    @TableField("inspect_user_name")
    private String inspectUserName;

    // 周：1-7
    @ApiModelProperty("执行日期")
    @TableField("execute_dates")
    private String executeDates;
    @TableField(exist = false)
    private List<String> executeDateList;

    @NotBlank(message = "[生产车间]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("车间主键")
    @TableField("workshop_id")
    private String workshopId;
    @NotBlank(message = "[生产车间]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("车间名称")
    @TableField("workshop_name")
    private String workshopName;

    @ApiModelProperty("复检明细总数")
    @TableField("inspect_detail_number")
    private Integer inspectDetailNumber;

    @ApiModelProperty("下次执行时间")
    @TableField("next_execute_time")
    private LocalDate nextExecuteTime;

    @ApiModelProperty("下次执行数量")
    @TableField("next_execute_number")
    private Integer nextExecuteNumber;

    @ApiModelProperty("启用停用[0:停用,1:启用]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @NotEmpty(message = "[复检明细]不能为空", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<TpmRepeatInspectPlanDetail> details;

    @ApiModelProperty("计划主键")
    @TableField(exist = false)
    private String orderId;

    @ApiModelProperty("设备主键")
    @TableField(exist = false)
    private String deviceId;
    @ApiModelProperty("设备编码")
    @TableField(exist = false)
    private String deviceCode;
    @ApiModelProperty("设备名称")
    @TableField(exist = false)
    private String deviceName;

    @ApiModelProperty("生产单元主键")
    @TableField(exist = false)
    private String factoryModeId;
    @ApiModelProperty("生产单元编码")
    @TableField(exist = false)
    private String factoryModeCode;
    @ApiModelProperty("生产单元名称")
    @TableField(exist = false)
    private String factoryModeName;

    @ApiModelProperty("设备类型主键")
    @TableField(exist = false)
    private String deviceTypeId;
    @ApiModelProperty("设备类型名称")
    @TableField(exist = false)
    private String deviceTypeName;

    @ApiModelProperty("设备型号主键")
    @TableField(exist = false)
    private String deviceModeId;
    @ApiModelProperty("设备型号名称")
    @TableField(exist = false)
    private String deviceModeName;

    @ApiModelProperty("设备等级")
    @TableField(exist = false)
    private String deviceLevel;

    @ApiModelProperty(value = "点检已复检次数", hidden = true)
    @TableField(exist = false)
    private Integer spotInspectTimes;
    @ApiModelProperty(value = "上次点检复检时间", hidden = true)
    @TableField(exist = false)
    private LocalDateTime spotInspectTime;
    @ApiModelProperty(value = "保养已复检次数", hidden = true)
    @TableField(exist = false)
    private Integer mainInspectTimes;
    @ApiModelProperty(value = "保养已复检次数", hidden = true)
    @TableField(exist = false)
    private LocalDateTime mainInspectTime;
}
