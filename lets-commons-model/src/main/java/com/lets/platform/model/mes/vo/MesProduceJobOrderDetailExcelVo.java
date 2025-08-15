package com.lets.platform.model.mes.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 生产作业单条码明细导入模版
 * @author DING WEI
 * @since 2024-02-21
 */
@Data
@ApiModel(value = "生产作业单条码明细导入模版", description = "生产作业单条码明细导入模版")
public class MesProduceJobOrderDetailExcelVo {

    @ExcelIgnore
    private Integer index;

    @ColumnWidth(40)
    @ExcelProperty("批号")
    private String batchNumber;

    @ColumnWidth(40)
    @ExcelProperty("物料号")
    private String materialCode;

    @ColumnWidth(40)
    @ExcelProperty("条码数量")
    private String number;

}
