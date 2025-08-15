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
 * 试验大纲-清单号
 * </p>
 *
 * @author csy
 * @since 2024-12-02
 */
@Getter
@Setter
@TableName("collection_test_synopsis_standard")
@ApiModel(value = "CollectionTestSynopsisStandard对象", description = "试验大纲-清单号")
public class CollectionTestSynopsisStandard extends BaseEntity {

    @ApiModelProperty("大纲Id")
    @TableField("synopsis_id")
    private String synopsisId;

    @ApiModelProperty("标准")
    @TableField("standard")
    private String standard;
}
