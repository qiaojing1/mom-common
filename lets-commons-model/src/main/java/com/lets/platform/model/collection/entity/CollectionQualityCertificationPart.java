/*
 * csy
 */

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
 * 主要部件
 * </p>
 *
 * @author csy
 * @since 2024-11-26
 */
@Getter
@Setter
@TableName("collection_quality_certification_part")
@ApiModel(value = "CollectionQualityCertificationPart对象", description = "主要部件")
public class CollectionQualityCertificationPart extends BaseEntity {

    @ApiModelProperty("工单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("零部件Id")
    @TableField("part_id")
    private String partId;

    @ApiModelProperty("零部件名称")
    @TableField("part_name")
    private String partName;

    @ApiModelProperty("炉批号")
    @TableField("heat_batch_code")
    private String heatBatchCode;

    @ApiModelProperty("主要材质id")
    @TableField("material_base_id")
    private String materialBaseId;

    @ApiModelProperty("主要材质名称")
    @TableField("material_base_name")
    private String materialBaseName;

    @TableField(exist = false)
    private String heatBatchNoId;

    @TableField(exist = false)
    private List<CollectionHeatBatchNoDetail> columns;
}
