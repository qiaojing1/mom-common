package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * 生产工单导入明细数据
 * @author DING WEI
 * @date 2025/5/4 8:44
 * @version 1.0
 */
@Data
public class ProduceOrderDetailExcel {

    @ColumnWidth(30)
    @ExcelProperty(value = "单据编号", index = 0)
    private String code;

    @ColumnWidth(30)
    @ExcelProperty(value = "物料编码", index = 1)
    private String materialCode;

    @ColumnWidth(30)
    @ExcelProperty(value = "物料名称", index = 2)
    private String materialName;

    @ColumnWidth(30)
    @ExcelProperty(value = "规格型号", index = 3)
    private String materialSpecs;

    @ColumnWidth(30)
    @ExcelProperty(value = "生产单位", index = 4)
    private String produceUnitName;

    @ColumnWidth(30)
    @ExcelProperty(value = "数量", index = 5)
    private String number;

    @ColumnWidth(30)
    @ExcelProperty(value = "BOM版本", index = 6)
    private String bomVersion;

    @ColumnWidth(50)
    @ExcelProperty(value = "生产单元", index = 7)
    private String factoryModeName;

    @ColumnWidth(40)
    @ExcelProperty(value = "工艺路线", index = 8)
    private String routeName;

    @ColumnWidth(30)
    @ExcelProperty(value = "计划开工时间", index = 9)
    private String planStartTime;

    @ColumnWidth(30)
    @ExcelProperty(value = "计划完工时间", index = 10)
    private String planEndTime;

    @ColumnWidth(30)
    @ExcelProperty(value = "批号", index = 11)
    private String batchNumber;

}
