package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 产品档案方案明细
 * </p>
 *
 * @author FZY
 * @since 2024-11-26
 */
@Getter
@Setter
@TableName("mes_production_archive_scheme_detail")
@ApiModel(value = "MesProductionArchiveSchemeDetail对象", description = "产品档案方案明细")
public class MesProductionArchiveSchemeDetail extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("参数编码")
    @TableField("param_code")
    private String paramCode;

    @ApiModelProperty("参数名称")
    @TableField("param_name")
    private String paramName;

    @ApiModelProperty("功能来源CODE")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("功能来源名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("单据类别id")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("值来源 0:手动录入 1:数据匹配")
    @TableField("source_type")
    private Integer sourceType;

    @ApiModelProperty("值类型 0:字符型 1:数字型 2:布尔型")
    @TableField("value_type")
    private Integer valueType;

    @ApiModelProperty("必填")
    @TableField("required")
    private Integer required;

    @ApiModelProperty("匹配字段")
    @TableField("field")
    private String field;

    @ApiModelProperty("匹配规则")
    @TableField("rule")
    private String rule;

    @ApiModelProperty("缺省值")
    @TableField("default_value")
    private String defaultValue;
}
