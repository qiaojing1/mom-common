package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 用户数据字典
 * @author DING WEI
 * @since 2023-07-13
 */
@Getter
@Setter
@TableName("common_user_dict")
@ApiModel(value = "CommonUserDict对象", description = "用户数据字典")
public class CommonUserDict extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(25)
    @ExcelProperty("字典项编码")
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ColumnWidth(25)
    @ExcelProperty("字典项名称")
    @ApiModelProperty("名称")
    @TableField("name")
    @Length(min = 1, max = 100, message = "CommonUserDict.name", groups = {Save.class, Update.class})
    private String name;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("展示名称(树形)")
    private String label;

    @ExcelIgnore
    @ApiModelProperty("字典分组")
    @TableField("parent_code")
    @NotBlank(message = "CommonUserDict.ParentCode.NotBlank", groups = {Save.class, Update.class})
    private String parentCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String grandParentCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String parentId;
    @ColumnWidth(20)
    @ExcelProperty("字典分组")
    @TableField(exist = false)
    private String parentName;

    @ExcelIgnore
    @ApiModelProperty("是否默认[N否Y是]")
    @TableField("is_default")
    @ValidatedEnum(enumClass = YesOrNo.class, message = "CommonUserDict.isDefault", groups = {Save.class, Update.class})
    private String isDefault;
    @ColumnWidth(20)
    @ExcelProperty("是否默认")
    @TableField(exist = false)
    private String isDefaultName;

    @ExcelProperty("所属字典项")
    @ApiModelProperty(value = "所属字典项名称", hidden = true)
    @ColumnWidth(20)
    @TableField("relation_dict_name")
    private String relationDictName;

    @ExcelProperty("字典项代号")
    @ApiModelProperty(value = "字典项代号")
    @TableField("dict_mark")
    @ColumnWidth(20)
    private String dictMark;

    @ExcelIgnore
    @ColumnWidth(20)
    @ApiModelProperty(value = "启用特殊标识 0禁用1启用")
    @TableField("special_mark")
    private Integer specialMark;

    @ExcelProperty("启用特殊标识")
    @ColumnWidth(20)
    @ApiModelProperty(value = "启用特殊标识 0禁用1启用")
    @TableField(exist = false)
    private String specialMarkString;

    @ExcelProperty("标识类型")
    @ColumnWidth(20)
    @ApiModelProperty(value = "标识类型 1上标 2下标")
    @TableField("mark_type")
    private String markType;
    @ExcelProperty("标识代号")
    @ColumnWidth(20)
    @ApiModelProperty(value = "标识代号")
    @TableField("mark_code")
    private String markCode;
    @ExcelIgnore
    @ApiModelProperty(value = "完整标识(上标用<sup>下标用<sub>")
    @TableField("mark_notes")
    private String markNotes;


    @ColumnWidth(40)
    @ExcelProperty("描述")
    @ApiModelProperty("描述")
    @TableField("description")
    @Length(max = 40, message = "CommonUserDict.description", groups = {Save.class, Update.class})
    private String description;

    @ExcelIgnore
    @ApiModelProperty("是否预设[N否Y是]")
    @TableField("is_presets")
    private String isPresets;
    @ExcelIgnore
    @TableField(exist = false)
    private String isPresetsName;

    @ExcelIgnore
    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ExcelIgnore
    @ApiModelProperty(value = "数据类型[1字典分组2字典数据]", hidden = true)
    @TableField("type")
    private String type;

    @ExcelIgnore
    @ApiModelProperty(value = "物料适用分组主键", hidden = true)
    @TableField("material_group_id")
    private String materialGroupId;
    @ExcelIgnore
    @ApiModelProperty(value = "物料分组主键集合")
    @TableField(exist = false)
    private List<String> materialGroupIds;
    @ExcelIgnore
    @ApiModelProperty(value = "物料适用分组名称", hidden = true)
    @TableField("material_group_name")
    private String materialGroupName;
    @ExcelIgnore
    @ApiModelProperty(value = "物料分组名称集合")
    @TableField(exist = false)
    private List<String> materialGroupNames;

    @ExcelIgnore
    @ApiModelProperty(value = "关联分组主键", hidden = true)
    @TableField("relation_group_id")
    private String relationGroupId;
    @ExcelIgnore
    @ApiModelProperty(value = "关联分组主键集合")
    @TableField(exist = false)
    private List<String> relationGroupIds;
    @ExcelIgnore
    @ApiModelProperty(value = "关联分组名称", hidden = true)
    @TableField("relation_group_name")
    private String relationGroupName;
    @ExcelIgnore
    @ApiModelProperty(value = "关联分组名称集合")
    @TableField(exist = false)
    private List<String> relationGroupNames;

    @ExcelIgnore
    @ApiModelProperty(value = "所属字典项主键", hidden = true)
    @TableField("relation_dict_code")
    private String relationDictCode;
    @ExcelIgnore
    @ApiModelProperty(value = "所属字典项主键集合")
    @TableField(exist = false)
    private List<String> relationDictCodes;

    @ExcelIgnore
    @ApiModelProperty(value = "所属字典项名称集合")
    @TableField(exist = false)
    private List<String> relationDictNames;

    @ApiModelProperty("分组默认值")
    @TableField(exist = false)
    @ExcelIgnore
    private String defaultCode;
    @TableField(exist = false)
    @ExcelIgnore
    private String defaultName;
    @TableField(exist = false)
    @ExcelIgnore
    private String defaultId;
    @TableField(exist = false)
    @ExcelIgnore
    private String defaultNotes;

    @ExcelIgnore
    @TableField(exist = false)
    private List<CommonUserDict> children;
}
