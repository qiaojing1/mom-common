package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * <p>
 * 超链接配置表
 * </p>
 *
 * @author qiaojing
 * @since 2024-04-07
 */
@Getter
@Setter
@TableName("jimu_report_link")
@ApiModel(value = "JimuReportLink对象", description = "超链接配置表")
public class JimuReportLink extends BaseEntity{
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;
    @ApiModelProperty("设计器id")
    @TableField("report_id")
    private String reportId;

    @ApiModelProperty("参数")
    @TableField("parameter")
    private String parameter;

    @ApiModelProperty("弹出方式（0 当前页面 1 新窗口）")
    @TableField("eject_type")
    private String ejectType;

    @ApiModelProperty("链接名称")
    @TableField("link_name")
    private String linkName;

    @ApiModelProperty("请求方法0-get,1-post")
    @TableField("api_method")
    private String apiMethod;

    @ApiModelProperty("链接方式(0 网络报表 1 网络连接 2 图表联动)")
    @TableField("link_type")
    private String linkType;

    @ApiModelProperty("外网api")
    @TableField("api_url")
    private String apiUrl;

    @ApiModelProperty("联动图表的ID")
    @TableField("link_chart_id")
    private String linkChartId;

    @ApiModelProperty("表达式")
    @TableField("expression")
    private String expression;

    @ApiModelProperty("条件")
    @TableField("requirement")
    private String requirement;
    @TableField(exist = false)
    private String tenancyId;
    @TableField(exist = false)
    private String createUser;
    @TableField(exist = false)
    private String createUserName;
    @TableField(exist = false)
    private String updateUser;
    @TableField(exist = false)
    private String updateUserName;
    @TableField(exist = false)
    private LocalDateTime updateTime;
    @TableField(exist = false)
    private LocalDateTime createTime;
}
