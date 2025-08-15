package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.base.businessEntity.BaseSerialEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * 销售订单明细关联序列号
 * </p>
 *
 * @author csy
 * @since 2025-07-22
 */
@Getter
@Setter
@TableName("psi_sale_order_detail_serial")
@ApiModel(value = "PsiSaleOrderDetailSerial对象", description = "销售订单明细关联序列号")
public class PsiSaleOrderDetailSerial extends BaseSerialEntity {

    @ApiModelProperty("订单明细表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料id")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    private String materialSpecific;

    @ApiModelProperty("序列号前缀")
    @TableField("prefix_serial")
    private String prefixSerial;

    @ApiModelProperty("序列号后缀流水")
    @TableField("suffix_serial")
    private String suffixSerial;

    @ApiModelProperty("完整序列号编码")
    @TableField("total_serial")
    private String totalSerial;

    @ApiModelProperty("编码规则id")
    @TableField("rule_id")
    private String ruleId;

    @ApiModelProperty("流水号类型的编码规则明细id")
    @TableField("rule_detail_id")
    private String ruleDetailId;

    @ApiModelProperty("流水号类型的编码规则明细流水id")
    @TableField("rule_detail_serial_id")
    private String ruleDetailSerialId;

    @ApiModelProperty("是否被分配给下游单据 Y:是，N:否")
    @TableField("is_used")
    private String isUsed;

    public Integer getSuffixSerialIntVal() {
        return StringUtils.isNotBlank(suffixSerial) ? Integer.parseInt(suffixSerial) : 0;
    }
}
