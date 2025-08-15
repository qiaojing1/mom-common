package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 条码规则配置
 * </p>
 *
 * @author FZY
 * @since 2024-10-21
 */
@Getter
@Setter
@TableName("common_barcode_rule")
@ApiModel(value = "CommonBarcodeRule对象", description = "条码规则配置")
public class CommonBarcodeRule extends BaseEntity {

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    /**
     * @see com.lets.platform.model.common.enums.BarcodeRuleTypeEnum
     */
    @ApiModelProperty("类型[1:条码生成;2:条码解析]")
    @TableField("type")
    private String type;

    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("适用类型[0:通用;1:物料;2:物料分组]")
    @TableField("scope")
    private String scope;

    @TableField(exist = false)
    private String scopeName;

    /**
     * @see com.lets.platform.model.common.enums.BarcodeRuleMenuEnum
     */
    @ApiModelProperty("解析菜单[0:生产配料,1:扫单执行,2:扫单收货,3:生产备料,4:扫码调拨]")
    @TableField("menu")
    private String menu;

    @ApiModelProperty("解析方案[1:定长;2:不定长]")
    @TableField("parse_type")
    private String parseType;

    @ApiModelProperty("分隔符")
    @TableField("delimiter")
    private String delimiter;

    @ApiModelProperty("字段长度")
    @TableField("length")
    private Integer length;

    @ApiModelProperty("编码预览")
    @TableField("code_view")
    private String codeView;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("生产单元")
    @TableField("production_unit_id")
    private String productionUnitId;

    @ApiModelProperty("生产单元名称")
    @TableField("production_unit_name")
    private String productionUnitName;

    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private List<CommonBarcodeRuleDetail> detailList;

    @ApiModelProperty("适用范围列表")
    @TableField(exist = false)
    private List<CommonBarcodeRuleRange> rangeList;
}
