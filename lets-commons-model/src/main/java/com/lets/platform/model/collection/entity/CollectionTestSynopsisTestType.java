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
 * 试验大纲-试验类型
 * </p>
 *
 * @author csy
 * @since 2024-10-22
 */
@Getter
@Setter
@TableName("collection_test_synopsis_test_type")
@ApiModel(value = "CollectionTestSynopsisTestType对象", description = "试验大纲-试验类型")
public class CollectionTestSynopsisTestType extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("synopsis_id")
    private String synopsisId;

    @ApiModelProperty("阀门分类")
    @TableField("test_type")
    private String testType;
}
