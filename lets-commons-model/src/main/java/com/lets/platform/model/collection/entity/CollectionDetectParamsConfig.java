package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 试压参数配置
 * </p>
 *
 * @author csy
 * @since 2024-08-06
 */
@Getter
@Setter
@TableName("collection_detect_params_config")
@ApiModel(value = "CollectionDetectParamsConfig对象", description = "试压参数配置")
public class CollectionDetectParamsConfig extends BaseEntity {

    @ApiModelProperty("试压参数")
    @TableField("code")
    private String code;
    @ApiModelProperty("试压参数")
    @TableField("name")
    private String name;

    @ApiModelProperty("字段来源")
    @TableField("source")
    private String source;
    @ApiModelProperty("字段来源")
    @TableField("source_name")
    private String sourceName;

    @ApiModelProperty("字段")
    @TableField("value_source")
    private String valueSource;
    @ApiModelProperty("字段")
    @TableField("value_source_name")
    private String valueSourceName;

    @ApiModelProperty("备注")
    @TableField(value = "remark",updateStrategy = FieldStrategy.IGNORED)
    private String remark;
}
