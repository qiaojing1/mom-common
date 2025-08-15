package com.lets.platform.model.tpm.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 保养工单
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-12
 */
@Getter
@Setter
@ApiModel(value = "TpmMaintenanceItemsOrderExcelVo", description = "保养工单")
public class TpmMaintenanceItemsOrderExcelVo extends BaseEntity {
    @ExcelProperty("工单编号")
    private String code;

    @ExcelProperty("设备名称")
    private String deviceName;
    /**
     * @see com.lets.platform.model.tpm.enums.ConfigCycle
     */
    @ExcelProperty("保养周期")
    private String inspectionCycleName;

    /**
     * @see com.lets.platform.model.tpm.enums.MaintenanceType
     */
    @ExcelProperty("保养类型")
    private String maintenanceTypeName;

    @ExcelProperty("保养人员")
    private String inspectUserName;

    @ExcelProperty("协助人员")
    private String assistUserNames;

    @ExcelProperty("保养时间")
    private String inspectionTime;
}
