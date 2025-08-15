package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.config.StringArrayToStringDeserialize;
import com.lets.platform.common.pojo.config.StringToStringArraySerializer;
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
 * 检验方案配置表
 * </p>
 *
 * @author FZY
 * @since 2024-01-06
 */
@Getter
@Setter
@TableName("inspect_plan_config")
@ApiModel(value = "InspectPlanConfig对象", description = "检验方案配置表")
public class InspectPlanConfig extends BaseEntity {

    @ApiModelProperty("方案编号")
    @TableField("code")
    @NotBlank(message = "[方案编号]不能为空")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[方案编码]长度 1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    @NotBlank(message = "[方案名称]不能为空")
    @Length(min = 1, max = 70, message = "[物料名称]长度 1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("检验类型")
    @TableField("inspect_type")
    @JsonSerialize(using = StringToStringArraySerializer.class)
    @JsonDeserialize(using = StringArrayToStringDeserialize.class)
    private String inspectType;

    @ApiModelProperty("检验类型名称")
    @TableField(exist = false)
    private String inspectTypeName;

    @ApiModelProperty("物料范围")
    @TableField("material_range")
    private String materialRange;

    @ApiModelProperty("物料范围名称")
    @TableField(exist = false)
    private String materialRangeName;

    @ApiModelProperty("工序范围")
    @TableField("process_range")
    private String processRange;

    @ApiModelProperty("工序范围名称")
    @TableField(exist = false)
    private String processRangeName;

    @ApiModelProperty("抽样方案ID")
    @TableField("sampling_plan_id")
    private String samplingPlanId;

    @ApiModelProperty("抽样方案名称")
    @TableField(exist = false)
    private String samplingPlanName;

    @ApiModelProperty("检验水平名称")
    @TableField(exist = false)
    private String inspectionLevelName;

    @ApiModelProperty("严格程度名称")
    @TableField(exist = false)
    private String samplingRigorLevelName;

    @ApiModelProperty("检验维度")
    @TableField("inspect_dimension")
    private String inspectDimension;
    @TableField(exist = false)
    private String inspectDimensionName;

    @ApiModelProperty("录入方式")
    @TableField("inspect_input_method")
    private String inspectInputMethod;
    @TableField(exist = false)
    private String inspectInputMethodName;

    @ApiModelProperty("判定方式")
    @TableField("inspect_judgment_method")
    private String inspectJudgmentMethod;
    @TableField(exist = false)
    private String inspectJudgmentMethodName;

    @ApiModelProperty("重点检验")
    @TableField("important")
    private String important;
    @TableField(exist = false)
    private String importantName;

    @ApiModelProperty("分析类型[1:定性,只要填了就能判定合格;2:定量,输入的内容必须在标准范围之内，才是合格;]")
    @TableField("analysis_type")
    private String analysisType;
    @TableField(exist = false)
    private String analysisTypeName;

    @ApiModelProperty("检验项目来源")
    @TableField("inspect_source")
    private String inspectSource;
    @TableField(exist = false)
    private String inspectSourceName;

    @ApiModelProperty("缺陷等级")
    @TableField("adverse_level")
    private String adverseLevel;
    @TableField(exist = false)
    private String adverseLevelName;

    @ApiModelProperty("单据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;

    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人员")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人员名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private String materialProAttrNames;

    @ApiModelProperty("文件ID")
    @TableField(exist = false)
    private List<String> fileIds;

    @TableField(exist = false)
    private List<InspectPlanConfigDetail> detailList;

    @TableField(exist = false)
    private List<InspectPlanConfigMaterialProAttr> materialProAttrList;

    @TableField(exist = false)
    private List<InspectPlanConfigMaterial> materialList;

    @TableField(exist = false)
    private List<InspectPlanConfigMaterialGroup> materialGroupList;

    @TableField(exist = false)
    private List<InspectPlanConfigMaterialExt> materialExtList;

    @TableField(exist = false)
    private List<InspectPlanConfigProcess> processList;

    @TableField(exist = false)
    private List<InspectPlanConfigProcessGroup> processGroupList;
}
