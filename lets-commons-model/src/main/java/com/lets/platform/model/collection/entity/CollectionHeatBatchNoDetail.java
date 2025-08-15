package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 炉批号档案-列
 * </p>
 *
 * @author csy
 * @since 2024-11-25
 */
@Getter
@Setter
@TableName("collection_heat_batch_no_detail")
@ApiModel(value = "CollectionHeatBatchNoDetail对象", description = "炉批号档案-列")
public class CollectionHeatBatchNoDetail extends BaseEntity {

    @ApiModelProperty("材料数据库id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("类型：化学成分 机械性能")
    @TableField("type")
    private String type;

    @ApiModelProperty("成分/性能Id")
    @TableField("dict_id")
    private String dictId;

    @ApiModelProperty("成分/性能名称")
    @TableField("dict_name")
    private String dictName;

    @ApiModelProperty("最小值")
    @TableField("min_value")
    private String minValue;

    @ApiModelProperty("最大值")
    @TableField("max_value")
    private String maxValue;

    @ApiModelProperty("值")
    @TableField(exist = false)
    private String value;
}
