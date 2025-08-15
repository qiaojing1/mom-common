package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.lets.commons.easyexcel.entity.ExcelName;
import lombok.Data;

/**
 * 数据字典 导入导出对象
 *
 * @version 1.0
 * @ClassName DictExcelVo
 * @author: Qiao
 * @create: 2021/08/20 14:42
 **/
@Data
public class DictExcelVo {

    @ExcelIgnore
    private Integer order;

    @ColumnWidth(20)
    @ExcelProperty(value = "字典项名称")
    @ExcelName(names = {"字典项名称", "Dictionary Item Name","辞書アイテム名"})
    private String dictName;

    @ColumnWidth(15)
    @ExcelProperty(value = "字典项编码")
    @ExcelName(names = {"字典项编码", "Dictionary Entry Coding","辞書エントリのエンコーディング"})
    private String code;

    @ColumnWidth(30)
    @ExcelProperty(value = "字典项说明")
    @ExcelName(names = {"字典项说明", "Dictionary entry description","辞書項目の説明"})
    private String dictRemark;

    @ColumnWidth(15)
    @ExcelProperty(value = "是否默认")
    @ExcelName(names = {"是否默认", "Is Default","デフォルト"})
    private String defaultSelected;

    @ColumnWidth(15)
    @ExcelProperty(value = "是否启用")
    @ExcelName(names = {"是否启用", "Is it enabled","有効かどうか"})
    private String status;

    @ExcelIgnore
    private String dictType;

}
