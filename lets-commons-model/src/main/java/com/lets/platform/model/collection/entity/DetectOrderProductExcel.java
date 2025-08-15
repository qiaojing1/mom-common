package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.lets.platform.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 试压工单
 * </p>
 *
 * @author csy
 * @since 2024-02-20
 */
@Getter
@Setter
public class DetectOrderProductExcel extends BaseEntity {

    @ExcelIgnore
    private String sheetName;

    @ExcelIgnore
    private Integer rowIndex;

    @ExcelProperty("单据编号")
    private String code;

    @ExcelProperty("产品编号")
    private String productCode;
}
