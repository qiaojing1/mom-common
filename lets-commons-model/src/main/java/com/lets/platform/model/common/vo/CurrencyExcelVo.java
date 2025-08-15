package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.lets.commons.easyexcel.entity.ExcelName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 币种管理excelVo
 *
 * @version 1.0
 * @ClassName CurrencyExcelVo
 * @author: Qiao
 * @create: 2021/08/24 11:58
 **/
@Data
@ApiModel("币种管理excelVo")
public class CurrencyExcelVo {

    @ExcelIgnore
    private Integer order;
    @ColumnWidth(15)
    @ExcelName(names = {"币种名称", "Currency name","通貨名"})    //前面自己定义的注解
    @ExcelProperty(value = "币种名称")
    private String currencyName;

    @ColumnWidth(20)
    @ExcelProperty(value = "币种编码")
    @ExcelName(names = {"币种编码", "Currency code","通貨コード"})    //前面自己定义的注解
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "币种单位")
    @ExcelName(names = {"币种编码", "Currency unit","通貨単位"})
    private String currencyUnit;

    @ColumnWidth(15)
    @ExcelProperty(value = "单价小数位")
    @ExcelName(names = {"单价小数位", "Decimal Digits of Unit Price","単価小数位"})
    private String priceDecimalNum;

    @ColumnWidth(15)
    @ExcelProperty(value = "金额小数位")
    @ExcelName(names = {"金额小数位", "Decimal Digits of Amount","金額小数位"})
    private String amountDecimalNum;

    @ColumnWidth(15)
    @ExcelProperty(value = "汇率小数位")
    @ExcelName(names = {"汇率小数位", "Exchange rate decimal places","為替レート小数点以下"})
    private String exchangeRateDecimalNum;

    @ColumnWidth(15)
    @ExcelProperty(value = "成本单价小数位")
    @ExcelName(names = {"成本单价小数位", "Decimal places of cost unit price","コスト単価小数点以下"})
    private String costPriceDecimalNum;

    @ColumnWidth(15)
    @ExcelProperty(value = "成本金额小数位")
    @ExcelName(names = {"成本金额小数位", "Decimals of cost amount","コスト金額小数点以下"})
    private String costAmountDecimalNum;

    @ExcelIgnore
    private String status;

    @ColumnWidth(15)
    @ExcelProperty(value = "币种状态")
    @ExcelName(names = {"币种状态", "Currency Status","通貨ステータス"})
    private String statusName;
    @ColumnWidth(10)
    @ExcelProperty(value = "本位币")
    @ExcelName(names = {"本位币", "Base currency","機能通貨"})
    private String defaultSelectedName;
}
