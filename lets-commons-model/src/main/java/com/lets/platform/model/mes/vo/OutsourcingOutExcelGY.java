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
public class OutsourcingOutExcelGY {

    @ExcelIgnore
    private Integer index;

    @ExcelProperty("单据日期")
    private String orderDate;
    @ExcelProperty("单据编码")
    private String code;
    @ExcelProperty("单据类别")
    private String orderCategoryName;
    @ExcelProperty("工序名称")
    private String processName;
    @ExcelProperty("工序顺序")
    private String processStep;
    @ExcelProperty("数量")
    private String number;
    @ExcelProperty("单价")
    private String price;
    @ExcelProperty("批号")
    private String batchNumber;
    @ExcelProperty("供应商")
    private String supplierName;

    @ExcelIgnore
    private String materialId;
    @ExcelIgnore
    private String processPlanDetailId;
}
