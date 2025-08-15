package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.vo.MaterialSpecific;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 物料替代方案
 * </p>
 *
 * @author FZY
 * @since 2025-04-27
 */
@Getter
@Setter
@TableName("psi_material_substitution_plan")
@ApiModel(value = "PsiMaterialSubstitutionPlan对象", description = "物料替代方案")
public class PsiMaterialSubstitutionPlan extends BaseEntity {

    @ApiModelProperty("方案编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "[方案编码] 长度1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("替代类型[1:订单替代]")
    @TableField("substitution_type")
    private String substitutionType;

    @ApiModelProperty("替代类型[1:订单替代]")
    @TableField(exist = false)
    private String substitutionTypeName;

    @ApiModelProperty("替代方式[1:组合替代;2:单一替代]")
    @TableField("substitution_method")
    private String substitutionMethod;

    @ApiModelProperty("替代方式[1:组合替代;2:单一替代]")
    @TableField(exist = false)
    private String substitutionMethodName;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料名称")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialTypeName;

    @ApiModelProperty("规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料分组ID")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("特征属性名称")
    @TableField("material_specific_name")
    private String materialSpecificName;

    @ApiModelProperty("单位")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入方式")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("是否关闭[0关闭1开启]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("是否关闭[0关闭1开启]")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("特征属性列表")
    @TableField(exist = false)
    private List<MaterialSpecific> materialSpecificList;

    @TableField(exist = false)
    private List<PsiMaterialSubstitutionPlanDetail> detailList;
}
