package com.lets.platform.model.common.entity;

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
 * 公式关联小类详情
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-14
 */
@Getter
@Setter
@TableName("common_formula_detail")
@ApiModel(value = "CommonFormulaDetail对象", description = "公式关联小类详情")
public class CommonFormulaDetail extends BaseEntity {

    @ApiModelProperty("公式id")
    @TableField("formula_id")
    private String formulaId;

    @ApiModelProperty("状态小类id")
    @TableField("device_status_id")
    private String deviceStatusId;

    @ApiModelProperty("状态大类编码")
    @TableField(exist = false)
    private String parentCode;

    @TableField(exist = false)
    private String name;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("优先级，越小优先级越高")
    @TableField("priority")
    private Integer priority;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;
}
