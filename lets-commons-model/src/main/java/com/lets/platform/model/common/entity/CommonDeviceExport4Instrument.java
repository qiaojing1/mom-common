package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 仪表台账导入模板
 * @author DING WEI
 * @since 2023-10-30
 */
@Data
@ApiModel("仪表台账导入模板")
public class CommonDeviceExport4Instrument {

    @ColumnWidth(40)
    @ExcelProperty("仪表名称")
    private String name;

    @ColumnWidth(40)
    @ExcelProperty("仪表编码")
    private String code;

    @ColumnWidth(40)
    @ExcelProperty("资产编码")
    private String assetsCode;

    @ColumnWidth(40)
    @ExcelProperty("仪表类型")
    private String typeName;

    @ColumnWidth(40)
    @ExcelProperty("仪表型号")
    private String modelName;

    @ColumnWidth(40)
    @ExcelProperty("是否总表")
    private String totalPowerName;

    @ColumnWidth(40)
    @ExcelProperty("物联状态")
    private String internetStatusName;

    @ColumnWidth(40)
    @ExcelProperty("所属节点")
    private String nodeName;

    @ColumnWidth(40)
    @ExcelProperty("仪表数据来源")
    private String dataSourceName;

    @ColumnWidth(40)
    @ExcelProperty("仪表量程")
    private String meterRange;

    @ColumnWidth(40)
    @ExcelProperty("仪表倍率")
    private String magnification;

    @ColumnWidth(40)
    @ExcelProperty("仪表供应商")
    private String supplierName;

    @ColumnWidth(40)
    @ExcelProperty("安装位置")
    private String installAddress;

    @ColumnWidth(40)
    @ExcelProperty("备注")
    private String remark;

}
