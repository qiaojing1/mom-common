package com.lets.platform.model.tpm.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 巡检工单
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-17
 */
@Getter
@Setter
@ApiModel(value = "TpmInspectionProjectOrderExcelVo", description = "巡检工单")
public class TpmInspectionProjectOrderExcelVo extends BaseEntity {

    @ExcelProperty("工单编号")
    private String code;

    @ExcelProperty("巡检路线名称")
    private String routeName;
    /**
     * @see com.lets.platform.model.tpm.enums.ConfigCycle
     */
    @ExcelProperty("巡检周期")
    private String inspectionCycleName;

    @ExcelProperty("巡检人员")
    private String inspectUserName;

    @ExcelProperty("巡检时间")
    private String inspectionTime;
}
