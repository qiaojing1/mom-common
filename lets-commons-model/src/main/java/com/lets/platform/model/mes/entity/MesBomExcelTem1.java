package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * BOM导入对象
 * @author: DING WEI
 * @date: 2023/11/8 17:15
 */
@Data
public class MesBomExcelTem1 {

    @ColumnWidth(30)
    @ExcelProperty(value = "BOM编码", index = 0)
    private String code;

    @ColumnWidth(30)
    @ExcelProperty(value = "BOM类型", index = 1)
    private String typeName;

    @ColumnWidth(30)
    @ExcelProperty(value = "BOM分组", index = 2)
    private String groupName;

    @ExcelIgnore
    private String materialId;

    @ColumnWidth(30)
    @ExcelProperty(value = "产品编码", index = 3)
    private String materialCode;

    @ColumnWidth(30)
    @ExcelProperty(value = "产品名称", index = 4)
    private String materialName;

    @ColumnWidth(30)
    @ExcelProperty(value = "规格型号", index = 5)
    private String materialSpecs;

    @ColumnWidth(30)
    @ExcelProperty(value = "成品率", index = 6)
    private String finishProductRate;

}
