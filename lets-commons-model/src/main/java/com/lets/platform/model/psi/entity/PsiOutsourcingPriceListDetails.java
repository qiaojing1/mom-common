package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 工序委外价目表明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-02-07
 */
@Getter
@Setter
@TableName("psi_outsourcing_price_list_details")
@ApiModel(value = "PsiOutsourcingPriceListDetails对象", description = "工序委外价目表明细")
public class PsiOutsourcingPriceListDetails extends BaseEntity {

    @ExcelProperty("价目表编码")
    @TableField(exist = false)
    private String priceListCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String priceListName;

    @ApiModelProperty("采购价目表ID")
    @ExcelIgnore
    @TableField("price_list_id")
    private String priceListId;

    @ApiModelProperty("行号")
    @ExcelIgnore
    @TableField("row_index")
    private Long rowIndex;

    @ApiModelProperty("物料编码ID")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    @ExcelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelIgnore
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    @ExcelIgnore
    private String materialSpecs;

    @ApiModelProperty("特征属性名称")
    @TableField("material_characteristic_names")
    @ExcelIgnore
    private String materialCharacteristicNames;

    @ApiModelProperty("采购计价单位ID")
    @TableField("unit_id")
    @ExcelIgnore
    private String unitId;

    @ApiModelProperty("采购计价单位code")
    @TableField("unit_code")
    @ExcelIgnore
    private String unitCode;

    @ApiModelProperty("采购计价单位名称")
    @TableField("unit_name")
    @ExcelProperty("计价单位")
    private String unitName;

    @ApiModelProperty("采购计价单位精度")
    @TableField("unit_accuracy")
    @ExcelIgnore
    private Integer unitAccuracy;

    @ApiModelProperty("采购计价单位舍入类型")
    @TableField("unit_round_off_type")
    @ExcelIgnore
    private String unitRoundOffType;

    @ApiModelProperty("单价")
    @TableField("price")
    @ExcelIgnore
    @ValidBigDecimal(min = "0",max = "9999999999.99",message = "[单价] 范围0-9999999999.99",groups = {Save.class, Update.class}, includeMin = true)
    private BigDecimal price;
    @ExcelProperty("单价")
    @TableField(exist = false)
    private String priceStr;

    @ApiModelProperty("含税单价")
    @TableField("including_tax_price")
    @ExcelIgnore
    @ValidBigDecimal(min = "0",max = "9999999999.99",message = "[含税单价] 范围0-9999999999.99",groups = {Save.class, Update.class}, includeMin = true)
    private BigDecimal includingTaxPrice;
    @ExcelProperty("含税单价")
    @TableField(exist = false)
    private String includingTaxPriceStr;

    @ApiModelProperty("税种id")
    @TableField("tax_id")
    @ExcelIgnore
    private String taxId;

    @ApiModelProperty("税种id")
    @TableField("tax_rate")
    @ExcelIgnore
    private BigDecimal taxRate;

    @ApiModelProperty("税种id")
    @TableField("tax_name")
    @ExcelProperty("税率")
    private String taxName;

    @ApiModelProperty("税种id")
    @TableField("tax_accuracy")
    @ExcelIgnore
    private Integer taxAccuracy;

    @ApiModelProperty("税种id")
    @TableField("tax_type")
    @ExcelIgnore
    private String taxType;

    @ApiModelProperty("委外工序编码")
    @TableField("outsourcing_process_code")
    @ExcelProperty("委外工序编码")
    private String outsourcingProcessCode;

    @ApiModelProperty("最低限价")
    @TableField("limit_price_low")
    @ExcelIgnore
    private BigDecimal limitPriceLow;
    @ExcelProperty("最低限价")
    @TableField(exist = false)
    private String limitPriceLowStr;

    @ApiModelProperty("最高限价")
    @TableField("limit_price_high")
    @ExcelIgnore
    private BigDecimal limitPriceHigh;
    @ExcelProperty("最高限价")
    @TableField(exist = false)
    private String limitPriceHighStr;

    @ApiModelProperty("委外工序id")
    @TableField("outsourcing_process_id")
    @ExcelIgnore
    private String outsourcingProcessId;

    @ApiModelProperty("委外工序名称")
    @TableField("outsourcing_process_name")
    @ExcelIgnore
    private String outsourcingProcessName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;
    @ExcelIgnore
    @TableField(exist = false)
    private String materialBasicUnitCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String concatKey;
    @ExcelIgnore
    @TableField(exist = false)
    private String limitType;

    @ApiModelProperty("生效日期")
    @TableField(exist = false)
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime effectiveTime;

    @ApiModelProperty("失效日期")
    @TableField(exist = false)
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expiringTime;

    @TableField(exist = false)
    @ExcelIgnore
    private List<PsiOutsourcingPriceListMaterialCharacteristic> materialCharacteristicList;
}
