package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 复检工单
 * @author DING WEI
 * @since 2024-12-24
 */
@Getter
@Setter
@TableName("tpm_repeat_inspect_order")
@ApiModel(value = "TpmRepeatInspectOrder对象", description = "复检工单")
public class TpmRepeatInspectOrder extends BaseEntity {

    @ApiModelProperty("工单编号")
    @TableField("code")
    private String code;

    /**
     * @see com.lets.platform.model.tpm.enums.PlanStopRelationEleEnum
     */
    @ApiModelProperty("复检类型[1:保养工单,2:点检工单]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("复检时间")
    @TableField("inspect_time")
    private LocalDateTime inspectTime;

    @ApiModelProperty("复检人员主键")
    @TableField("inspect_user_id")
    private String inspectUserId;

    @ApiModelProperty("复检人员名称")
    @TableField("inspect_user_name")
    private String inspectUserName;

    @ApiModelProperty("复检协助人员主键")
    @TableField("assist_user_id")
    private String assistUserId;

    @ApiModelProperty("复检协助人员名称")
    @TableField("assist_user_name")
    private String assistUserName;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    /**
     * @see com.lets.platform.model.tpm.enums.ConfigCycle
     */
    @ApiModelProperty("源单-周期 (1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年)")
    @TableField("source_order_cycle")
    private String sourceOrderCycle;
    @TableField(exist = false)
    private String sourceOrderCycleName;

    @ApiModelProperty("源单-人员主键")
    @TableField("source_order_user_id")
    private String sourceOrderUserId;

    @ApiModelProperty("源单-人员名称")
    @TableField("source_order_user_name")
    private String sourceOrderUserName;

    @ApiModelProperty("源单-协助人员主键")
    @TableField("source_order_assist_user_id")
    private String sourceOrderAssistUserId;

    @ApiModelProperty("源单-协助人员名称")
    @TableField("source_order_assist_user_name")
    private String sourceOrderAssistUserName;

    @ApiModelProperty("源单时间")
    @TableField("source_order_time")
    private LocalDateTime sourceOrderTime;

    /**
     * @see com.lets.platform.model.tpm.enums.RunningSituation
     */
    @ApiModelProperty("源单-运行情况[1:正常运行,2:故障报修,3:停用,4:报废]")
    @TableField("source_order_running_situation")
    private String sourceOrderRunningSituation;
    @TableField(exist = false)
    private String sourceOrderRunningSituationName;

    /**
     * @see com.lets.platform.model.tpm.enums.OrderResult
     */
    @ApiModelProperty("源单-结果[1:正常 2:异常]")
    @TableField("source_order_result")
    private String sourceOrderResult;
    @TableField(exist = false)
    private String sourceOrderResultName;

    @ApiModelProperty("源单-总结")
    @TableField("source_order_summarize")
    private String sourceOrderSummarize;

    /**
     * @see com.lets.platform.model.collection.enums.CheckResultEnum
     */
    @ApiModelProperty("结果[1:合格 2:不合格]")
    @TableField("result")
    private String result;
    @TableField(exist = false)
    private String resultName;

    @ApiModelProperty("复检评分")
    @TableField("score")
    private Integer score;

    @ApiModelProperty("复检结论")
    @TableField("summarize")
    private String summarize;

    /**
     * @see com.lets.platform.model.tpm.enums.RepeatInspectOrderStatusEnum
     */
    @ApiModelProperty("工单状态[1:待响应、2:复检中、3:待审核、4:已完成]")
    @TableField("order_status")
    private Integer orderStatus;
    @TableField(exist = false)
    private String orderStatusName;

    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("响应时间=接单时间")
    @TableField("response_time")
    private LocalDateTime responseTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("响应时长(毫秒)=响应时间-复检时间")
    @TableField("response_duration")
    private BigDecimal responseDuration;

    @ApiModelProperty("完成时间")
    @TableField("complete_time")
    private LocalDateTime completeTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("复检时长(毫秒)=完成时间-复检时间")
    @TableField("inspect_duration")
    private BigDecimal inspectDuration;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("审核时长(毫秒)=审核时间-复检完成时间")
    @TableField("audit_duration")
    private BigDecimal auditDuration;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    /**
     * @see com.lets.platform.model.psi.enums.OrderSourceEnum
     */
    @ApiModelProperty("单据来源[1手动创建2运算创建]")
    @TableField("order_source")
    private String orderSource;
    @TableField(exist = false)
    private String orderSourceName;
    @TableField(exist = false)
    private String factoryModeId;
    @TableField(exist = false)
    private String factoryModeName;

    @Size(max = 10, message = "图片数量不能超过10个", groups = {Save.class, Update.class})
    @ApiModelProperty("复检图片")
    @TableField(exist = false)
    private List<CommonFile> imageList;
    @ApiModelProperty(hidden = true)
    @TableField("image_ids")
    private String imageIds;
}
