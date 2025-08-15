package com.lets.platform.model.mes.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 生产作业单-导出对象
 * @author DING WEI
 * @since 2024-02-21
 */
@Data
@ApiModel(value = "生产作业单-导出对象", description = "生产作业单-导出对象")
public class MesProduceJobOrderExcelVo {

    @ExcelIgnore
    private Integer index;

    @ColumnWidth(40)
    @ExcelProperty("起始批号")
    private String firstBatchNumber;

    @ColumnWidth(40)
    @ExcelProperty("物料号")
    private String materialCode;

    @ColumnWidth(40)
    @ExcelProperty("图号")
    private String drawingNo;
    @ColumnWidth(40)
    @ExcelProperty("图纸版本")
    private String drawingVersion;

    @ColumnWidth(45)
    @ExcelProperty("作业单号")
    private String code;

    @ColumnWidth(40)
    @ExcelProperty("作业单日期")
    private String orderTimeFormat;
    @ExcelIgnore
    private LocalDateTime orderTime;

    @ColumnWidth(40)
    @ExcelProperty("工单数量")
    private String number;
}
