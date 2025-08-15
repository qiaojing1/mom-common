package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "采购单据-导入对象-供应商信息", description = "采购订单")
public class PsiPurchaseOrderExcelTem2 {

    @ExcelIgnore
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "单据编号", index = 0)
    private String code;

    @ColumnWidth(30)
    @ExcelProperty(value = "供货供应商", index = 1)
    private String supplySupplierName;

    @ColumnWidth(30)
    @ExcelProperty(value = "结算供应商", index = 2)
    private String settlementSupplierName;

    @ColumnWidth(30)
    @ExcelProperty(value = "收款供应商", index = 3)
    private String collectionSupplierName;

}
