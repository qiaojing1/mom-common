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

/**
 * <p>
 * 试压工单-试验大纲
 * </p>
 *
 * @author csy
 * @since 2024-10-23
 */
@Getter
@Setter
@TableName("collection_detect_order_synopsis")
@ApiModel(value = "CollectionDetectOrderSynopsis对象", description = "试压工单-试验大纲")
public class CollectionDetectOrderSynopsis extends BaseEntity {

    @ApiModelProperty("大纲id")
    @TableField("synopsis_id")
    private String synopsisId;

    @ApiModelProperty("工单号")
    @TableField("order_id")
    private String orderId;
}
