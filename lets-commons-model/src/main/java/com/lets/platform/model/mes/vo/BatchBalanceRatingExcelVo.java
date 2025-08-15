package com.lets.platform.model.mes.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * 批号产品平衡率 导出对象
 * @author: DING WEI
 * @date: 2024/3/5 13:49
 */
@Data
public class BatchBalanceRatingExcelVo {

    @ColumnWidth(20)
    @ExcelProperty("物料号")
    private String materialCode;
    @ColumnWidth(20)
    @ExcelProperty("物料名称")
    private String materialName;
    @ColumnWidth(20)
    @ExcelProperty("规格型号")
    private String materialSpecs;

    @ColumnWidth(25)
    @ExcelProperty("产线平衡率")
    private String productionLineBalanceRate;
    @ColumnWidth(25)
    @ExcelProperty("产线损失率")
    private String productionLineLossRate;
    @ColumnWidth(35)
    @ExcelProperty("产线每小时产能(pcs/h)")
    private String productionLineCapacityHourly;
    @ColumnWidth(20)
    @ExcelProperty("瓶颈工序")
    private String bottleneckProcess;
    @ColumnWidth(25)
    @ExcelProperty("瓶颈工时(min)")
    private String bottleneckTime;

    @ColumnWidth(20)
    @ExcelProperty("工序编码")
    private String processCode;
    @ColumnWidth(20)
    @ExcelProperty("工序名称")
    private String processName;
    @ColumnWidth(20)
    @ExcelProperty("设备编码")
    private String deviceCode;
    @ColumnWidth(20)
    @ExcelProperty("设备名称")
    private String deviceName;
    @ColumnWidth(25)
    @ExcelProperty("标准工时(min)")
    private String standardTime;
    @ColumnWidth(25)
    @ExcelProperty("标准产能(pcs/h)")
    private String standardCapacity;
    @ColumnWidth(25)
    @ExcelProperty("实际工时(min)")
    private String realityTime;
    @ColumnWidth(25)
    @ExcelProperty("实际产能(pcs/h)")
    private String realityCapacity;
    @ColumnWidth(25)
    @ExcelProperty("工时差值(min)")
    private String diffTime;
    @ColumnWidth(25)
    @ExcelProperty("设备利用率(%)")
    private String deviceUtilizationRate;

}
