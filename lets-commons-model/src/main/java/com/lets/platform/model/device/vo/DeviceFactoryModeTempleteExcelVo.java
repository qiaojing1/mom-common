package com.lets.platform.model.device.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.lets.commons.easyexcel.entity.ExcelName;
import lombok.Data;

/**
 * 工厂建模导出
 *
 * @version 1.0
 * @ClassName DeviceFactoryModeExcelVo
 * @author: Qiao
 * @create: 2021/08/21 10:20
 **/
@Data
public class DeviceFactoryModeTempleteExcelVo {
    @ExcelIgnore
    private String id;
    /**
     * 序号
     **/
    @ExcelIgnore
    private Integer order;
    @ColumnWidth(25)
    @ExcelProperty(value  = "生产单元名称")
    @ExcelName(names = {"生产单元名称","Production unit name","生産ユニット名"})
    private String modeName;

    @ColumnWidth(25)
    @ExcelProperty(value = "生产单元编码")
    @ExcelName(names = {"生产单元编码","Production unit code","せいさんユニットコーディング"})
    private String code;

    @ExcelIgnore
    private String modeType;

    @ColumnWidth(25)
    @ExcelProperty(value = "生产单元类型")
    @ExcelName(names = {"生产单元类型","Production unit type","製造単位タイプ"})
    private String modeTypeName;

    @ExcelIgnore
    private String parentModeCode;

    @ColumnWidth(25)
    @ExcelProperty(value = "上级生产单元")
    @ExcelName(names = {"上级生产单元","Superior production unit","上位生産ユニット"})
    private String parentModeName;

    @ExcelIgnore
    private String status;
    @ColumnWidth(15)
    @ExcelProperty(value = "状态")
    @ExcelName(names = {"状态","state","ステータス"})
    private String statusName;

    @ExcelIgnore
    private String managerUser;
    @ColumnWidth(15)
    @ExcelProperty(value = "负责人工号")
    @ExcelName(names = {"负责人工号","Responsible Labor Number","担当者番号"})
    private String managerUserName;

}
