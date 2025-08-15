package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 材质分组
 * </p>
 *
 * @author csy
 * @since 2024-01-08
 */
@Getter
@Setter
@TableName("collection_valve_material_group")
@ApiModel(value = "CollectionValveMaterialGroup对象", description = "材质分组")
public class CollectionValveMaterialGroup extends BaseEntity {

    @ApiModelProperty("标准")
    @TableField("standard_id")
    private String standardId;
    @TableField(exist = false)
    private String standardName;

    @ApiModelProperty("分组名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private List<CollectionValveMaterialGroup> children;

    @TableField(exist = false)
    private String parentId;

    @TableField(exist = false)
    private String code;

    @TableField(exist = false)
    private Integer existNum;

    @TableField(exist = false)
    private String level;
}
