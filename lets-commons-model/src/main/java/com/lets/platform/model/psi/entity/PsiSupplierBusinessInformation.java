package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName PsiSupplierBussinessInfomation
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/7/27
 */
@Data
public class PsiSupplierBusinessInformation {

    @ExcelIgnore
    private Integer index;
    @ExcelIgnore
    private String sheetName;

    @ExcelProperty("供应商名称")
    private String supplierName;

    @ExcelProperty("法人代表")
    private String legalPerson;

    @ExcelProperty("开户银行")
    private String bankOfDeposit;

    @ExcelProperty("账号")
    private String bankAccount;

    @ExcelProperty("纳税号")
    private String taxId;

    @ExcelProperty("供应商电话")
    private String supplierPhone;

    @ExcelProperty("供应商地址")
    private String address;

    @ExcelProperty("经营范围")
    private String scopeOfBusiness;

}
