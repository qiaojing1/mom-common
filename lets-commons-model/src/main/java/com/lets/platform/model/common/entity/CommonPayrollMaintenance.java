package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 工资表维护主表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-25
 */
@Getter
@Setter
@TableName("common_payroll_maintenance")
@ApiModel(value = "CommonPayrollMaintenance对象", description = "工资表维护主表")
public class CommonPayrollMaintenance extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("年份")
    @TableField("year_num")
    private Integer yearNum;

    @ApiModelProperty("月份")
    @TableField("month_num")
    private Integer monthNum;

    @ApiModelProperty("员工数")
    @TableField("employees_num")
    private Integer employeesNum;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("工资详情")
    @TableField(exist = false)
    private List<CommonPayrollMaintenanceDetail> details;
}
