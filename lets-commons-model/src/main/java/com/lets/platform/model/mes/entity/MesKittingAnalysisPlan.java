package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 齐套分析方案
 * </p>
 *
 * @author FZY
 * @since 2024-06-03
 */
@Getter
@Setter
@TableName("mes_kitting_analysis_plan")
@ApiModel(value = "MesKittingAnalysisPlan对象", description = "齐套分析方案")
public class MesKittingAnalysisPlan extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[方案编码]长度 1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("需求优先级[0:按计划开始时间顺序;1:按计划开始时间逆序;2:按计划完工时间顺序;3:按计划完工时间逆序]")
    @TableField("demand_priority")
    private Integer demandPriority;

    @ApiModelProperty("在途供应优先级[0:按交货时间顺序;1:按交货时间逆序]")
    @TableField("in_transit_priority")
    private Integer inTransitPriority;

    @ApiModelProperty("在制供应优先级[0:按计划开始时间顺序;1:按计划开始时间逆序;2:按计划完工时间顺序;3:按计划完工时间逆序]")
    @TableField("work_in_progress_priority")
    private Integer workInProgressPriority;

    @ApiModelProperty("考虑在途")
    @TableField("consider_in_transit")
    private Integer considerInTransit;

    @ApiModelProperty("考虑在制")
    @TableField("consider_work_in_progress")
    private Integer considerWorkInProgress;

    @ApiModelProperty("在途单据[0:采购申请;1:采购订单]")
    @TableField("in_transit_type")
    private Integer inTransitType;

    @ApiModelProperty("考虑生产工单")
    @TableField("consider_produce_order")
    private Integer considerProduceOrder;

    @ApiModelProperty("考虑委外工单")
    @TableField("consider_outsourcing_order")
    private Integer considerOutsourcingOrder;

    @ApiModelProperty("考虑替代料")
    @TableField("consider_substitute_materials")
    private Integer considerSubstituteMaterials;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("单据状态")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("关闭状态")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("关闭时间")
    @TableField("disable_time")
    private LocalDateTime disableTime;

    @ApiModelProperty("关闭人")
    @TableField("disable_user")
    private String disableUser;

    @ApiModelProperty("关闭人名称")
    @TableField("disable_user_name")
    private String disableUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("仓库范围")
    @TableField(exist = false)
    private List<MesKittingAnalysisPlanStore> storeList;
}
