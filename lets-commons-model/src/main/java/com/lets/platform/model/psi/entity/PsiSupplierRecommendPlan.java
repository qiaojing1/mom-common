package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.List;

/**
 * 供应商推荐方案
 * @author DING WEI
 * @since 2024-03-11
 */
@Getter
@Setter
@TableName("psi_supplier_recommend_plan")
@ApiModel(value = "PsiSupplierRecommendPlan对象", description = "供应商推荐方案")
public class PsiSupplierRecommendPlan extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @Length(max = 40, message = "PsiSupplierRecommendPlan.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ValidatedEnum(enumClass = IsOrNotEnum.class, message = "PsiSupplierRecommendPlan.allowManualEntry", groups = {Save.class, Update.class})
    @ApiModelProperty("允许人工录入[0否,1是]")
    @TableField("allow_manual_entry")
    private Integer allowManualEntry;
    @TableField(exist = false)
    private String allowManualEntryName;

    @ValidatedEnum(enumClass = IsOrNotEnum.class, message = "[限定货源清单供应商]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("限定货源清单供应商[0否,1是]")
    @TableField("limit_source_list_supplier")
    private Integer limitSourceListSupplier;
    @TableField(exist = false)
    private String limitSourceListSupplierName;

    @Length(max = 40, message = "PsiSupplierRecommendPlan.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("是否预设[0否1是]")
    @TableField("is_presets")
    private Integer isPresets;
    @TableField(exist = false)
    private String isPresetsName;

    @ApiModelProperty("评分价格占比，默认占比100%")
    @TableField("price_weight")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal priceWeight = new BigDecimal(100);

    @ApiModelProperty("交货及时率占比，默认占比0%")
    @TableField("delivery_timeliness_rate_weight")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal deliveryTimelinessRateWeight = BigDecimal.ZERO;

    @ApiModelProperty("合格率占比，默认占比0%")
    @TableField("qualified_rate_weight")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal qualifiedRateWeight = BigDecimal.ZERO;

    @ApiModelProperty("默认到货及时率")
    @TableField("default_timeliness_rate")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal defaultTimelinessRate = new BigDecimal(95);

    @ApiModelProperty("默认合格率")
    @TableField("default_qualified_rate")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal defaultQualifiedRate = new BigDecimal(100);

    @ApiModelProperty("推荐数量")
    @TableField("recommend_num")
    private Integer recommendNum = 10;

    @ApiModelProperty("统计周期")
    @TableField("statistical_cycle")
    private Integer statisticalCycle = 6;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<PsiSupplierRecommendPlanDetail> details;
}
