package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.lets.commons.easyexcel.entity.ExcelName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 工序定义Excel
 */
@Data
@ApiModel("工序定义反参")
public class ProcessExcelVo {

    @ExcelIgnore
    private Integer order;

    @ColumnWidth(20)
    @ExcelProperty(value = "工序编码")
    @ExcelName(names={"工序编码","Operation Code","プロセスコーディング"})
    private String code;
    @ColumnWidth(20)
    @ExcelProperty(value = "工序名称")
    @ExcelName(names={"工序名称","Process name","工程名"})
    private String name;
    @ColumnWidth(20)
    @ExcelProperty(value = "准备时长(min)")
    @ExcelName(names={"准备时长(min)","Preparation time (min)","準備時間（min）"})
    private String readyDuration;
    @ColumnWidth(20)
    @ExcelProperty(value = "标准工时(min)")
    @ExcelName(names={"标准工时(min)","Standard hours (min)","標準工数（min）"})
    private String standardDuration;

    @ExcelIgnore
    private String reportWay;
    @ColumnWidth(20)
    @ExcelProperty(value = "报工方式")
    @ExcelName(names={"报工方式","Method of report for work","こうしんほうしき"})
    private String reportWayName;

    @ExcelIgnore
    private String checkStandard;
    @ColumnWidth(20)
    @ExcelProperty(value = "质检标准编码")
    @ExcelName(names={"质检标准编码","Quality Standard Code","品質検査標準コード"})
    private String checkStandardCode;

    @ExcelIgnore
    private String status;
    @ColumnWidth(20)
    @ExcelProperty(value = "状态")
    @ExcelName(names={"状态","status","ステータス"})
    private String statusName;

}
