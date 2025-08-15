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
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 抽样方案配置表
 * </p>
 *
 * @author FZY
 * @since 2024-01-05
 */
@Getter
@Setter
@TableName("sampling_plan_config")
@ApiModel(value = "SamplingPlanConfig对象", description = "抽样方案配置表")
public class SamplingPlanConfig extends BaseEntity {

    @ApiModelProperty("方案编号")
    @TableField("code")
    @NotBlank(message = "[方案编号]不能为空")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[方案编号]长度 1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    @NotBlank(message = "[方案名称]不能为空")
    @Length(min = 1, max = 70, message = "[物料名称]长度 1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("抽样类型")
    @TableField("sampling_type")
    private String samplingType;

    @ApiModelProperty("抽样类型名称")
    @TableField(exist = false)
    private String samplingTypeName;

    @ApiModelProperty("检验水平")
    @TableField("inspection_level")
    private String inspectionLevel;

    @ApiModelProperty("检验水平名称")
    @TableField(exist = false)
    private String inspectionLevelName;

    @ApiModelProperty("严格程度")
    @TableField("sampling_rigor_level")
    private String samplingRigorLevel;

    @ApiModelProperty("严格程度名称")
    @TableField(exist = false)
    private String samplingRigorLevelName;

    @ApiModelProperty("AQL")
    @TableField("aql")
    private String aql;

    @ApiModelProperty("AQL")
    @TableField(exist = false)
    private String aqlName;

    @ApiModelProperty("数据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("数据状态名称")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("启用状态名称")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private List<SamplingPlanConfigDetail> samplingPlanConfigDetails;
}
