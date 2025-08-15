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
public class ProcessPlanImportGY {

    @ExcelIgnore
    private Integer index;

    @ExcelProperty("单据日期")
    private String orderTime;
    @ExcelProperty("单据编码")
    private String code;
    @ExcelProperty("单据类别")
    private String orderCategoryName;
    @ExcelProperty("工序名称")
    private String processName;
    @ExcelProperty("工序类型")
    private String processType;
    @ExcelProperty("工序顺序")
    private String processStep;
    @ExcelProperty("生产单元")
    private String productionName;
    @ExcelProperty("数量")
    private String number;
    @ExcelProperty("计件工资")
    private String wage;
    @ExcelProperty("单价")
    private String price;
    @ExcelProperty("批号")
    private String batchNumber;
}
