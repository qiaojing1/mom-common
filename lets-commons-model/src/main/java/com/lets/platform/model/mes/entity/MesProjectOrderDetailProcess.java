package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 项目汇总明细表
 * </p>
 *
 * @author FZY
 * @since 2024-07-10
 */
@Getter
@Setter
@TableName("mes_project_order_detail_process")
@ApiModel(value = "MesProjectOrderDetailProcess对象", description = "项目汇总明细表")
public class MesProjectOrderDetailProcess extends BaseEntity {

    @ApiModelProperty("项目汇总ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("项目汇总明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("系统ID")
    @TableField("group_id")
    private String groupId;

    @ApiModelProperty("系统名称")
    @TableField("group_name")
    private String groupName;

    @ApiModelProperty("任务类型")
    @TableField("group_type")
    private String groupType;

    @TableField(exist = false)
    private String groupTypeName;

    @ApiModelProperty("工序编号")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("工序编号")
    @TableField("process_code")
    private String processCode;

    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("额定工时")
    @TableField("standard_hours")
    private Integer standardHours;

    @TableField("is_selected")
    private int isSelected;
}

