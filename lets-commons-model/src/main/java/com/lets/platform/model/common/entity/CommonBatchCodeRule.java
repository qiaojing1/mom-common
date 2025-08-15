package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * <p>
 * 批号自动编码规则配置
 * </p>
 *
 * @author DING WEI
 * @since 2023-11-21
 */
@Getter
@Setter
@TableName("common_batch_code_rule")
@ApiModel(value = "CommonBatchCodeRule对象", description = "批号自动编码规则配置")
public class CommonBatchCodeRule extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;
    @ApiModelProperty("菜单编码")
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("表名")
    @TableField("table_name")
    private String tableName;
    @ApiModelProperty("表中文名")
    @TableField(exist = false)
    private String tableDisplayName;

    @ApiModelProperty("目标字段")
    @TableField("field")
    private String field;
    @ApiModelProperty("目标字段名称")
    @TableField(exist = false)
    private String fieldName;

    @ApiModelProperty("字段长度")
    @TableField("length")
    private Integer length;

    @ApiModelProperty("编码预览")
    @TableField("code_view")
    private String codeView;

    /**
     * @enum MaterialRangeEnum
     */
    @ApiModelProperty("适用物料范围 0:通用，2:物料分组")
    @TableField("suit_material_range")
    private String suitMaterialRange;
    @TableField(exist = false)
    private String suitMaterialRangeName;

    /**
     * @enum CustomerRangeEnum
     */
    @ApiModelProperty("适用客户范围,0:通用；1:客户；2:客户分组")
    @TableField("suit_customer_range")
    private String suitCustomerRange;
    @TableField(exist = false)
    private String suitCustomerRangeName;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    private Integer enable;
    @ApiModelProperty("是否启用名称")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("是否预设")
    @TableField("is_presets")
    private String isPresets;
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String isPresetsName;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<CommonBatchCodeRuleDetail> details;

    @ApiModelProperty("明细生成的流水表记录")
    @TableField(exist = false)
    private List<CommonBatchCodeRuleDetailSerialNumber> serialNumberList;

    @ApiModelProperty("适用范围列表")
    @TableField(exist = false)
    private List<CommonBatchCodeRuleRange> ranges;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private int priority;

    // 判断本次调用是否为生成序列号
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Boolean isSerial;

    // 判断本次调用是否为生成批号
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Boolean isBatch;

    // 判断本次调用是否为生成版本号
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Boolean isVersion;

    public String getIsPresets() {
        return StringUtils.isBlank(isPresets) ? "N" : isPresets;
    }
}
