package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @ClassName ProcessGroupExcelVo
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/11/8
 */
@Data
public class ProcessGroupExcelVo {

    @ExcelProperty("工序分组编码")
    private String processGroupCode;
    @ExcelProperty("工序编码")
    private String processCode;
    @ExcelProperty("工序名称")
    private String processName;
    @ExcelProperty("工序类型")
    private String processType;
    @ExcelProperty("检验类型")
    private String inspectType;
    @ExcelProperty("报工方式")
    private String reportWay;
}
