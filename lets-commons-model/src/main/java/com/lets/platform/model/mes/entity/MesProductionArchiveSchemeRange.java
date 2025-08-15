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
 * 产品档案方案范围
 * </p>
 *
 * @author FZY
 * @since 2024-11-26
 */
@Getter
@Setter
@TableName("mes_production_archive_scheme_range")
@ApiModel(value = "MesProductionArchiveSchemeRange对象", description = "产品档案方案范围")
public class MesProductionArchiveSchemeRange extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("范围类型[0:物料;1:物料分组;2:客户;3客户分组]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("值")
    @TableField("value")
    private String value;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @TableField("specs")
    private String specs;
}
