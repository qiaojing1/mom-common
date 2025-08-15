/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.config.StringArrayToStringDeserialize;
import com.lets.platform.common.pojo.config.StringToStringArraySerializer;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 销售变更单-物料明细-订单需求
 * </p>
 *
 * @author csy
 * @since 2025-06-11
 */
@Getter
@Setter
@TableName("psi_sale_change_order_material_demand")
@ApiModel(value = "PsiSaleChangeOrderMaterialDemand对象", description = "销售变更单-物料明细-订单需求")
public class PsiSaleChangeOrderMaterialDemand extends BaseEntity {

    @ApiModelProperty("销售订单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("销售订单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("技术需求")
    @TableField("technology_demand")
    private String technologyDemand;
    @ApiModelProperty("技术需求")
    @TableField("before_technology_demand")
    private String beforeTechnologyDemand;

    @ApiModelProperty("技术附件")
    @TableField("technology_enclosure_ids")
    private String technologyEnclosureIds;
    @TableField(exist = false)
    private List<String> technologyFileIds;
    @TableField(exist = false)
    private List<CommonFile> technologyEnclosureFileList;

    @ApiModelProperty("质量需求")
    @TableField("quality_demand")
    private String qualityDemand;

    @ApiModelProperty("质量需求")
    @TableField("before_quality_demand")
    private String beforeQualityDemand;

    @ApiModelProperty("技术附件")
    @TableField("quality_enclosure_ids")
    private String qualityEnclosureIds;
    @TableField(exist = false)
    private List<String> qualityFileIds;
    @TableField(exist = false)
    private List<CommonFile> qualityEnclosureFileList;

    @ApiModelProperty("包装发运需求")
    @TableField("packaging_shipping_demand")
    private String packagingShippingDemand;
    @ApiModelProperty("包装发运需求")
    @TableField("before_packaging_shipping_demand")
    private String beforePackagingShippingDemand;

    @ApiModelProperty("包装发运附件")
    @TableField("packaging_shipping_enclosure_ids")
    private String packagingShippingEnclosureIds;
    @TableField(exist = false)
    private List<String> packagingShippingFileIds;
    @TableField(exist = false)
    private List<CommonFile> packagingShippingEnclosureFileList;

    @ApiModelProperty("其他需求")
    @TableField("other_demand")
    private String otherDemand;
    @ApiModelProperty("其他需求")
    @TableField("before_other_demand")
    private String beforeOtherDemand;

    @ApiModelProperty("其他附件")
    @TableField("other_enclosure_ids")
    private String otherEnclosureIds;
    @TableField(exist = false)
    private List<String> otherFileIds;
    @TableField(exist = false)
    private List<CommonFile> otherEnclosureFileList;

    @TableField("sample_type")
    private String sampleType;

    @ApiModelProperty("检验项目")
    @TableField("inspect_item_ids")
    @JsonSerialize(using = StringToStringArraySerializer.class)
    @JsonDeserialize(using = StringArrayToStringDeserialize.class)
    private String inspectItemIds;
}
