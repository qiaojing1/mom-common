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
@TableName("jimu_report_db_field")
@ApiModel(value = "JimuReportDbField对象", description = "")
public class JimuReportDbField extends BaseEntity{
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;
    @ApiModelProperty("创建人登录名称")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("更新人登录名称")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("数据源ID")
    @TableField("jimu_report_db_id")
    private String jimuReportDbId;

    @ApiModelProperty("字段名")
    @TableField("field_name")
    private String fieldName;

    @ApiModelProperty("字段文本")
    @TableField("field_text")
    private String fieldText;

    @ApiModelProperty("控件类型")
    @TableField("widget_type")
    private String widgetType;

    @ApiModelProperty("控件宽度")
    @TableField("widget_width")
    private Integer widgetWidth;

    @ApiModelProperty("排序")
    @TableField("order_num")
    private Integer orderNum;

    @ApiModelProperty("查询标识0否1是 默认0")
    @TableField("search_flag")
    private Integer searchFlag;

    @ApiModelProperty("查询模式1简单2范围")
    @TableField("search_mode")
    private Integer searchMode;

    @ApiModelProperty("字典编码支持从表中取数据")
    @TableField("dict_code")
    private String dictCode;

    @ApiModelProperty("查询默认值")
    @TableField("search_value")
    private String searchValue;

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
