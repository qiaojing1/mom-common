package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 生产工单-外部码(txt文件)
 * @author DING WEI
 * @since 2025-06-26
 */
@Getter
@Setter
@TableName("psi_produce_order_pursuance_ext_code_txt")
@ApiModel(value = "PsiProduceOrderPursuanceExtCodeTxt对象", description = "生产工单-外部码(txt文件)")
public class PsiProduceOrderPursuanceExtCodeTxt extends BaseEntity {

    @ApiModelProperty("类型标识, 0: 定时器触发存储， 1：人工报工触发存储")
    @TableField("type")
    private String type;

    @ApiModelProperty("工位机主键")
    @TableField("hmi_id")
    private String hmiId;

    @ApiModelProperty("工位机首个设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("txt文件")
    @TableField("txt_file")
    private byte[] txtFile;
}
