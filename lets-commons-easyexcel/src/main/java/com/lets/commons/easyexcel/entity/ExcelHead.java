package com.lets.commons.easyexcel.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 岗位表
 * </p>
 *
 * @author DING WEI
 * @since 2023-06-20
 */
@Getter
@Setter
public class ExcelHead {

    @ExcelProperty(value = "ABCDABCD")
    private String c1;

    @ExcelProperty(value = "abcdabcd")
    private String c2;

    @ExcelProperty(value = "!@#$%^&*")
    private String c3;

    @ExcelProperty(value = "12345678")
    private String c4;

    @ExcelProperty(value = "上级岗位上级岗位")
    private String c5;

}
