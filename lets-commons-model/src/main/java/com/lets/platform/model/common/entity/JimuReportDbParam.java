package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author qiaojing
 * @since 2024-04-07
 */
@Getter
@Setter
@TableName("jimu_report_db_param")
@ApiModel(value = "JimuReportDbParam对象", description = "")
public class JimuReportDbParam extends BaseEntity{
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;
    @ApiModelProperty("动态报表ID")
    @TableField("jimu_report_head_id")
    private String jimuReportHeadId;

    @ApiModelProperty("参数字段")
    @TableField("param_name")
    private String paramName;

    @ApiModelProperty("参数文本")
    @TableField("param_txt")
    private String paramTxt;

    @ApiModelProperty("参数默认值")
    @TableField("param_value")
    private String paramValue;

    @ApiModelProperty("排序")
    @TableField("order_num")
    private Integer orderNum;

    @ApiModelProperty("创建人登录名称")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("更新人登录名称")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("查询标识0否1是 默认0")
    @TableField("search_flag")
    private Integer searchFlag;

    @ApiModelProperty("查询控件类型")
    @TableField("widget_type")
    private String widgetType;

    @ApiModelProperty("查询模式1简单2范围")
    @TableField("search_mode")
    private Integer searchMode;

    @ApiModelProperty("字典")
    @TableField("dict_code")
    private String dictCode;

    @ApiModelProperty("查询时间格式化表达式")
    @TableField("search_format")
    private String searchFormat;

    @ApiModelProperty("参数配置")
    @TableField("ext_json")
    private String extJson;
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
}
