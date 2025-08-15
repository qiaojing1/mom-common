package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "采购单据-导入对象-费用信息", description = "采购订单")
public class PsiPurchaseOrderExcelTem3 {

    @ExcelIgnore
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "单据编号", index = 0)
    private String code;

    @ColumnWidth(20)
    @ExcelIgnore
    private String exchangeRateName;

    /**
     * 单价含税
     */
    @ColumnWidth(20)
    @ExcelIgnore
    private String priceIncludedTaxName;

    @ColumnWidth(20)
    @ExcelProperty(value = "付款条件", index = 1)
    private String paymentConditionName;

    @ColumnWidth(20)
    @ExcelProperty(value = "结算方式", index = 2)
    private String settlementMethodName;

}
