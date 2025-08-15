package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * 生产工单导入表头数据
 * @author DING WEI
 * @date 2025/5/4 8:44
 * @version 1.0
 */
@Data
public class ProduceOrderExcel {

    @ColumnWidth(30)
    @ExcelProperty(value = "单据编号", index = 0)
    private String code;

    @ColumnWidth(40)
    @ExcelProperty(value = "单据类别", index = 1)
    private String orderCategoryName;

    @ColumnWidth(30)
    @ExcelProperty(value = "单据日期", index = 2)
    private String orderTimeFormat;

    @ColumnWidth(30)
    @ExcelProperty(value = "供应商", index = 3)
    private String supplierName;

    @ColumnWidth(30)
    @ExcelProperty(value = "备注", index = 4)
    private String remark;

}
