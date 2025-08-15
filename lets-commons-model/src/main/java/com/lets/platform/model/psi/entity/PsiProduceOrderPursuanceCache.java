package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * 生产工单-执行缓存(工位机)
 * @author DING WEI
 * @since 2025-03-10
 */
@Getter
@Setter
@TableName("psi_produce_order_pursuance_cache")
@ApiModel(value = "PsiProduceOrderPursuanceCache对象", description = "生产工单-执行缓存(工位机)")
public class PsiProduceOrderPursuanceCache extends BaseEntity {

    @ApiModelProperty("生产工单-单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("生产工单-单据编码")
    @TableField("order_code")
    private String orderCode;

    @NotBlank(message = "生产工单不能为空")
    @ApiModelProperty("生产工单-明细主键")
    @TableField("detail_id")
    private String detailId;

    @NotBlank(message = "工位机不能为空")
    @ApiModelProperty("工位机主键")
    @TableField("hmi_id")
    private String hmiId;

    /**
     * @see com.lets.platform.model.mes.enums.produceOrder.PursuanceRecordTypeEnum
     */
    @NotBlank(message = "类型不能为空")
    @ApiModelProperty("类型[1:生产配料、2:半成品生产、3:生产执行-开工报工、3-1:扫码上料、3-2:扫码执行、3-3:扫码装箱、4:扫码校验]")
    @TableField("type")
    private String type;

    @ApiModelProperty("扫码内容")
    @TableField("scan_code_content")
    private String scanCodeContent;

    @ApiModelProperty("扫码-码类型[1:物料条码2:周转箱码]")
    @TableField("scan_code_type")
    private String scanCodeType;

    @ApiModelProperty("扫码计数")
    @TableField("scan_count")
    private Long scanCount;
}
