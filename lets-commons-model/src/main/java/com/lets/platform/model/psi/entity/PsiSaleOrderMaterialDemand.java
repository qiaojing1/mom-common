package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
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

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 销售订单-物料明细-订单需求
 * @author DING WEI
 * @since 2024-06-24
 */
@Getter
@Setter
@TableName("psi_sale_order_material_demand")
@ApiModel(value = "PsiSaleOrderMaterialDemand对象", description = "销售订单-物料明细-订单需求")
public class PsiSaleOrderMaterialDemand extends BaseEntity {

    @ApiModelProperty("销售订单主键")
    @TableField("order_id")
    private String orderId;
    @TableField(exist = false)
    private String orderCode;
    @ApiModelProperty("单据类别名称")
    @TableField(exist = false)
    private String orderCategoryName;
    @TableField(exist = false)
    @ApiModelProperty("业务类型名称")
    private String businessName;
    @ApiModelProperty("单据日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField(exist = false)
    private LocalDateTime orderTime;
    @TableField(exist = false)
    private String orderTimeFormat;
    @ApiModelProperty("订货客户ID")
    @TableField(exist = false)
    private String orderCustomerId;
    @TableField(exist = false)
    @ApiModelProperty("订货客户Code")
    private String orderCustomerCode;
    @TableField(exist = false)
    @ApiModelProperty("订货客户名称")
    private String orderCustomerName;
    @TableField(exist = false)
    private String saleOrgId;
    @TableField(exist = false)
    @ApiModelProperty("销售部门名称")
    private String saleOrgName;
    @TableField(exist = false)
    private String saleOrgCode;
    @TableField(exist = false)
    @ApiModelProperty("销售员ID")
    private String saleUserId;
    @TableField(exist = false)
    @ApiModelProperty("销售员名称")
    private String saleUserName;
    @TableField(exist = false)
    private String saleUserCode;
    @TableField(exist = false)
    private String saleUserMobile;
    @TableField(exist = false)
    @ApiModelProperty("是否含税")
    private String taxIncluded;
    @TableField(exist = false)
    @ApiModelProperty("是否含税名称")
    private String taxIncludedName;
    @TableField(exist = false)
    @ApiModelProperty("作价模式")
    private String pricingMode;
    @TableField(exist = false)
    private String pricingModeName;
    @TableField(exist = false)
    @ApiModelProperty("交货期(天)")
    private Integer deliveryDay;
    @TableField(exist = false)
    @ApiModelProperty("明细上的交货期(天)")
    private Integer detailDeliveryDay;

    @ApiModelProperty("销售订单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("行号")
    @TableField(exist = false)
    private Long lineNumber;
    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;
    @TableField(exist = false)
    private String materialId;
    @ApiModelProperty("物料名称")
    @TableField(exist = false)
    private String materialName;
    @ApiModelProperty("规格型号")
    @TableField(exist = false)
    private String materialSpecs;
    @ApiModelProperty("特征属性")
    @TableField(exist = false)
    private String materialCharacteristicNames;
    @TableField(exist = false)
    private String contractOrderCode;
    @ApiModelProperty("备注")
    @TableField(exist = false)
    private String remark;
    @TableField(exist = false)
    private List<PsiSaleOrderMaterialCharacteristic> characteristics;
    @TableField(exist = false)
    private List<PsiSaleOrderMaterial> materialList;
    /**
     * 物料扩展规格属性
     */
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFl32;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlName12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlName13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlName14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlName15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlName16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlName17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlName18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlName19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlName20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlName21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlName22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlName23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlName24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlName25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlName26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlName27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlName28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlName29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlName30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlName31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlName32;
    @ApiModelProperty("扩展备注1")
    @TableField(exist = false)
    private String remark1;
    @ApiModelProperty("扩展备注2")
    @TableField(exist = false)
    private String remark2;
    @ApiModelProperty("技术需求")
    @TableField("technology_demand")
    private String technologyDemand;
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
    @ApiModelProperty("质量附件")
    @TableField("quality_enclosure_ids")
    private String qualityEnclosureIds;
    @TableField(exist = false)
    private List<String> qualityFileIds;
    @TableField(exist = false)
    private List<CommonFile> qualityEnclosureFileList;

    @ApiModelProperty("包装发运需求")
    @TableField("packaging_shipping_demand")
    private String packagingShippingDemand;
    @ApiModelProperty("包装发运附件")
    @TableField("packaging_shipping_enclosure_ids")
    private String packagingShippingEnclosureIds;
    @TableField(exist = false)
    private List<String> packagingShippingFileIds;
    @TableField(exist = false)
    private List<CommonFile> packagingShippingEnclosureFileList;

    @ApiModelProperty("抽样方式")
    @TableField("sample_type")
    private String sampleType;

    @ApiModelProperty("检验项目")
    @TableField("inspect_item_ids")
    @JsonSerialize(using = StringToStringArraySerializer.class)
    @JsonDeserialize(using = StringArrayToStringDeserialize.class)
    private String inspectItemIds;

    @ApiModelProperty("油漆方案")
    @TableField("painting_plan_id")
    private String paintingPlanId;

    @ApiModelProperty("其他需求")
    @TableField("other_demand")
    private String otherDemand;
    @ApiModelProperty("其他附件")
    @TableField("other_enclosure_ids")
    private String otherEnclosureIds;
    @TableField(exist = false)
    private List<String> otherFileIds;
    @TableField(exist = false)
    private List<CommonFile> otherEnclosureFileList;

    @ApiModelProperty("数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField(exist = false)
    private BigDecimal quantity;
    @ApiModelProperty("要货日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime needDate;
    @TableField(exist = false)
    private String needDateFormat;
}
