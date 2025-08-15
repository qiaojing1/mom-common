package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * BOM模板管理-明细-扩展规格属性
 * @author DING WEI
 * @since 2025-03-05
 */
@Getter
@Setter
@TableName("mes_bom_template_detail_esa")
@ApiModel(value = "MesBomTemplateDetailEsa对象", description = "BOM模板管理-明细-扩展规格属性")
public class MesBomTemplateDetailEsa extends BaseEntity {

    @ApiModelProperty("明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("扩展规格属性分类[FL1,FL32]")
    @TableField("ext_fl_code")
    private String extFlCode;
    @TableField("ext_fl_name")
    private String extFlName;

    @ApiModelProperty("父项扩展规格属性分类值[FL1,FL32]")
    @TableField("parent_fl_code")
    private String parentFlCode;
    @TableField("parent_fl_name")
    private String parentFlName;

    @ApiModelProperty("默认值主键[用户数据字典]")
    @TableField("default_value")
    private String defaultValue;
    @TableField("default_name")
    private String defaultName;
}
