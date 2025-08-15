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
@TableName("jimu_report_data_source")
@ApiModel(value = "JimuReportDataSource对象", description = "")
public class JimuReportDataSource extends BaseEntity{
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;
    @ApiModelProperty("数据源名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("报表_id")
    @TableField("report_id")
    private String reportId;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("数据库类型")
    @TableField("db_type")
    private String dbType;

    @ApiModelProperty("驱动类")
    @TableField("db_driver")
    private String dbDriver;

    @ApiModelProperty("数据源地址")
    @TableField("db_url")
    private String dbUrl;

    @ApiModelProperty("用户名")
    @TableField("db_username")
    private String dbUsername;

    @ApiModelProperty("密码")
    @TableField("db_password")
    private String dbPassword;

    @ApiModelProperty("创建人")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("更新人")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("连接失败次数")
    @TableField("connect_times")
    private Integer connectTimes;

    @ApiModelProperty("多租户标识")
    @TableField("tenant_id")
    private String tenantId;

    @ApiModelProperty("类型(report:报表;drag:仪表盘)")
    @TableField("type")
    private String type;
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
