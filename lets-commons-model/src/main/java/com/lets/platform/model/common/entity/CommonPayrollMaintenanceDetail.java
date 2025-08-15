package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 工资表维护子表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-03-25
 */
@Getter
@Setter
@TableName("common_payroll_maintenance_detail")
@ApiModel(value = "CommonPayrollMaintenanceDetail对象", description = "工资表维护子表")
public class CommonPayrollMaintenanceDetail extends BaseEntity {

    @ApiModelProperty("主表id")
    @TableField("maintenance_id")
    @ExcelIgnore
    private String maintenanceId;

    @ApiModelProperty("工号")
    @TableField("code")
    @ExcelProperty("工号")
    private String code;

    @ApiModelProperty("员工姓名")
    @TableField("name")
    @ExcelIgnore
    private String name;

    @ApiModelProperty("工资")
    @TableField("payroll")
    @ExcelIgnore
    private BigDecimal payroll;

    @ApiModelProperty("工资")
    @TableField(exist = false)
    @ExcelProperty("工资")
    private String payrollStr;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelIgnore
    private String remark;
}
