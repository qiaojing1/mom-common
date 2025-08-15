package com.lets.platform.model.mes.entity;

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
 * 产品参数
 * </p>
 *
 * @author FZY
 * @since 2024-11-28
 */
@Getter
@Setter
@TableName("mes_production_param")
@ApiModel(value = "MesProductionParam对象", description = "产品参数")
public class MesProductionParam extends BaseEntity {

    @ApiModelProperty("功能")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("单据明细ID")
    @TableField("order_detail_id")
    private String orderDetailId;

    @ApiModelProperty("参数ID")
    @TableField(exist = false)
    private String paramId;

    @ApiModelProperty("参数编码")
    @TableField("param_code")
    private String paramCode;

    @ApiModelProperty("参数名称")
    @TableField(exist = false)
    private String paramName;

    @ApiModelProperty("参数值")
    @TableField("param_value")
    private String paramValue;

    @TableField(exist = false)
    private Integer valueType;

    @TableField(exist = false)
    private Integer required;
}
