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
 * 物流公司管理
 * </p>
 *
 * @author csy
 * @since 2025-06-06
 */
@Getter
@Setter
@TableName("psi_logistics_company")
@ApiModel(value = "PsiLogisticsCompany对象", description = "物流公司管理")
public class PsiLogisticsCompany extends BaseEntity {

    @ApiModelProperty("编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("api地址")
    @TableField("api")
    private String api;

    @ApiModelProperty("api密钥")
    @TableField("api_key")
    private String apiKey;

    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;
}
