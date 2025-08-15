package com.lets.platform.model.collection.vo.energy;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 点检工单
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-12
 */
@Getter
@Setter
@ApiModel(value = "TpmInspectionItemsOrderExcelVo", description = "点检工单")
public class CollEnergyPlanExcelVo extends BaseEntity {

    @ExcelProperty("计划日期")
    private String planDate;

    @ExcelProperty("区域名称")
    private String regionalName;

    @ExcelProperty("能源类型")
    private String energyTypeName;

    @ExcelProperty("用量")
    private String dosageStr;

    @ExcelProperty("金额")
    private String amountStr;

    @ExcelIgnore
    private Integer index;
}
