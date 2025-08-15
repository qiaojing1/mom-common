/*
 * csy
 */

package com.lets.platform.model.mes.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName ProdduceOrderImportGY
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2025/5/8
 */
@Data
public class ProcessReportExcelGY {

    @ExcelIgnore
    private Integer index;

    @ExcelProperty("单据类别")
    private String orderCategoryName;
    @ExcelProperty("工序名称")
    private String processName;
    @ExcelProperty("工序顺序")
    private String processStep;
    @ExcelProperty("数量")
    private String number;
    @ExcelProperty("批号")
    private String batchNumber;
    @ExcelProperty("工位机编码")
    private String hmiCode;
    @ExcelProperty("操作工")
    private String operatorName;
}
