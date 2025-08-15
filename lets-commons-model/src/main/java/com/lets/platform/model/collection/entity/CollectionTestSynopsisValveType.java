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
 * 试验大纲-阀门类型
 * </p>
 *
 * @author csy
 * @since 2024-10-22
 */
@Getter
@Setter
@TableName("collection_test_synopsis_valve_type")
@ApiModel(value = "CollectionTestSynopsisValveType对象", description = "试验大纲-阀门类型")
public class CollectionTestSynopsisValveType extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("synopsis_id")
    private String synopsisId;

    @ApiModelProperty("阀门类型")
    @TableField("valve_type")
    private String valveType;
}
