package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 销售取价方案配置详情表
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-18
 */
@Getter
@Setter
@TableName("psi_sale_price_setting_detail")
@ApiModel(value = "PsiSalePriceSettingDetail对象", description = "销售取价方案配置详情表")
public class PsiSalePriceSettingDetail extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("setting_id")
    private String settingId;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("取价顺序")
    @TableField("priority")
    private Integer priority;

    @ApiModelProperty("取价来源 （1.销售报价单 2.销售价目表 3.最近客户销售价 4.最近销售价 5.最近最低销售价）")
    @TableField("price_source")
    private String priceSource;

    @TableField(exist = false)
    private String priceSourceName;

    @ApiModelProperty("计算月数（例：当值为6时，意味着从创建单据当前日期向前查询6个月内的数据）")
    @TableField("counting_month")
    private Integer countingMonth;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;
}
