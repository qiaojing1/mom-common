package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 空压机台账导入模板
 * @author DING WEI
 * @since 2023-10-30
 */
@Data
@ApiModel("空压机台账导入模板")
public class CommonDeviceExport4Air {

    @ColumnWidth(40)
    @ExcelProperty("空压机名称")
    private String name;

    @ColumnWidth(40)
    @ExcelProperty("空压机编码")
    private String code;

    @ColumnWidth(40)
    @ExcelProperty("资产编码")
    private String assetsCode;

    @ColumnWidth(40)
    @ExcelProperty("空压机类型")
    private String typeName;

    @ColumnWidth(40)
    @ExcelProperty("空压机型号")
    private String modelName;

    @ColumnWidth(40)
    @ExcelProperty("空压机分组")
    private String groupName;

    @ColumnWidth(40)
    @ExcelProperty("物联状态")
    private String internetStatusName;

    @ColumnWidth(40)
    @ExcelProperty("空压机供应商")
    private String supplierName;

    @ColumnWidth(40)
    @ExcelProperty("安装位置")
    private String installAddress;

    @ColumnWidth(40)
    @ExcelProperty("备注")
    private String remark;

}
