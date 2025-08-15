package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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
@TableName("mes_project_detail_supplement_standard_hours")
@ApiModel(value = "MesProjectDetailSupplementStandardHours对象", description = "项目额定负荷表")
public class MesProjectDetailSupplementStandardHours extends BaseEntity {

    @ApiModelProperty("项目ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("项目明细ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("工作内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("增补工时数")
    @TableField("hours")
    private Integer hours;

    @ApiModelProperty("增补原因")
    @TableField("reason")
    private String reason;

    @ApiModelProperty("发生日期")
    @TableField("date")
    private LocalDate date;

    @ApiModelProperty("责任方ID")
    @TableField("org_id")
    private String orgId;

    @ApiModelProperty("责任方名称")
    @TableField("org_name")
    private String orgName;
}
