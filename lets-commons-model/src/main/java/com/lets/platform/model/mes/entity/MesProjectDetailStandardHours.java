package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 项目额定负荷表
 * </p>
 *
 * @author FZY
 * @since 2024-07-15
 */
@Getter
@Setter
@TableName("mes_project_detail_standard_hours")
@ApiModel(value = "MesProjectDetailStandardHours对象", description = "项目额定负荷表")
public class MesProjectDetailStandardHours extends MesStandardHours {

    @ApiModelProperty("每周工作天数")
    @TableField("work_days")
    private Integer workDays;

    @ApiModelProperty("项目ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("项目明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
}
