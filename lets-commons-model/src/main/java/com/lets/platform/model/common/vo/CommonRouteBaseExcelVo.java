package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 工艺路线-基本信息-导入对象
 * @author: DING WEI
 * @date: 2024/9/24 14:49
 */
@Data
@ApiModel("工艺路线-基本信息-导入对象")
public class CommonRouteBaseExcelVo {

    @ColumnWidth(40)
    @ExcelProperty(value = "工艺路线编码", index = 0)
    private String routeCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "工艺路线名称", index = 1)
    private String routeName;

    @ColumnWidth(40)
    @ExcelProperty(value = "工艺路线分组", index = 2)
    private String routeGroupCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "是否启用WIP仓库", index = 3)
    private String wipInventory;

    @ColumnWidth(40)
    @ExcelProperty(value = "生效日期", index = 4)
    private String effectiveTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "失效日期", index = 5)
    private String expiringTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "工艺适用范围", index = 6)
    private String typeName;

    @ColumnWidth(40)
    @ExcelProperty(value = "工艺路线类型", index = 7)
    private String routeTypeName;

    @ColumnWidth(40)
    @ExcelProperty(value = "关联产品物料编码", index = 8)
    private String materialCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "物料分组编码", index = 9)
    private String materialGroupCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "BOM版本", index = 10)
    private String bomVersion;

    @ColumnWidth(40)
    @ExcelProperty(value = "备注", index = 11)
    private String remark;

}
