package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 报表
 * </p>
 *
 * @author qiao jing
 * @since 2024-03-13
 */
@Getter
@Setter
@TableName("common_report_button")
@ApiModel(value = "CommonReportButton对象", description = "报表按钮")
public class CommonReportButton {
    private String id;
    @ApiModelProperty("编码")
    @TableField("report_id")
    private String reportId;

    @ApiModelProperty("按钮")
    @TableField("button")
    private String button;



}
