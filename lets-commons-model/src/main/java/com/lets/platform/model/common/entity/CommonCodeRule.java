package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.tools.JsonColDeserializer;
import com.lets.platform.common.pojo.tools.JsonColSerializer;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;

/**
 * 编码规则配置
 * @author FZY
 * @since 2023-07-05
 */
@Getter
@Setter
@TableName("common_code_rule")
@ApiModel(value = "CommonCodeRule对象", description = "编码规则配置")
public class CommonCodeRule extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @Length(min = 1, max = 20, message = "[名称]长度1~20，输入：中文、字母、数字、字符", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单编码")
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("表名")
    @TableField("table_name")
    private String tableName;

    @ApiModelProperty("表中文名")
    @TableField(exist = false)
    private String tableDisplayName;

    @ApiModelProperty("目标字段")
    @TableField("field")
    private String field;

    @ApiModelProperty("目标字段名称")
    @TableField(exist = false)
    private String fieldName;

    @ApiModelProperty("字段长度")
    @TableField("length")
    private Integer length;

    @ApiModelProperty("编码预览")
    @TableField("code_view")
    private String codeView;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("是否启用名称")
    @TableField(exist = false)
    private String enableName;

    @JsonSerialize(using = JsonColSerializer.class)
    @JsonDeserialize(using = JsonColDeserializer.class)
    @ApiModelProperty(value = "物料分组主键", hidden = true)
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty(value = "物料分组主键集合")
    @TableField(exist = false)
    private List<String> materialGroupIds;

    @JsonSerialize(using = JsonColSerializer.class)
    @JsonDeserialize(using = JsonColDeserializer.class)
    @ApiModelProperty(value = "物料分组名称", hidden = true)
    @TableField("material_group_name")
    private String materialGroupName;
    @ApiModelProperty(value = "物料分组名称集合")
    @TableField(exist = false)
    private List<String> materialGroupNames;

    @JsonSerialize(using = JsonColSerializer.class)
    @JsonDeserialize(using = JsonColDeserializer.class)
    @ApiModelProperty(value = "单据类别主键", hidden = true)
    @TableField(value = "order_category_id",updateStrategy = FieldStrategy.IGNORED)
    private String orderCategoryId;

    @ApiModelProperty(value = "单据类别主键集合")
    @TableField(exist = false)
    private List<String> orderCategoryIds;

    @JsonSerialize(using = JsonColSerializer.class)
    @JsonDeserialize(using = JsonColDeserializer.class)
    @ApiModelProperty(value = "单据类别名称", hidden = true)
    @TableField(value = "order_category_name",updateStrategy = FieldStrategy.IGNORED)
    private String orderCategoryName;
    @ApiModelProperty(value = "单据类别名称集合")
    @TableField(exist = false)
    private List<String> orderCategoryNames;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<CommonCodeRuleDetail> details;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<CommonCodeRuleDetailSerialNumber> serialNumberList;

    @ApiModelProperty("规则目标字段集合")
    @TableField(exist = false)
    private List<String> fields;

}
