package com.lets.platform.model.psi.entity;

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
 * 计划方案明细
 * </p>
 *
 * @author FZY
 * @since 2025-02-07
 */
@Getter
@Setter
@TableName("psi_plan_program_detail")
@ApiModel(value = "PsiPlanProgramDetail对象", description = "计划方案明细")
public class PsiPlanProgramDetail extends BaseEntity {

    @ApiModelProperty("方案ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("类型[0:运算范围;1:供应范围;2:仓库范围]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("值")
    @TableField("value")
    private String value;
}
