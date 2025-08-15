package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * Bom导入模板-明细
 * @author: DING WEI
 * @date: 2023/11/8 17:16
 */
@Data
public class MesBomExcelTem2 {

    @ColumnWidth(30)
    @ExcelProperty(value = "BOM编码", index = 0)
    private String bomCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "子项BOM版本号", index = 1)
    private String bomVersion;

    @ColumnWidth(30)
    @ExcelProperty(value = "子项物料编码", index = 2)
    private String materialCode;

    @ColumnWidth(30)
    @ExcelProperty(value = "子项物料名称", index = 3)
    private String materialName;

    @ColumnWidth(30)
    @ExcelProperty(value = "子项规格型号", index = 4)
    private String materialSpecs;

    @ColumnWidth(30)
    @ExcelProperty(value = "忽略断阶", index = 5)
    private String ignoreDisconnectName;

    @ColumnWidth(30)
    @ExcelProperty(value = "用量类型", index = 6)
    private String dosageTypeName;

    @ColumnWidth(30)
    @ExcelProperty(value = "分子用量", index = 7)
    private String numeratorDosage;

    @ColumnWidth(30)
    @ExcelProperty(value = "分母用量", index = 8)
    private String denominatorDosage;

    @ColumnWidth(30)
    @ExcelProperty(value = "固定损耗", index = 9)
    private String fixedLoss;

    @ColumnWidth(50)
    @ExcelProperty(value = "变动损耗率(%)", index = 10)
    private String changeLossRate;

    @ColumnWidth(40)
    @ExcelProperty(value = "发料考虑损耗", index = 11)
    private String issueConsiderLoss;

    @ColumnWidth(30)
    @ExcelProperty(value = "允许替代", index = 12)
    private String allowReplaceName;

    @ColumnWidth(30)
    @ExcelProperty(value = "领料方式", index = 13)
    private String pickingWay;

    @ColumnWidth(30)
    @ExcelProperty(value = "子项类型", index = 14)
    private String subType;
}
