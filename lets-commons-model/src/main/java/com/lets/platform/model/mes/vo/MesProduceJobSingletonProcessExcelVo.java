package com.lets.platform.model.mes.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * 生产正向追溯-明细-导出对象
 * @author DING WEI
 * @since 2024-02-22
 */
@Getter
@Setter
@ApiModel(value = "生产正向追溯-明细-导出对象")
public class MesProduceJobSingletonProcessExcelVo {

    @ColumnWidth(40)
    @ExcelProperty("物料号")
    private String materialCode;

    @ColumnWidth(40)
    @ExcelProperty("物料名称")
    private String materialName;

    @ColumnWidth(40)
    @ExcelProperty("批号")
    private String batchNumber;

    @ColumnWidth(40)
    @ExcelProperty("图号")
    private String drawingNo;
    @ColumnWidth(40)
    @ExcelProperty("图纸版本")
    private String drawingVersion;
    @ColumnWidth(40)
    @ExcelProperty("作业单号")
    private String jobOrderCode;
    @ColumnWidth(40)
    @ExcelProperty("作业单日期")
    private String jobOrderTime;
    @ColumnWidth(40)
    @ExcelProperty("生产开始时间")
    private String productStartTime;
    @ColumnWidth(40)
    @ExcelProperty("生产结束时间")
    private String productEndTime;

    @ColumnWidth(40)
    @ExcelProperty("生产单元")
    private String factoryModeName;

    @ColumnWidth(40)
    @ExcelProperty("工序编码")
    private String processCode;
    @ColumnWidth(40)
    @ExcelProperty("工序名称")
    private String processName;

    @ColumnWidth(40)
    @ExcelProperty("操作人员")
    private String operatorUserName;

    @ColumnWidth(40)
    @ExcelProperty("设备编码")
    private String deviceCode;
    @ColumnWidth(40)
    @ExcelProperty("设备名称")
    private String deviceName;

    @ColumnWidth(40)
    @ExcelProperty("工序开始时间")
    private String startTime;
    @ColumnWidth(40)
    @ExcelProperty("加工开始时间")
    private String workStartTime;
    @ColumnWidth(40)
    @ExcelProperty("工序完成时间")
    private String endTime;

    @ColumnWidth(40)
    @ExcelProperty("工序时长(min)")
    private Long processDuration;
    @ColumnWidth(40)
    @ExcelProperty("上料时长(min)")
    private Long feedingDuration;
    @ColumnWidth(40)
    @ExcelProperty("加工时长(min)")
    private Long produceDuration;
    @ColumnWidth(40)
    @ExcelProperty("下料时长(min)")
    private Long blankingDuration;

    @ColumnWidth(40)
    @ExcelProperty("工序物料1")
    private String processMaterial1;
    @ColumnWidth(40)
    @ExcelProperty("物料1扫码时间")
    private String scanTime1;

    @ColumnWidth(40)
    @ExcelProperty("工序物料2")
    private String processMaterial2;
    @ColumnWidth(40)
    @ExcelProperty("物料2扫码时间")
    private String scanTime2;

    @ColumnWidth(40)
    @ExcelProperty("工序物料3")
    private String processMaterial3;
    @ColumnWidth(40)
    @ExcelProperty("物料3扫码时间")
    private String scanTime3;

    @ColumnWidth(40)
    @ExcelProperty("工序物料4")
    private String processMaterial4;
    @ColumnWidth(40)
    @ExcelProperty("物料4扫码时间")
    private String scanTime4;

    @ColumnWidth(40)
    @ExcelProperty("工序物料5")
    private String processMaterial5;
    @ColumnWidth(40)
    @ExcelProperty("物料5扫码时间")
    private String scanTime5;

    @ColumnWidth(40)
    @ExcelProperty("工序物料6")
    private String processMaterial6;
    @ColumnWidth(40)
    @ExcelProperty("物料6扫码时间")
    private String scanTime6;

    @ColumnWidth(40)
    @ExcelProperty("工序物料7")
    private String processMaterial7;
    @ColumnWidth(40)
    @ExcelProperty("物料7扫码时间")
    private String scanTime7;

    @ColumnWidth(40)
    @ExcelProperty("工序物料8")
    private String processMaterial8;
    @ColumnWidth(40)
    @ExcelProperty("物料8扫码时间")
    private String scanTime8;

    @ColumnWidth(40)
    @ExcelProperty("工序物料9")
    private String processMaterial9;
    @ColumnWidth(40)
    @ExcelProperty("物料9扫码时间")
    private String scanTime9;

    @ColumnWidth(40)
    @ExcelProperty("工序物料10")
    private String processMaterial10;
    @ColumnWidth(40)
    @ExcelProperty("物料10扫码时间")
    private String scanTime10;

}
