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
 * 检验项目-限定检验值
 * </p>
 *
 * @author csy
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("mes_inspection_items_values")
@ApiModel(value = "MesInspectionItemsValues对象", description = "检验项目-限定检验值")
public class MesInspectionItemsValues extends BaseEntity {

    @ApiModelProperty("检验项目id")
    @TableField("inspection_item_id")
    private String inspectionItemId;

    @ApiModelProperty("检验值id")
    @TableField("inspection_value_id")
    private String inspectionValueId;

    @TableField(exist = false)
    private String inspectionValueCode;
    @TableField(exist = false)
    private String inspectionValueName;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String inspectionItemCode;
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String inspectionItemName;
}
