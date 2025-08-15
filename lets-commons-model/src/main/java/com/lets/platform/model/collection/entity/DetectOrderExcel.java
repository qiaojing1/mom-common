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
public class DetectOrderExcel extends BaseEntity {

    @ExcelIgnore
    private String sheetName;

    @ExcelIgnore
    private Integer rowIndex;

    @ExcelProperty("单据编号")
    private String code;

    @ExcelProperty("工单类型")
    private String typeName;

    @ExcelProperty("生产令号")
    private String lrpNo;

    @ExcelProperty("数量")
    private String number;

    @ExcelProperty("订单编号")
    private String orderCode;

    @ExcelProperty("行号")
    private String lineNumber;

    @ExcelProperty("图号")
    private String drawNo;

    @ExcelProperty("清单号")
    private String listNo;

    @ExcelProperty("客户")
    private String customerName;

    @ExcelProperty("工序名称")
    private String processName;

    @ExcelProperty("是否生成报告")
    private String isGenerateReport;

    @ExcelProperty("阀门类型")
    private String valveTypeName;

    @ExcelProperty("型号")
    private String model;

    @ExcelProperty("口径单位")
    private String caliberUnit;

    @ExcelProperty("口径")
    private String caliberValue;

    @ExcelProperty("压力单位")
    private String pressureUnit;

    @ExcelProperty("压力")
    private String pressureValue;

    @ExcelProperty("材质")
    private String valveMaterialName;

    @ExcelProperty("工况")
    private String workConditionName;

    @ExcelProperty("密封方式")
    private String sealMethodName;

    @ExcelProperty("阀杆直径（mm）")
    private String stemDiameter;

    @ExcelProperty("垫片外径（mm）")
    private String gasketOuterDiam;

    @ExcelProperty("额定容量（ml/m³）")
    private String nameplateCapacity;

    @ExcelProperty("设计扭矩（N*M）")
    private String torque;

    @ExcelProperty("有载扭矩（N*M）")
    private String loadedTorque;

    @ExcelProperty("空载扭矩（N*M）")
    private String unloadedTorque;

    @ExcelProperty("电装扭矩（N*M）")
    private String electricTorque;

    @ExcelProperty("最大压差（MPa）")
    private String maxPressureDiff;

    @ExcelProperty("设计温度（℃）")
    private String designTemperature;

    @ExcelProperty("压力标准")
    private String pressureStandardName;

    @ExcelProperty("试验类型")
    private String testTypeName;

    @ExcelProperty("试验标准")
    private String testStandardName;

    @ExcelProperty("泄漏等级")
    private String routineLeakageLevelName;

    @ExcelProperty("逸散性泄漏试验")
    private String isEscape;

    @ExcelProperty("逸散性泄漏试验试验标准")
    private String escapeTestStandardName;

    @ExcelProperty("逸散性泄漏试验密封方式")
    private String escapeSealTypeName;

    @ExcelProperty("逸散性泄漏试验泄漏等级")
    private String escapeLeakageLevelName;

    @ExcelProperty("动作试验")
    private String isMovement;

    @ExcelProperty("动作试验标准")
    private String movementTestStandardName;

    @ExcelProperty("编号固定值")
    private String fixedCode;

    @ExcelProperty("起始流水号")
    private String startSerialNum;

}
