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
 * 材料数据库
 * </p>
 *
 * @author csy
 * @since 2024-11-20
 */
@Getter
@Setter
@TableName("collection_material_base")
@ApiModel(value = "CollectionMaterialBase对象", description = "材料数据库")
public class CollectionMaterialBase extends BaseEntity {

    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("工装编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("材料名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("标准")
    @TableField("standard")
    private String standard;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    List<CollectionMaterialBaseDetail> detailList;
}
