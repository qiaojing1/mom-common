package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseTreeEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * 编码规则配置
 * @author FZY
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_material_group")
@ApiModel(value = "PsiMaterialGroup对象", description = "编码规则配置")
public class PsiMaterialGroup extends BaseTreeEntity {

    @ApiModelProperty("物料分组编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "[物料分组编码]长度 1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("物料分组名称")
    @TableField("name")
    @Length(min = 1, max = 20, message = "[物料分组名称]长度 1~20，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("上级物料分组ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("是否选择过(YN)")
    @TableField(exist = false)
    private String selected;

    @ApiModelProperty("是否启用配置[0否,1是]")
    @TableField("enable_config")
    private Integer enableConfig;

    @ApiModelProperty("允许物料名称重复[NY]")
    @TableField("allow_material_name_repeat")
    private String allowMaterialNameRepeat;
    @ApiModelProperty("允许物料规格型号重复[NY]")
    @TableField("allow_material_specs_repeat")
    private String allowMaterialSpecsRepeat;
    @ApiModelProperty("允许物料名称+规格重复[NY]")
    @TableField("allow_name_plus_specs_repeat")
    private String allowNamePlusSpecsRepeat;
}
