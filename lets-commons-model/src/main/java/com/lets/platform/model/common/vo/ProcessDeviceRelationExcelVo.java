package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.lets.commons.easyexcel.entity.ExcelName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 工序设备关联Excel
 */
@Data
@ApiModel("工序设备关联Excel")
public class ProcessDeviceRelationExcelVo {

    @ColumnWidth(20)
    @ExcelProperty(value = "设备编码")
    @ExcelName(names={"设备编码","Device Code","デバイスコーディング"})
    private String deviceCode;
    @ColumnWidth(20)
    @ExcelProperty(value = "设备名称")
    @ExcelName(names={"设备名称","Device Name","デバイス名"})
    private String deviceName;


}
