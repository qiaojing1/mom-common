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
 * 质量追溯方案适用客户范围
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-05-30
 */
@Getter
@Setter
@TableName("mes_quality_trace_customer")
@ApiModel(value = "MesQualityTraceCustomer对象", description = "质量追溯方案适用客户范围")
public class MesQualityTraceCustomer extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("客户idor客户分组组id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("客户编码or客户分组组编码")
    @TableField("target_code")
    private String targetCode;

    @ApiModelProperty("客户名称or客户分组组名称")
    @TableField("target_name")
    private String targetName;

    @ApiModelProperty("当前类型，0表示当前是客户，1表示当前是客户分组组")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private Integer lineNumber;
}
