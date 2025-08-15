package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 工艺路线-极简-导入对象
 * @author DING WEI
 * @date 2025/1/13 16:40
 * @version 1.0
 */
@Data
@ApiModel("工艺路线-极简-导入对象")
public class RouteExcelByMaterialVo {

    @ExcelIgnore
    private Integer index;

    @ColumnWidth(40)
    @ExcelProperty(value = "工艺路线分组", index = 0)
    private String routeGroupName;

    @ColumnWidth(40)
    @ExcelProperty(value = "物料名称", index = 1)
    private String materialName;

    @ColumnWidth(40)
    @ExcelProperty(value = "物料规格型号", index = 2)
    private String materialSpecs;

    @ExcelIgnore
    private String materialSign;

    @ColumnWidth(40)
    @ExcelProperty(value = "工序号", index = 3)
    private String processNo;

    @ColumnWidth(40)
    @ExcelProperty(value = "工序名称", index = 4)
    private String processName;

    @ColumnWidth(40)
    @ExcelProperty(value = "工序类型", index = 5)
    private String processType;

    @ColumnWidth(40)
    @ExcelProperty(value = "生产单元", index = 6)
    private String factoryModeName;

    @ColumnWidth(40)
    @ExcelProperty(value = "加工设备编码", index = 7)
    private String deviceCode;

    @ColumnWidth(40)
    @ExcelProperty(value = "标准工时", index = 8)
    private String standardTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "工时单价", index = 9)
    private String hourPrice;

    @ColumnWidth(40)
    @ExcelProperty(value = "准备时长", index = 10)
    private String prepareTime;

    @ColumnWidth(40)
    @ExcelProperty(value = "计件工资", index = 11)
    private String workPrice;

    @ColumnWidth(40)
    @ExcelProperty(value = "委外单价", index = 12)
    private String outsourcePrice;

    @ColumnWidth(40)
    @ExcelProperty(value = "备注", index = 13)
    private String remark;

}
