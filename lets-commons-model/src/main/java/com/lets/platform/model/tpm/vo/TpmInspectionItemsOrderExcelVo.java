package com.lets.platform.model.tpm.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.tpm.entity.TpmInspectionItemsOrderDetail;
import com.lets.platform.model.tpm.enums.SpotOrderStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
public class TpmInspectionItemsOrderExcelVo extends BaseEntity {

    @ExcelProperty("工单编号")
    private String code;

    @ExcelProperty("设备名称")
    private String deviceName;
    /**
     * @see com.lets.platform.model.tpm.enums.ConfigCycle
     */
    @ExcelProperty("点检周期")
    private String inspectionCycleName;

    @ExcelProperty("点检人员")
    private String inspectUserName;

    @ExcelProperty("协助人员")
    private String assistUserNames;

    @ExcelProperty("点检时间")
    private String inspectionTime;
}
