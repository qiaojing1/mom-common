package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 生产工单-物料明细-生产要求
 * @author DING WEI
 * @since 2025-05-19
 */
@Getter
@Setter
@TableName("mes_produce_order_detail_demand")
@ApiModel(value = "MesProduceOrderDetailDemand对象", description = "生产工单-物料明细-生产要求")
public class MesProduceOrderDetailDemand extends BaseEntity {

    @ApiModelProperty("生产工单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("生产工单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("技术要求")
    @TableField("technology_demand")
    private String technologyDemand;
    @ApiModelProperty("技术附件")
    @TableField("technology_enclosure_ids")
    private String technologyEnclosureIds;
    @TableField(exist = false)
    private List<String> technologyFileIds;
    @TableField(exist = false)
    private List<CommonFile> technologyEnclosureFileList;

    @ApiModelProperty("质量要求")
    @TableField("quality_demand")
    private String qualityDemand;
    @ApiModelProperty("质量附件")
    @TableField("quality_enclosure_ids")
    private String qualityEnclosureIds;
    @TableField(exist = false)
    private List<String> qualityFileIds;
    @TableField(exist = false)
    private List<CommonFile> qualityEnclosureFileList;

    @ApiModelProperty("包装要求")
    @TableField("packaging_shipping_demand")
    private String packagingShippingDemand;
    @ApiModelProperty("包装附件")
    @TableField("packaging_shipping_enclosure_ids")
    private String packagingShippingEnclosureIds;
    @TableField(exist = false)
    private List<String> packagingShippingFileIds;
    @TableField(exist = false)
    private List<CommonFile> packagingShippingEnclosureFileList;

    @ApiModelProperty("其他要求")
    @TableField("other_demand")
    private String otherDemand;
    @ApiModelProperty("其他附件")
    @TableField("other_enclosure_ids")
    private String otherEnclosureIds;
    @TableField(exist = false)
    private List<String> otherFileIds;
    @TableField(exist = false)
    private List<CommonFile> otherEnclosureFileList;
}
