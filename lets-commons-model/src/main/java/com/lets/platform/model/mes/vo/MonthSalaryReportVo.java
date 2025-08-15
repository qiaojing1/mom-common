package com.lets.platform.model.mes.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author zhangweiyan
 * @ClassName MonthSalaryReportVo
 * @Description 月度工资报表
 * @Date 2025/5/29 09:07
 **/
@Getter
@Setter
@ApiModel("月度工资报表")
public class MonthSalaryReportVo {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("月份")
    private String month;

    @ApiModelProperty("员工")
    private String userId;

    @ApiModelProperty("员工")
    private String userName;

    @ApiModelProperty("账号")
    private String loginId;

    @ApiModelProperty("部门")
    private String orgId;

    @ApiModelProperty("部门")
    private String orgName;

    @ApiModelProperty("生产单元")
    private String productUnitId;

    @ApiModelProperty("生产单元")
    private String productUnitName;

    @ApiModelProperty("完工数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal finishedNumber;

    @ApiModelProperty("合格数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal qualifiedNumber;

    @ApiModelProperty("报废数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal scrapNumber;

    @ApiModelProperty("返修数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal repairNumber;

    @ApiModelProperty("不良数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal poorNumber;

    @ApiModelProperty("工时合计")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalManHours;

    @ApiModelProperty("工资合计")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal totalSalary;
}
