package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 工艺路线-工序信息-导入对象
 * @author: DING WEI
 * @date: 2024/9/24 14:49
 */
@Data
@ApiModel("工艺路线-工序信息-导入对象")
public class CommonRouteProcessExcelVo {

    @ColumnWidth(40)
    @ExcelProperty(value = "工艺路线编码", index = 0)
    private String routeCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "工序号", index = 1)
    private String processNo;

    @ColumnWidth(40)
    @ExcelProperty(value = "工序名称", index = 2)
    private String processName;

    @ColumnWidth(40)
    @ExcelProperty(value = "工序类型", index = 3)
    private String processTypeName;

    @ColumnWidth(40)
    @ExcelProperty(value = "生产单元", index = 4)
    private String factoryModeName;

//    @ColumnWidth(40)
//    @ExcelProperty("工序单位编码")
//    private String processUnitCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "基本批量", index = 5)
    private String basicBatchSize;

    @ColumnWidth(40)
    @ExcelProperty(value = "工时（分钟）", index = 6)
    private String standardTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "工时单价", index = 7)
    private String hourPrice;

    @ColumnWidth(40)
    @ExcelProperty(value = "标准产能", index = 8)
    private String standardCapacity;
    @ColumnWidth(40)
    @ExcelProperty(value = "标准产能单位", index = 9)
    private String standardCapacityUnitName;

    @ColumnWidth(40)
    @ExcelProperty(value = "计件工资", index = 10)
    private String workPrice;

    @ColumnWidth(40)
    @ExcelProperty(value = "委外单价", index = 11)
    private String outsourcePrice;

    @ColumnWidth(40)
    @ExcelProperty(value = "WIP物料编码", index = 12)
    private String wipMaterialCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "WIP仓库", index = 13)
    private String wipStoreName;

    @ColumnWidth(40)
    @ExcelProperty(value = "准备活动基本量（分钟）", index = 14)
    private String prepareActionTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "加工活动基本量（分钟）", index = 15)
    private String processActionTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "拆卸活动基本量（分钟）", index = 16)
    private String dismantleActionTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "标准排队时间（分钟）", index = 17)
    private String queueTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "标准等待时间（分钟）", index = 18)
    private String waitTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "标准移动时间（分钟）", index = 19)
    private String moveTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "拆卸同时等待", index = 20)
    private String waitOnDismantle;

    @ColumnWidth(40)
    @ExcelProperty(value = "工序迭代", index = 21)
    private String processIterate;

    @ColumnWidth(40)
    @ExcelProperty(value = "迭代最小时间（分钟）", index = 22)
    private String iterateMinTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "迭代批量", index = 23)
    private String iterateBatchNumber;

    @ColumnWidth(40)
    @ExcelProperty(value = "委外提前期（天）", index = 24)
    private String outSourceAdvanceDay;

    @ColumnWidth(40)
    @ExcelProperty(value = "计件公式", index = 25)
    private String formula;


    @ColumnWidth(40)
    @ExcelProperty(value = "连续委外", index = 26)
    private String series;

    @ColumnWidth(40)
    @ExcelProperty(value = "启用汇报顺序控制", index = 27)
    private String reportOrderly;

    @ColumnWidth(30)
    @ExcelProperty(value = "委外工序检验", index = 28)
    private String outsourcingInspectTypeName;

    @ColumnWidth(20)
    @ExcelProperty(value = "默认供应商", index = 29)
    private String defaultSupplierName;

    @ColumnWidth(50)
    @ExcelProperty(value = "备注", index = 30)
    private String remark;
}
