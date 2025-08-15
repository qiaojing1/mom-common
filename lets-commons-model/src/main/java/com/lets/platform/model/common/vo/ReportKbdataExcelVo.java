package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.lets.commons.easyexcel.entity.ExcelName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 大屏数据表
 * @author wangjx
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据反参")
public class ReportKbdataExcelVo {

    @ColumnWidth(10)
    @ExcelProperty(value  = "大屏名称")
    @ExcelName(names = {"大屏名称","Large screen name","大画面名"})
    private String name;


    @ColumnWidth(50)
    @ExcelProperty(value  = "大屏地址")
    @ExcelName(names = {"大屏地址","Large screen address","大画面アドレス"})
    private String url;


}
