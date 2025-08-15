package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "采购单据-导入对象-物料明细", description = "采购订单物料明细")
public class PsiPurchaseOrderExcelTemp4 {

    @ExcelIgnore
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "单据编号", index = 0)
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "物料编码", index = 1)
    private String materialCode;

    @ColumnWidth(20)
    @ExcelProperty(value = "采购单位", index = 2)
    private String purchaseUnitName;

    @ColumnWidth(15)
    @ExcelProperty(value = "数量", index = 3)
    private String numberFormat;

    @ExcelProperty(value = "单价", index = 4)
    private String price;

    @ColumnWidth(20)
    @ExcelProperty(value = "含税单价", index = 5)
    private String includingTaxPriceFormat;

    @ExcelProperty(value = "金额", index = 6)
    private String amount;
    @ExcelProperty(value = "价税合计", index = 7)
    private String totalAmountIncludingTax;

    @ColumnWidth(20)
    @ExcelProperty(value = "税种", index = 8)
    private String taxName;

    // 折扣率
    @ColumnWidth(20)
    @ExcelIgnore
    private String discountRateFormat;

    @ColumnWidth(20)
    @ExcelProperty(value = "承诺日期", index = 9)
    private String promiseDateFormat;

    @ColumnWidth(20)
    @ExcelProperty(value = "交货地址", index = 10)
    private String deliveryAddress;

    @ColumnWidth(20)
    @ExcelProperty(value = "交货日期", index = 11)
    private String deliveryDateFormat;

    @ColumnWidth(20)
    @ExcelProperty(value = "项目编号", index = 12)
    private String projectCode;

    @ColumnWidth(20)
    @ExcelProperty(value = "合同编号", index = 13)
    private String contractCode;

    @ColumnWidth(50)
    @ExcelProperty(value = "备注", index = 14)
    private String detailRemark;

}
