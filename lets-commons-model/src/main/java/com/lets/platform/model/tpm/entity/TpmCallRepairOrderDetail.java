package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 故障报修管理-明细
 * @author DING WEI
 * @since 2024-11-18
 */
@Getter
@Setter
@TableName("tpm_call_repair_order_detail")
@ApiModel(value = "TpmCallRepairOrderDetail对象", description = "故障报修管理-明细")
public class TpmCallRepairOrderDetail extends BaseEntity {

    @ApiModelProperty("工单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("故障编码")
    @TableField("fault_code")
    private String faultCode;

    @ApiModelProperty("故障内容")
    @TableField("fault_content")
    private String faultContent;
}
