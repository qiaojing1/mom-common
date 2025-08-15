package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "采购单据-导入对象-基本信息", description = "采购订单")
public class PsiPurchaseOrderExcelTem1 {

    @ExcelIgnore
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "单据编号", index = 0)
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "单据类别", index = 1)
    private String orderCategoryName;

    @ColumnWidth(20)
    @ExcelProperty(value = "业务类型", index = 2)
    private String businessName;

    @ColumnWidth(20)
    @ExcelProperty(value = "订单日期", index = 3)
    private String orderTimeFormat;

    @ColumnWidth(30)
    @ExcelProperty(value = "订货供应商", index = 4)
    private String orderSupplierName;

    @ColumnWidth(20)
    @ExcelProperty(value = "作价模式", index = 5)
    private String pricingMode;

    @ColumnWidth(20)
    @ExcelProperty(value = "结算币种", index = 6)
    private String settlementCurrencyName;

    // 采购价目表
    @ColumnWidth(20)
    @ExcelIgnore
    private String priceListName;

    @ColumnWidth(20)
    @ExcelProperty(value = "采购部门", index = 7)
    private String purchaseOrgName;

    @ColumnWidth(20)
    @ExcelProperty(value = "采购员", index = 8)
    private String purchaseUserName;

    @ColumnWidth(50)
    @ExcelProperty(value = "备注", index = 9)
    private String remark;
}
