package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName MesInspectionItemValueExcel
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/12/19
 */
@Data
public class MesInspectionItemValueExcel {
    @ExcelIgnore
    private Integer index;

    @ExcelProperty("项目编码")
    private String inspectionItemCode;
    @ExcelIgnore
    private String inspectionItemId;
    @ExcelProperty("检验值")
    private String inspectionValueCode;
    @ExcelIgnore
    private String inspectionValueId;

}
