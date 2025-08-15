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
 * 检验方案配置工序分组范围表
 * </p>
 *
 * @author FZY
 * @since 2024-01-06
 */
@Getter
@Setter
@TableName("inspect_plan_config_process_group")
@ApiModel(value = "InspectPlanConfigProcessGroup对象", description = "检验方案配置工序分组范围表")
public class InspectPlanConfigProcessGroup extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("工序分组主键")
    @TableField("process_group_id")
    private String processGroupId;

    @ApiModelProperty("工序分组编码")
    @TableField("process_group_code")
    private String processGroupCode;

    @ApiModelProperty("工序分组名称")
    @TableField("process_group_name")
    private String processGroupName;
}
