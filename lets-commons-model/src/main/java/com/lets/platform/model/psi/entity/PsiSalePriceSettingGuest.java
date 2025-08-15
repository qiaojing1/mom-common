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
 * 销售取价方案配置客户映照表
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-18
 */
@Getter
@Setter
@TableName("psi_sale_price_setting_guest")
@ApiModel(value = "PsiSalePriceSettingGuest对象", description = "销售取价方案配置客户映照表")
public class PsiSalePriceSettingGuest extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("setting_id")
    private String settingId;

    @ApiModelProperty("客户id or客户组id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("客户编码or客户组编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("客户名称or客户组名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("当前类型，0表示当前是客户，1表示当前是客户组")
    @TableField("guest_type")
    private Integer guestType;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;
}
