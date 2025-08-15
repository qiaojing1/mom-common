package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.enums.ConditionExpressionEnum;
import com.lets.platform.common.pojo.tools.JsonColSerializer;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.whereBuild.Where;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author DING WEI
 * @since 2023-04-26
 */
@Getter
@Setter
@TableName("common_dict")
@ApiModel(value = "CommonDict对象", description = "字典表")
public class CommonDict extends BaseEntity {

    @NotBlank(message = "CommonDict.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    @Where(value = ConditionExpressionEnum.LIKE, column = "code")
    private String code;

    @NotBlank(message = "CommonDict.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    @Where(value = ConditionExpressionEnum.LIKE, column = "name")
    private String name;

    @NotBlank(message = "CommonDict.value", groups = {Save.class, Update.class})
    @ApiModelProperty("值")
    @TableField("value")
    private String value;

    @JsonSerialize(using = JsonColSerializer.class)
    @TableField("json_value")
    private String jsonValue;

    @TableField("extra_value")
    private String extraValue;

    @ApiModelProperty("标识名称")
    @TableField("sign_name")
    @Where(value = ConditionExpressionEnum.LIKE, column = "sign_name")
    private String signName;

    @ApiModelProperty("标识编码")
    @TableField("sign_code")
    @Where(value = ConditionExpressionEnum.LIKE, column = "sign_code")
    private String signCode;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    @Where(value = ConditionExpressionEnum.EQUALS, column = "deleted")
    private String deleted;

    @ApiModelProperty("状态 0:禁用 1:启用")
    @TableField("status")
    @Where(value = ConditionExpressionEnum.EQUALS, column = "status")
    private String status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
    @ApiModelProperty("颜色")
    @TableField("color")
    private String color;
    @ApiModelProperty("是否默认 Y是 N否")
    @TableField("default_selected")
    private String defaultSelected;

    @TableField(exist = false)
    private Long size = 10L;

    @TableField(exist = false)
    private Long current = 1L;
}
