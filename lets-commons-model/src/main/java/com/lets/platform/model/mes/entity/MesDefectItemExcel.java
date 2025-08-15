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
public class MesDefectItemExcel {
    @ExcelIgnore
    private Integer index;

    @ExcelProperty("缺陷原因编码")
    private String defectCauseCode;
    @ExcelIgnore
    private String defectCauseId;
    @ExcelProperty("检验项目")
    private String inspectionItemCode;
    @ExcelIgnore
    private String inspectionItemId;

}
