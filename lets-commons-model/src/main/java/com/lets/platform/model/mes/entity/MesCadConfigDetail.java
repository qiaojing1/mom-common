package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * CAD提取配置-明细
 * @author DING WEI
 * @since 2025-04-07
 */
@Getter
@Setter
@TableName("mes_cad_config_detail")
@ApiModel(value = "MesCadConfigDetail对象", description = "CAD提取配置-明细")
public class MesCadConfigDetail extends BaseEntity {

    @ApiModelProperty("配置主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("图纸属性")
    @TableField("draw_attr")
    private String drawAttr;

    /**
     * @see com.lets.platform.model.mes.enums.CadA3FieldEnum
     */
    @ApiModelProperty("A3字段")
    @TableField("a3_field")
    private String a3Field;
    @TableField(exist = false)
    private String a3FieldName;

    @ApiModelProperty("是否关键属性[0:否,1:是][根据选择的属性匹配父子BOM关系]")
    @TableField("key_attr")
    private Integer keyAttr;

    @ApiModelProperty("是否物料匹配属性[0:否,1:是][根据选择的属性组合匹配物料档案]")
    @TableField("material_match_attr")
    private Integer materialMatchAttr;

    @ApiModelProperty("是否校验[0:否,1:是][根据勾选属性匹配是否为相同BOM]")
    @TableField("check_attr")
    private Integer checkAttr;

    /**
     * @see com.lets.platform.model.mes.enums.CadA3FieldTypeEnum
     */
    @ApiModelProperty("字段类型[1:主物料,2:子项物料]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;
}
