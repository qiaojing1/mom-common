package com.lets.platform.model.collection.vo.energy;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 能源计划报表 展示对象2
 * @author: DING WEI
 * @date: 2025/2/21 13:51
 */
@Data
@ApiModel("能源计划报表 展示对象2")
public class EnergyPlanAnalysisReportVo2 {

    @ExcelIgnore
    @ApiModelProperty("月份")
    private Integer month;

    @ColumnWidth(10)
    @ExcelProperty("月份")
    @ApiModelProperty("月份")
    private String monthName;

    @ColumnWidth(30)
    @ExcelProperty("计划用量(m³)")
    private String planAmountFormat;
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划用量")
    private BigDecimal planAmount;

    @ColumnWidth(30)
    @ExcelProperty("实际用量(m³)")
    private String actualAmountFormat;
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际用量")
    private BigDecimal actualAmount;

    @ColumnWidth(30)
    @ExcelProperty("用量差值(m³)")
    private String diffAmountFormat;
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("用量差值")
    private BigDecimal diffAmount;

    @ColumnWidth(30)
    @ExcelProperty("计划金额(元)")
    private String planPriceFormat;
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计划金额")
    private BigDecimal planPrice;

    @ColumnWidth(30)
    @ExcelProperty("实际金额(元)")
    private String actualPriceFormat;
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("实际金额")
    private BigDecimal actualPrice;

    @ColumnWidth(30)
    @ExcelProperty("金额差值(元)")
    private String diffPriceFormat;
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("金额差值")
    private BigDecimal diffPrice;

}
