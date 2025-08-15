package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "采购单据明细-导入对象-物料明细")
public class PsiPurchaseOrderDetailExcelTemp {

    @ExcelIgnore
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty("物料编码")
    private String materialCode;

    @ColumnWidth(20)
    @ExcelProperty("采购单位")
    private String purchaseUnitName;

    @ColumnWidth(15)
    @ExcelProperty("数量")
    private String numberFormat;

    @ColumnWidth(20)
    @ExcelProperty("含税单价")
    private String includingTaxPriceFormat;

    @ColumnWidth(20)
    @ExcelProperty("税种")
    private String taxName;

    // 折扣率
    @ColumnWidth(20)
    @ExcelIgnore
    private String discountRateFormat;

    @ColumnWidth(20)
    @ExcelProperty("承诺日期")
    private String promiseDateFormat;

    @ColumnWidth(20)
    @ExcelProperty("交货地址")
    private String deliveryAddress;

    @ColumnWidth(20)
    @ExcelProperty("交货日期")
    private String deliveryDateFormat;

    @ColumnWidth(20)
    @ExcelProperty("项目编号")
    private String projectCode;

    @ColumnWidth(20)
    @ExcelProperty("合同编号")
    private String contractCode;

    @ColumnWidth(50)
    @ExcelProperty("备注")
    private String detailRemark;

}
