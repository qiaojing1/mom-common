package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 炉批号档案
 * </p>
 *
 * @author csy
 * @since 2024-11-25
 */
@Getter
@Setter
@TableName("collection_heat_batch_no")
@ApiModel(value = "CollectionHeatBatchNo对象", description = "炉批号档案")
public class CollectionHeatBatchNo extends BaseEntity {

    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("炉批号")
    @TableField("code")
    private String code;

    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("零部件名称")
    @TableField("part_name")
    private String partName;

    @ApiModelProperty("零部件名称ID")
    @TableField("part_id")
    private String partId;

    @ApiModelProperty("主要材质id")
    @TableField("material_base_id")
    private String materialBaseId;

    @ApiModelProperty("主要材质name")
    @TableField("material_base_name")
    private String materialBaseName;

    @ApiModelProperty("主要材质标准")
    @TableField(exist = false)
    private String materialBaseStandard;

    @TableField(exist = false)
    private CollectionMaterialBase materialBase;

    @TableField(exist = false)
    private String createTimeStr;

    @TableField(exist = false)
    private List<CollectionHeatBatchNoDetail> detailList;
}
