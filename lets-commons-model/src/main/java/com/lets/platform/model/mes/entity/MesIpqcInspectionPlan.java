package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.mes.enums.InspectPlanMaterialScopeEnum;
import com.lets.platform.model.mes.enums.InspectPlanProcessScopEnum;
import com.lets.platform.model.mes.enums.InspectionDimEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * 制程检验计划
 * @author DING WEI
 * @since 2025-08-05
 */
@Getter
@Setter
@TableName("mes_ipqc_inspection_plan")
@ApiModel(value = "MesIpqcInspectionPlan对象", description = "制程检验计划")
public class MesIpqcInspectionPlan extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ValidatedEnum(enumClass = InspectPlanMaterialScopeEnum.class, required = true, message = "[适用物料范围]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("适用物料范围")
    @TableField("material_scope")
    private String materialScope;
    @TableField(exist = false)
    private String materialScopeName;

    @ValidatedEnum(enumClass = InspectPlanProcessScopEnum.class, required = true, message = "[适用工序范围]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("适用工序范围")
    @TableField("process_scope")
    private String processScope;
    @TableField(exist = false)
    private String processScopeName;

    @Length(max = 200, message = "[描述]长度不可超过200个字符", groups = {Save.class, Update.class})
    @ApiModelProperty("描述")
    @TableField("`describe`")
    private String describe;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("启用工序首检[0:否,1:是]")
    @TableField("enable_process_first_inspection")
    private Integer enableProcessFirstInspection;

    @ValidBigDecimal(message = "[首检数量]范围[1, 9999999999]", min = "1", max = "9999999999", includeMin = true, groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("首检数量")
    @TableField("first_inspection_number")
    private BigDecimal firstInspectionNumber;

    @ApiModelProperty("启用自动工序巡检[0:否,1:是]")
    @TableField("enable_auto_process_inspection")
    private Integer enableAutoProcessInspection;

    @ValidatedEnum(enumClass = InspectionDimEnum.class, message = "[巡检纬度]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("巡检纬度[1:时间,2:数量,3:进度]")
    @TableField("auto_process_inspection_dim")
    private Integer autoProcessInspectionDim;
    @TableField(exist = false)
    private String autoProcessInspectionDimName;

    @ValidBigDecimal(message = "[巡检量]范围[1, 9999999999]", min = "1", max = "9999999999", includeMin = true, groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("巡检量")
    @TableField("auto_process_inspection_number")
    private BigDecimal autoProcessInspectionNumber;

    @ApiModelProperty("启用工序末检[0:否,1:是]")
    @TableField("enable_process_last_inspection")
    private Integer enableProcessLastInspection;

    @ValidBigDecimal(message = "[末检数量]范围[1, 9999999999]", min = "1", max = "9999999999", includeMin = true, groups = {Save.class, Update.class})
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("末检数量")
    @TableField("last_inspection_number")
    private BigDecimal lastInspectionNumber;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @Size(max = 20, message = "附件不能超过20个", groups = {Save.class, Update.class})
    @ApiModelProperty("附件文件集合")
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    @ApiModelProperty("适用物料范围")
    @TableField(exist = false)
    private List<MesIpqcInspectionPlanDetail> materialList;
    @ApiModelProperty("适用物料分组范围")
    @TableField(exist = false)
    private List<MesIpqcInspectionPlanDetail> materialGroupList;
    @ApiModelProperty("适用工序范围")
    @TableField(exist = false)
    private List<MesIpqcInspectionPlanDetail> processList;
    @ApiModelProperty("适用工序分组范围")
    @TableField(exist = false)
    private List<MesIpqcInspectionPlanDetail> processGroupList;

    @ApiModelProperty("计划主键")
    @TableField(exist = false)
    private String orderId;

    /**
     * @see com.lets.platform.model.mes.enums.InspectDetailTypeEnum
     */
    @ApiModelProperty("明细类型[1:物料,2:物料分组,3:工序,4:工序分组]")
    @TableField(exist = false)
    private String detailType;

    @ApiModelProperty("物料主键")
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField(exist = false)
    private String materialSpecs;

    @ApiModelProperty("物料分组主键")
    @TableField(exist = false)
    private String materialGroupId;
    @ApiModelProperty("物料分组名称")
    @TableField(exist = false)
    private String materialGroupName;

    @ApiModelProperty("工序主键")
    @TableField(exist = false)
    private String processId;
    @ApiModelProperty("工序名称")
    @TableField(exist = false)
    private String processName;
    @ApiModelProperty("工序类型")
    @TableField(exist = false)
    private String processType;

    @ApiModelProperty("工序分组主键")
    @TableField(exist = false)
    private String processGroupId;
    @ApiModelProperty("工序分组名称")
    @TableField(exist = false)
    private String processGroupName;

    @TableField(exist = false)
    private Set<String> materialIds;
    @TableField(exist = false)
    private Set<String> materialGroupIds;
    @TableField(exist = false)
    private Set<String> processIds;
    @TableField(exist = false)
    private Set<String> processGroupIds;
}
