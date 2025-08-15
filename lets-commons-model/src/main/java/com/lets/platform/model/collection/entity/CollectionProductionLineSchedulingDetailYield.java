package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 产线计划编制表明细产量
 * </p>
 *
 * @author FZY
 * @since 2025-06-12
 */
@Getter
@Setter
@TableName("collection_production_line_scheduling_detail_yield")
@ApiModel(value = "CollectionProductionLineSchedulingDetailYield对象", description = "产线计划编制表明细产量")
public class CollectionProductionLineSchedulingDetailYield extends BaseEntity {

    @ApiModelProperty("产线计划编制表ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("产线计划编制表明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("生产数量")
    @TableField("quantity")
    private Integer quantity;

    @ApiModelProperty("日期")
    @TableField("date")
    private LocalDateTime date;
}
