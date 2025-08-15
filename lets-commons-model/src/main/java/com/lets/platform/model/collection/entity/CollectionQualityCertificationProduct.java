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
 * 产品列表
 * </p>
 *
 * @author csy
 * @since 2025-05-21
 */
@Getter
@Setter
@TableName("collection_quality_certification_product")
@ApiModel(value = "CollectionQualityCertificationProduct对象", description = "产品列表")
public class CollectionQualityCertificationProduct extends BaseEntity {

    @ApiModelProperty("产品编号")
    @TableField("product_code")
    private String productCode;

    @ApiModelProperty("工单id")
    @TableField("order_id")
    private String orderId;
}
